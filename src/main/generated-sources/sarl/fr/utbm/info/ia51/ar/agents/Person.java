package fr.utbm.info.ia51.ar.agents;

import fr.utbm.info.ia51.ar.capacities.NativeCapacity;
import fr.utbm.info.ia51.ar.events.ConfirmInitiator;
import fr.utbm.info.ia51.ar.events.EndRenegotiation;
import fr.utbm.info.ia51.ar.events.perturbation;
<<<<<<< HEAD
import fr.utbm.info.ia51.ar.requirements.PersonnalInfo;
import fr.utbm.info.ia51.ar.skills.NativeSkill;
=======
>>>>>>> a964ccd9ac12f65bb890ba9dff4d4bace10f9fbb
import io.sarl.core.Behaviors;
import io.sarl.core.DefaultContextInteractions;
import io.sarl.core.Initialize;
import io.sarl.core.Logging;
import io.sarl.lang.annotation.ImportedCapacityFeature;
import io.sarl.lang.annotation.PerceptGuardEvaluator;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Skill;
import io.sarl.lang.util.ClearableReference;
<<<<<<< HEAD
import java.util.Collection;
import java.util.UUID;
import javax.inject.Inject;
=======
>>>>>>> a964ccd9ac12f65bb890ba9dff4d4bace10f9fbb
import org.eclipse.xtext.xbase.lib.Extension;
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
<<<<<<< HEAD
@SarlSpecification("0.9")
@SarlElementType(19)
@SuppressWarnings("all")
public class Person extends Agent {
  private Behavior actualBehavior;
  
  private void $behaviorUnit$Initialize$0(final Initialize occurrence) {
    Logging _$CAPACITY_USE$IO_SARL_CORE_LOGGING$CALLER = this.$castSkill(Logging.class, (this.$CAPACITY_USE$IO_SARL_CORE_LOGGING == null || this.$CAPACITY_USE$IO_SARL_CORE_LOGGING.get() == null) ? (this.$CAPACITY_USE$IO_SARL_CORE_LOGGING = this.$getSkill(Logging.class)) : this.$CAPACITY_USE$IO_SARL_CORE_LOGGING);
    _$CAPACITY_USE$IO_SARL_CORE_LOGGING$CALLER.info("Initializing me");
    Object _get = occurrence.parameters[0];
    PersonnalInfo x = ((PersonnalInfo) _get);
    Logging _$CAPACITY_USE$IO_SARL_CORE_LOGGING$CALLER_1 = this.$castSkill(Logging.class, (this.$CAPACITY_USE$IO_SARL_CORE_LOGGING == null || this.$CAPACITY_USE$IO_SARL_CORE_LOGGING.get() == null) ? (this.$CAPACITY_USE$IO_SARL_CORE_LOGGING = this.$getSkill(Logging.class)) : this.$CAPACITY_USE$IO_SARL_CORE_LOGGING);
    _$CAPACITY_USE$IO_SARL_CORE_LOGGING$CALLER_1.info(("my data" + x));
    this.actualBehavior = null;
    NativeSkill _nativeSkill = new NativeSkill();
    this.<NativeSkill>setSkill(_nativeSkill);
=======
/* @XmlRootElement()
@XmlAccessorType(/* name is null */./* name is null */) */@SarlSpecification("0.8")
@SarlElementType(18)
public class Person implements io.sarl.lang.core.Agent {
  private /* List<Person> */Object myRelations;
  
  private /* Behavior */Object actualBehavior;
  
  private void $behaviorUnit$Initialize$0(final Initialize occurrence) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method participantsRenegotiation(Object) is undefined for the type Person"
      + "\nThe method setSkill(NativeSkill) is undefined"
      + "\nThe field Person.actualBehavior refers to the missing type Behavior");
>>>>>>> a964ccd9ac12f65bb890ba9dff4d4bace10f9fbb
  }
  
  private void $behaviorUnit$perturbation$1(final perturbation occurrence) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method registerBehavior(Behavior) is undefined"
      + "\nInvalid number of arguments. The constructor participant() is not applicable for the arguments (Person)"
      + "\nThe method unregisterBehavior(Object) from the type Behaviors refers to the missing type Object"
      + "\nThe field Person.actualBehavior refers to the missing type Behavior"
      + "\nThe field Person.actualBehavior refers to the missing type Behavior"
      + "\nThe field Person.actualBehavior refers to the missing type Behavior");
  }
  
  @SyntheticMember
  @Pure
  private boolean $behaviorUnitGuard$perturbation$1(final perturbation it, final perturbation occurrence) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field Person.actualBehavior refers to the missing type Behavior"
      + "\n=== cannot be resolved");
  }
  
  private void $behaviorUnit$perturbation$2(final perturbation occurrence) {
  }
  
  @SyntheticMember
  @Pure
  private boolean $behaviorUnitGuard$perturbation$2(final perturbation it, final perturbation occurrence) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field Person.actualBehavior refers to the missing type Behavior"
      + "\n!= cannot be resolved");
  }
  
  private void $behaviorUnit$ConfirmInitiator$3(final ConfirmInitiator occurrence) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method registerBehavior(Behavior) is undefined"
      + "\nInvalid number of arguments. The constructor Initiator() is not applicable for the arguments (Person,Object)"
      + "\nThe method unregisterBehavior(Object) from the type Behaviors refers to the missing type Object"
      + "\nThe field Person.actualBehavior refers to the missing type Behavior"
      + "\nThe field Person.actualBehavior refers to the missing type Behavior"
      + "\nThe field ConfirmInitiator.participants refers to the missing type Object"
      + "\nThe field Person.actualBehavior refers to the missing type Behavior");
  }
  
  private void $behaviorUnit$EndRenegotiation$4(final EndRenegotiation occurrence) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method unregisterBehavior(Object) from the type Behaviors refers to the missing type Object"
      + "\nThe field Person.actualBehavior refers to the missing type Behavior"
      + "\nThe field Person.actualBehavior refers to the missing type Behavior");
  }
  
<<<<<<< HEAD
=======
  /**
   * @return  List<AgentUUID>
   * List of relations of the agent with others agents
   */
  @Pure
  protected /* List<Person> */Object getRelations() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getRelations() from the type Person refers to the missing type List");
  }
  
  /**
   * @param List<AgentUUID>
   * List of relations of the agent with others agents
   */
  /* @XmlElement()
   */protected void setRelations(final /* List<Person> */Object myRelations) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field Person.myRelations refers to the missing type List");
  }
  
>>>>>>> a964ccd9ac12f65bb890ba9dff4d4bace10f9fbb
  @Extension
  @ImportedCapacityFeature(Behaviors.class)
  @SyntheticMember
  private transient ClearableReference<Skill> $CAPACITY_USE$IO_SARL_CORE_BEHAVIORS;
  
  @SyntheticMember
  @Pure
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
  private NativeCapacity $CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_NATIVECAPACITY$CALLER() {
    if (this.$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_NATIVECAPACITY == null || this.$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_NATIVECAPACITY.get() == null) {
      this.$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_NATIVECAPACITY = $getSkill(NativeCapacity.class);
    }
    return $castSkill(NativeCapacity.class, this.$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_NATIVECAPACITY);
  }
  
  @Extension
  @ImportedCapacityFeature(Logging.class)
  @SyntheticMember
  private transient ClearableReference<Skill> $CAPACITY_USE$IO_SARL_CORE_LOGGING;
  
  @SyntheticMember
  @Pure
  @Inline(value = "$castSkill(Logging.class, ($0$CAPACITY_USE$IO_SARL_CORE_LOGGING == null || $0$CAPACITY_USE$IO_SARL_CORE_LOGGING.get() == null) ? ($0$CAPACITY_USE$IO_SARL_CORE_LOGGING = $0$getSkill(Logging.class)) : $0$CAPACITY_USE$IO_SARL_CORE_LOGGING)", imported = Logging.class)
  private Logging $CAPACITY_USE$IO_SARL_CORE_LOGGING$CALLER() {
    if (this.$CAPACITY_USE$IO_SARL_CORE_LOGGING == null || this.$CAPACITY_USE$IO_SARL_CORE_LOGGING.get() == null) {
      this.$CAPACITY_USE$IO_SARL_CORE_LOGGING = $getSkill(Logging.class);
    }
    return $castSkill(Logging.class, this.$CAPACITY_USE$IO_SARL_CORE_LOGGING);
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$Initialize(final Initialize occurrence, final java.util.Collection ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$Initialize$0(occurrence));
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$ConfirmInitiator(final ConfirmInitiator occurrence, final java.util.Collection ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$ConfirmInitiator$3(occurrence));
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$EndRenegotiation(final EndRenegotiation occurrence, final java.util.Collection ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$EndRenegotiation$4(occurrence));
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$perturbation(final perturbation occurrence, final java.util.Collection ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    if ($behaviorUnitGuard$perturbation$1(occurrence, occurrence)) {
      ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$perturbation$1(occurrence));
    }
    if ($behaviorUnitGuard$perturbation$2(occurrence, occurrence)) {
      ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$perturbation$2(occurrence));
    }
  }
  
  @Pure
  @SyntheticMember
  public boolean equals(final java.lang.Object obj) {
    return super.equals(obj);
  }
  
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    return result;
  }
}
