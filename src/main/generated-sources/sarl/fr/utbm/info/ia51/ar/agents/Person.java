package fr.utbm.info.ia51.ar.agents;

import fr.utbm.info.ia51.ar.agents.confirmInitiator;
import fr.utbm.info.ia51.ar.agents.perturbation;
import fr.utbm.info.ia51.ar.requirements.Schedule;
import io.sarl.lang.annotation.PerceptGuardEvaluator;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Agent;
import io.sarl.lang.core.BuiltinCapacitiesProvider;
import io.sarl.lang.core.DynamicSkillProvider;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import javax.inject.Inject;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * <p> This classe define the mind and the body for agent.
 * In this project we considering agent as all the participant
 * to a trip or activity.
 * </p>
 * 
 * @author komi AGOTSI
 */
@SarlSpecification("0.9")
@SarlElementType(19)
@SuppressWarnings("all")
public class Person extends Agent {
  private List<Schedule> schedules;
  
  private List<Person> myRelations;
  
  private List<Person> inRelationsWith;
  
  /**
   * @return  List<Schedule>
   * 						List of Schedule of agent
   */
  @Pure
  protected List<Schedule> getSchedules() {
    return this.schedules;
  }
  
  /**
   * @param List<Schedule>
   * 					List of Schedule of the agent
   */
  protected void setSchedules(final List<Schedule> Schedules) {
    this.schedules = Schedules;
  }
  
  /**
   * @return  List<AgentUUID>
   * List of relations of the agent with others agents
   */
  @Pure
  protected List<Person> getRelations() {
    return this.getRelations();
  }
  
  /**
   * @return  List<AgentUUID>
   * List of relations of the agent with others agents
   */
  @Pure
  protected List<Person> getMyRelations() {
    return this.myRelations;
  }
  
  /**
   * @param List<AgentUUID>
   * List of relations of the agent with others agents
   */
  protected void setRelations(final List<Person> myRelations) {
    this.myRelations = myRelations;
  }
  
  /**
   * @return  List<AgentUUID>
   * List of agents who is in relation with this agent
   */
  @Pure
  protected List<Person> getInRelationsWith() {
    return this.inRelationsWith;
  }
  
  /**
   * @param List<AgentUUID>
   * List of agents who is in relation with this agent
   */
  protected void setInRelationsWith(final List<Person> inRelationsWith) {
    this.inRelationsWith = inRelationsWith;
  }
  
  private void $behaviorUnit$perturbation$0(final perturbation occurrence) {
  }
  
  private void $behaviorUnit$confirmInitiator$1(final confirmInitiator occurrence) {
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$perturbation(final perturbation occurrence, final Collection<Runnable> ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$perturbation$0(occurrence));
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$confirmInitiator(final confirmInitiator occurrence, final Collection<Runnable> ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$confirmInitiator$1(occurrence));
  }
  
  @Override
  @Pure
  @SyntheticMember
  public boolean equals(final Object obj) {
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    return result;
  }
  
  @SyntheticMember
  public Person(final UUID parentID, final UUID agentID) {
    super(parentID, agentID);
  }
  
  @SyntheticMember
  @Inject
  @Deprecated
  public Person(final BuiltinCapacitiesProvider provider, final UUID parentID, final UUID agentID) {
    super(provider, parentID, agentID);
  }
  
  @SyntheticMember
  @Inject
  public Person(final UUID parentID, final UUID agentID, final DynamicSkillProvider skillProvider) {
    super(parentID, agentID, skillProvider);
  }
}
