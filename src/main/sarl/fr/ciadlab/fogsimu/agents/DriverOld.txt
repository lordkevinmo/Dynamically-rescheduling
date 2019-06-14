/*
 * $Id$
 * 
 * Copyright (C) 2012
 *               Transport Research Institute (IMOB),
 *               Laboratoire Systemes et Transports (IRTES-SET).
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information
 * of the Transport Research Institute (IMOB) and the
 * Laboratoire Systemes et Transports (IRTES-SET) of
 * the Institut de Recherche Transport Ernergie Société.
 * You shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement
 * refered as NDA-MULTIAGEN-SET-IRTES-2012.
 * Contact for IMOB: Prof. dr. Davy JANSSENS.
 * Contact for IRTES-SET: Dr. Stephane GALLAND.
 */
package fr.ciadlab.fogsimu.agents;

import org.arakhne.afc.simulation.framework.framework1d.agents.path.IddlePathSolver;
import org.arakhne.afc.simulation.framework.framework1d.agents.path.PathSolver;
import org.arakhne.afc.simulation.framework.framework1d.agents.speed.IDMSpeedSolver;
import org.janusproject.kernel.crio.role.RoleActivationPrototype;
import org.janusproject.kernel.status.Status;
import org.janusproject.kernel.status.StatusFactory;

import be.uhasselt.imob.carpooling.agent.CarpoolingAgentMemoryCell;
import be.uhasselt.imob.carpooling.environment.Environment;
import be.uhasselt.imob.carpooling.kernel.time.CarpoolingTimeManager;
import be.uhasselt.imob.carpooling.kernel.time.NextTripTimeArrived;
import be.uhasselt.imob.carpooling.kernel.time.Time;
import be.uhasselt.imob.carpooling.schedule.TimeWindow;
import be.uhasselt.imob.carpooling.schedule.Trip;
import be.uhasselt.imob.carpooling.util.SimulationLogger;
import be.uhasselt.imob.carpooling.util.SimulationParameters;
import fr.utbm.set.geom.bounds.bounds1d5.Bounds1D5;
import fr.utbm.set.geom.object.Direction1D;
import fr.utbm.set.geom.object.Point1D5;
import fr.utbm.set.geom.object.Segment1D;
import fr.utbm.set.geom.transform.Transform1D5;
import fr.utbm.set.gis.road.path.RoadPath;
import fr.utbm.set.gis.road.primitive.RoadConnection;
import fr.utbm.set.gis.road.primitive.RoadNetwork;
import fr.utbm.set.gis.road.primitive.RoadSegment;
import fr.utbm.set.jasim.JasimConstants;
import fr.utbm.set.jasim.environment.interfaces.body.influences.DefaultInfluence1D5;
import fr.utbm.set.jasim.environment.interfaces.body.influences.Influence1D5;
import fr.utbm.set.jasim.environment.interfaces.body.influences.InfluenceApplicationStatus;
import fr.utbm.set.jasim.environment.interfaces.body.perceptions.GroundPerception1D5;
import fr.utbm.set.jasim.environment.interfaces.body.perceptions.Perception1D5;
import fr.utbm.set.jasim.environment.interfaces.body.perceptions.Perceptions;
import fr.utbm.set.jasim.janus.agent.SituatedRole;
import fr.utbm.set.jasim.janus.capacity.EnvironmentInfluenceResultCapacity.InfluenceStatus;

/**
 * This class describes the role of driver in a situated environment composed of
 * roads.
 * 
 * @author $Author: sgalland$
 * @author $Author: lhenry$
 * @author $Author: fguiot$
 * @version $FullVersion$
 * @mavengroupid $GroupId$
 * @mavenartifactid $ArtifactId$
 */
@RoleActivationPrototype(fixedParameters = { Trip.class, TimeWindow.class, SimulationParameters.class })
public class DriverOld extends SituatedRole<Influence1D5<RoadSegment>, Perception1D5> {

    private SimulationParameters simulationParameters = null;

    private Trip trip;
    private RoadPath path;

    private TimeWindow timeWindow;
    private Time tripStartedAt;

    private IDMSpeedSolver speedSolver;
    private PathSolver pathSolver = new IddlePathSolver();

    /**
     * {@inheritDoc}
     */
    @Override
    public Status activate(Object... params) {
        this.trip = (Trip) params[0];
        this.timeWindow = (TimeWindow) params[1];
        this.simulationParameters = (SimulationParameters) params[2];
        TimeWindow tw = this.timeWindow;
        if (tw == null) tw = this.trip.getTimeWindow();
        NextTripTimeArrived condition = new NextTripTimeArrived(tw.preferredStart);
        sleep(condition);
        return super.activate(params);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Status live() {
        CarpoolingTimeManager tm = (CarpoolingTimeManager) this.getSimulationClock();

        // Ensure that the agent has a body.
        if (tm == null || getBodyIdentifier() == null)
            return null;

        // Test if it's time to start
        // If not, then this.tripStartedAt is null
        if (this.tripStartedAt == null) {
            TimeWindow tw = this.timeWindow;

            if (tw == null)
                tw = this.trip.getTimeWindow();

            if (tw == null) {
                // We have no target
                this.print("No time window for activity: " + this.getMemorizedData(CarpoolingAgentMemoryCell.ACTIVITY.name()));
                this.leaveMe();
            } else {
                Time t = tw.preferredStart;
                Time c = tm.getWeekTime();
                if (c.compareTo(t) >= 0) {
                    this.tripStartedAt = c.clone();
                    this.print("Start the trip for " + tw); //$NON-NLS-1$
                }
            }
        }

        // If it is past time to start
        if (this.tripStartedAt != null) {
            // Test if the road path is empty.
            if (this.path == null) {
                if (!this.computePath()) {
                    this.leaveMe();

                    return StatusFactory.warning(this, "Path does not exist");
                }
            }
            
            InfluenceStatus influenceStatus = this.getLastInfluenceStatus();
            if (influenceStatus != null && influenceStatus.STATUS != InfluenceApplicationStatus.SUCCESS) {
                this.print("the influence previously sent by this agent was not correctly applied: " + influenceStatus);
            }

            Point1D5 currentPosition = this.getPosition1D5();
            assert currentPosition != null : "invalid currentPosition";
            assert currentPosition.getSegment() != null : "invalid segment for currentPosition, should not be null in 1D5";

            Segment1D currentSegment = currentPosition.getSegment();
            RoadSegment currentRoadSegment  = this.path.get(0);
            
            //Object currlolAttribute = currentRoadSegment.getAttributeObject("lol");
            //currentRoadSegment.
            
            
            Point1D5 destinationPosition = this.trip.getDestination().getGISPosition();
            assert destinationPosition != null : "invalid destinationPosition";

            // Test if the position of the vehicle is on the planned path
            int index = this.path.indexOf(currentPosition.getSegment());
            assert index != -1 : "invalid position on the path, index=" + index; //$NON-NLS-1$
            assert currentPosition.getCurvilineCoordinate() >= 0.0 : String.format("invalid position on the path, x=%f, [0;%f]",
                    currentPosition.getCurvilineCoordinate(), currentPosition.getSegment().getLength());
            assert currentPosition.getCurvilineCoordinate() <= currentPosition.getSegment().getLength() : String.format(
                    "invalid position on the path, x=%f, [0;%f]", currentPosition.getCurvilineCoordinate(), currentPosition.getSegment()
                            .getLength());

            // Test if we reached the target
            // Use a 2D distance to avoid problem of distance computation on the graph.
            //TODO: the driver decelerate when it arrive on a segment => stop to early, before arriving at the destination
            //if ((this.path==null || this.path.size()==1)&&
            //	currentPosition.toPoint2D().distance(destinationPosition.toPoint2D()) < this.simulationParameters.getVehicleArrivingDistance()) {
            if (this.path==null || this.path.size()==1 ||
                currentPosition.toPoint2D().distance(destinationPosition.toPoint2D()) < this.simulationParameters.getVehicleArrivingDistance()) {
                double travelTime = tm.getWeekTime().distance(this.tripStartedAt);

                // We have reached the target
                this.print("Destination Reached --- Start -------------------------------------------------");
                this.print("Travel time = " + travelTime); //$NON-NLS-1$
                this.print("Distance = " + currentPosition.distanceCurviline(destinationPosition));
                this.print("Destination Reached --- End   -------------------------------------------------");
                this.putMemorizedData(CarpoolingAgentMemoryCell.TRAVEL_TIME.name(), travelTime);
                this.leaveMe();
            } else {
                // We have not yet reached the target
                this.print("Live --- Start ----------------------------------------------------------------");

                if (this.speedSolver == null) {
                    Bounds1D5<?> bounds = this.getBounds1D5();
                    assert bounds != null;

                    double maxLinearSpeed = this.getMaxLinearSpeed();
                    assert maxLinearSpeed != Double.NaN;

                    double maxLinearAcceleration = this.getMaxLinearAcceleration();
                    assert maxLinearAcceleration != Double.NaN;

                    double maxLinearDeceleration = this.getMaxLinearDeceleration();
                    assert maxLinearDeceleration != Double.NaN;

                    this.speedSolver = new IDMSpeedSolver(this.path, bounds, maxLinearSpeed, maxLinearAcceleration, maxLinearDeceleration,
                            JasimConstants.DEFAULT_MINIMAL_DISTANCE_BETWEEN_VEHICLES, JasimConstants.DEFAULT_HUMAN_REACTION_TIME);
                }

                Direction1D currentDirection = this.getPathDirection();
                assert currentDirection != null;

                Perceptions<Perception1D5> perceptions = this.getPerceptions();
                assert perceptions != null;

                // delete previous segments, eventually insert following
                // segments
                if (this.pathSolver.updatePath(this.path, this.getPosition1D5(),
                        GroundPerception1D5.class.cast(perceptions.getGroundPerception()), this.getViewDirection1D5())) {
                	if (!this.path.isEmpty()) {
                		SimulationLogger.logPath(getAddress().toString(), this.path.getFirstSegment(), tm.getWeekTime());
                	}
                }

                double currentSpeed = this.getLinearSpeed();
                assert currentSpeed != Double.NaN;

                double acceleration = this.speedSolver.computeAcceleration(perceptions, currentPosition, currentDirection, currentSpeed,
                        destinationPosition);
                
                assert(!Double.isNaN(acceleration));

                Transform1D5<RoadSegment> transform = new Transform1D5<RoadSegment>(this.path, currentDirection, acceleration, 0.0);
                DefaultInfluence1D5<RoadSegment> influence = new DefaultInfluence1D5<RoadSegment>(transform);

                this.print("Path = " + this.path);
                this.print("Current position = " + currentPosition);
                this.print("Current direction = " + currentDirection);
                this.print("Current speed = " + currentSpeed);
                this.print("Desired speed = " + this.speedSolver.desiredSpeed);
                this.print("Obstacle speed = " + this.speedSolver.obstacleSpeed);
                this.print("Obstacle distance = " + this.speedSolver.obstacleDistance);
                this.print("Max acceleration = " + this.getMaxLinearAcceleration());
                this.print("Max deceleration = " + this.getMaxLinearDeceleration());
                this.print("Minimal distance = " + JasimConstants.DEFAULT_MINIMAL_DISTANCE_BETWEEN_VEHICLES);
                this.print("Reaction time = " + JasimConstants.DEFAULT_HUMAN_REACTION_TIME);
                this.print("Radius of turn = " + this.speedSolver.radiusOfTurn);
                this.print("IDM s = " + this.speedSolver.idmS);
                this.print("Acceleration (before clamp) = " + this.speedSolver.acceleration);
                this.print("Acceleration (after  clamp) = " + acceleration);
                this.print("Destination position = " + this.trip.getDestination().getGISPosition());
                this.print("Destination distance = " + currentPosition.distanceCurviline(destinationPosition));

                this.influence(influence);

                // influence(new DefaultInfluence1D5<RoadSegment>(
                // new Transform1D5<RoadSegment>(this.path, 1f, 0f)));

                this.print("Live --- End   ----------------------------------------------------------------");
            }
        }

        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Status end() {
        this.path = null;
        removeMemorizedData(CarpoolingAgentMemoryCell.PATH.name());
        return super.end();
    }

    private Direction1D getPathDirection() {
        if (this.path.isEmpty())
            return null;

        RoadConnection startCon = this.path.getFirstPoint();
        RoadSegment startSeg = this.path.getFirstSegment();

        if (startCon.equals(startSeg.getBeginPoint()))
            return Direction1D.SEGMENT_DIRECTION;
        else
            return Direction1D.REVERTED_DIRECTION;
    }

    /**
     * Compute the path to follow
     * 
     * @return path null if could not compute
     */
    private boolean computePath() {
        this.print("Compute Path --- Start --------------------------------------------------------");

        RoadNetwork roadNetwork = ((Environment) this.getMemorizedData(CarpoolingAgentMemoryCell.ENVIRONMENT.name())).getRoadNetwork();

        this.path = this.trip.getRoadPath(roadNetwork);

        // TODO : correct bug in A-Star, done by Galland
        if (this.path.getFirstSegment() != this.trip.getSource().getGISPosition().getSegment()) {
            this.print("Invert Path --- Start ---------------------------------------------------------");
            this.print("Trip start = " + this.trip.getSource().getGISPosition());
            this.print("Trip end = " + this.trip.getDestination().getGISPosition());
            this.print("Path = " + this.path);
            this.print("Invert Path --- End   ---------------------------------------------------------");
            this.path.invert();
        }

        Direction1D direction = this.getViewDirection1D5();
        Direction1D pathDirection = this.getPathDirection();

        if (pathDirection == null) {
            assert true : "Should not be here?";
            // this.path.add(0, (RoadSegment)
            // this.getPosition1D5().getSegment());
            // pathDirection = direction;
        } else if (direction.isSegmentDirection() != pathDirection.isSegmentDirection()) {
            this.path.add(0, this.path.getFirstSegment());
        }

        this.print("Current Position = " + this.getPosition1D5());
        this.print("Trip start = " + this.trip.getSource().getGISPosition());
        this.print("Trip end = " + this.trip.getDestination().getGISPosition());
        this.print("Path = " + this.path);

        this.print("Compute Path --- End   --------------------------------------------------------");

        this.putMemorizedData(CarpoolingAgentMemoryCell.PATH.name(), this.path);

        if (this.path.isEmpty()) {
            this.print("No path to follow"); //$NON-NLS-1$
            return false;
        }

        return true;
    }

}
