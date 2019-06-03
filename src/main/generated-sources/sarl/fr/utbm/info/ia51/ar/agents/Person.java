package fr.utbm.info.ia51.ar.agents;

import fr.utbm.info.ia51.ar.capacities.NativeCapacity;
import fr.utbm.info.ia51.ar.events.ConfirmInitiator;
import fr.utbm.info.ia51.ar.events.EndRenegotiation;
import fr.utbm.info.ia51.ar.events.perturbation;
import io.sarl.core.Behaviors;
import io.sarl.core.DefaultContextInteractions;
import io.sarl.core.Initialize;
import io.sarl.lang.annotation.ImportedCapacityFeature;
import io.sarl.lang.annotation.PerceptGuardEvaluator;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Address;
import io.sarl.lang.core.Agent;
import io.sarl.lang.core.Behavior;
import io.sarl.lang.core.BuiltinCapacitiesProvider;
import io.sarl.lang.core.DynamicSkillProvider;
import io.sarl.lang.core.Skill;
import io.sarl.lang.util.ClearableReference;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import javax.inject.Inject;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Inline;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * <p> This class define the mind and the body for agent.
 * In this project we considering agent as all the participant
 * to a trip or activity.
 * </p>
 * 
 * @author komi AGOTSI
 * @author Lilian Durand
 * @author Koffi Agbenya
 */
@XmlRootElement(name = "Person")
@XmlAccessorType(XmlAccessType.PROPERTY)
@SarlSpecification("0.9")
@SarlElementType(19)
@SuppressWarnings("all")
public class Person extends Agent {
  private List<Person> myRelations;
  
  private Behavior actualBehavior;
  
  private List<Address> participantsRenegotiation;
  
  private void $behaviorUnit$Initialize$0(final Initialize occurrence) {
    throw new Error("Unresolved compilation problems:"
      + "\nBounds mismatch: The type argument <NativeSkill> is not a valid substitute for the bounded type parameter <S extends Skill> of the method setSkill(S, Class<? extends Capacity>[])");
  }
  
  private void $behaviorUnit$perturbation$1(final perturbation occurrence) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Person to Agent");
  }
  
  @SyntheticMember
  @Pure
  private boolean $behaviorUnitGuard$perturbation$1(final perturbation it, final perturbation occurrence) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from boolean to boolean");
  }
  
  private void $behaviorUnit$perturbation$2(final perturbation occurrence) {
  }
  
  @SyntheticMember
  @Pure
  private boolean $behaviorUnitGuard$perturbation$2(final perturbation it, final perturbation occurrence) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from boolean to boolean");
  }
  
  private void $behaviorUnit$ConfirmInitiator$3(final ConfirmInitiator occurrence) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Person to Agent");
  }
  
  private void $behaviorUnit$EndRenegotiation$4(final EndRenegotiation occurrence) {
    Behaviors _$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS$CALLER = this.$castSkill(Behaviors.class, (this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS == null || this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS.get() == null) ? (this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS = this.$getSkill(Behaviors.class)) : this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS);
    _$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS$CALLER.unregisterBehavior(this.actualBehavior);
    this.actualBehavior = null;
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
   * @param List<AgentUUID>
   * List of relations of the agent with others agents
   */
  @XmlElement(name = "myrelations")
  protected void setRelations(final List<Person> myRelations) {
    this.myRelations = myRelations;
  }
  
  @Extension
  @ImportedCapacityFeature(Behaviors.class)
  @SyntheticMember
  private transient ClearableReference<Skill> $CAPACITY_USE$IO_SARL_CORE_BEHAVIORS;
  
  @SyntheticMember
  @Pure
  @Inline(value = "$castSkill(Behaviors.class, ($0$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS == null || $0$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS.get() == null) ? ($0$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS = $0$getSkill(Behaviors.class)) : $0$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS)", imported = Behaviors.class)
  private Behaviors $CAPACITY_USE$IO_SARL_CORE_BEHAVIORS$CALLER() {
    if (this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS == null || this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS.get() == null) {
      this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS = $getSkill(Behaviors.class);
    }
    return $castSkill(Behaviors.class, this.$CAPACITY_USE$IO_SARL_CORE_BEHAVIORS);
  }
  
  @Extension
  @ImportedCapacityFeature(DefaultContextInteractions.class)
  @SyntheticMember
  private transient ClearableReference<Skill> $CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS;
  
  @SyntheticMember
  @Pure
  @Inline(value = "$castSkill(DefaultContextInteractions.class, ($0$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS == null || $0$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS.get() == null) ? ($0$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS = $0$getSkill(DefaultContextInteractions.class)) : $0$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS)", imported = DefaultContextInteractions.class)
  private DefaultContextInteractions $CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS$CALLER() {
    if (this.$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS == null || this.$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS.get() == null) {
      this.$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS = $getSkill(DefaultContextInteractions.class);
    }
    return $castSkill(DefaultContextInteractions.class, this.$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS);
  }
  
  @Extension
  @ImportedCapacityFeature(NativeCapacity.class)
  @SyntheticMember
  private transient ClearableReference<Skill> $CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_NATIVECAPACITY;
  
  @SyntheticMember
  @Pure
  @Inline(value = "$castSkill(NativeCapacity.class, ($0$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_NATIVECAPACITY == null || $0$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_NATIVECAPACITY.get() == null) ? ($0$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_NATIVECAPACITY = $0$getSkill(NativeCapacity.class)) : $0$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_NATIVECAPACITY)", imported = NativeCapacity.class)
  private NativeCapacity $CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_NATIVECAPACITY$CALLER() {
    if (this.$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_NATIVECAPACITY == null || this.$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_NATIVECAPACITY.get() == null) {
      this.$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_NATIVECAPACITY = $getSkill(NativeCapacity.class);
    }
    return $castSkill(NativeCapacity.class, this.$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_NATIVECAPACITY);
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$Initialize(final Initialize occurrence, final Collection<Runnable> ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$Initialize$0(occurrence));
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$ConfirmInitiator(final ConfirmInitiator occurrence, final Collection<Runnable> ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$ConfirmInitiator$3(occurrence));
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$EndRenegotiation(final EndRenegotiation occurrence, final Collection<Runnable> ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$EndRenegotiation$4(occurrence));
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$perturbation(final perturbation occurrence, final Collection<Runnable> ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    if ($behaviorUnitGuard$perturbation$1(occurrence, occurrence)) {
      ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$perturbation$1(occurrence));
    }
    if ($behaviorUnitGuard$perturbation$2(occurrence, occurrence)) {
      ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$perturbation$2(occurrence));
    }
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
