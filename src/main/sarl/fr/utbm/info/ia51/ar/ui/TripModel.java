package fr.utbm.info.ia51.ar.ui;

import fr.utbm.info.ia51.ar.requirements.Trip;

/**
 * This class enables to build data to populate a trip table
 * @author Komi AGOTSI
 *
 */
public class TripModel {
	
	public final String location;
	public final String participants;
	public final Trip trip ;
	
	public TripModel(String location, String participants,Trip trip) {
		super();
		this.location = location;
		this.participants = participants;
		this.trip =  trip;
}

	public String getLocation() {
		return location;
	}

	public String getParticipants() {
		return participants;
	}
		

	

	@Override
	public String toString() {
		return "TripModel [location=" + location + ", participants=" + participants + ", trip=" + trip + "]";
	}

	public Trip getTrip() {
		return trip;
	}
	
	

}
