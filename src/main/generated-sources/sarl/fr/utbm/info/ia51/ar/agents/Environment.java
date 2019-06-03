package fr.utbm.info.ia51.ar.agents;

import fr.utbm.info.ia51.ar.events.EndRenegotiation;
import fr.utbm.info.ia51.ar.events.PerturbationImpactingMe;
import fr.utbm.info.ia51.ar.events.askToBeInitiator;
import fr.utbm.info.ia51.ar.events.perturbation;
import io.sarl.core.AgentKilled;
import io.sarl.core.AgentSpawned;
import io.sarl.core.Behaviors;
import io.sarl.core.ContextJoined;
import io.sarl.core.ContextLeft;
import io.sarl.core.DefaultContextInteractions;
import io.sarl.core.Destroy;
import io.sarl.core.ExternalContextAccess;
import io.sarl.core.Initialize;
import io.sarl.core.Logging;
import io.sarl.core.MemberJoined;
import io.sarl.core.MemberLeft;
import io.sarl.core.Schedules;
import io.sarl.javafx.FXBehavior;
import io.sarl.lang.annotation.ImportedCapacityFeature;
import io.sarl.lang.annotation.PerceptGuardEvaluator;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Address;
import io.sarl.lang.core.Skill;
import io.sarl.lang.util.ClearableReference;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * The main agent able to communicate with the GUI
 * 
 * @author : Koffi Agbenya
 */
@SarlSpecification("0.8")
@SarlElementType(18)
public class Environment implements io.sarl.lang.core.Agent {
  private FXBehavior javafxBehavior;
  
  private boolean negotiationInProgress;
  
  private /* List<Address> */Object participants;
  
  private Address initiator;
  
  private int delay = 1000;
  
  private void $behaviorUnit$Initialize$0(final Initialize occurrence) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field parameters is undefined for the type Initialize"
      + "\nThe method or field registerBehavior is undefined for the type FXBehavior"
      + "\nThe field Environment.participants refers to the missing type List"
      + "\nThe constructor FXBehavior(Object, FxViewerController) refers to the missing type Object"
      + "\nget cannot be resolved");
  }
  
  private void $behaviorUnit$Destroy$1(final Destroy occurrence) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method info(java.lang.String) is undefined");
  }
  
  private void $behaviorUnit$perturbation$2(final perturbation occurrence) {
    throw new Error("Unresolved compilation problems:"
      + "\n=== cannot be resolved."
      + "\nRandom cannot be resolved."
      + "\nThe method in(long, Procedure1<? super Object>) from the type Schedules refers to the missing type Object"
      + "\nThe field Environment.participants refers to the missing type List"
      + "\nThe field Environment.participants refers to the missing type List"
      + "\nThe constructor ConfirmInitiator(List) refers to the missing type List"
      + "\nThe field Environment.participants refers to the missing type List"
      + "\nThe field Environment.participants refers to the missing type List"
      + "\nThe field Environment.participants refers to the missing type List"
      + "\nThe constructor ConfirmInitiator(List) refers to the missing type List"
      + "\nThe field Environment.participants refers to the missing type List"
      + "\nget cannot be resolved"
      + "\nnextInt cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n== cannot be resolved");
  }
  
  private void $behaviorUnit$PerturbationImpactingMe$3(final PerturbationImpactingMe occurrence) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field Environment.participants refers to the missing type List"
      + "\nadd cannot be resolved");
  }
  
  private void $behaviorUnit$askToBeInitiator$4(final askToBeInitiator occurrence) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe constructor ConfirmInitiator(List) refers to the missing type List"
      + "\nThe field Environment.participants refers to the missing type List"
      + "\n== cannot be resolved");
  }
  
  @SyntheticMember
  @Pure
  private boolean $behaviorUnitGuard$askToBeInitiator$4(final askToBeInitiator it, final askToBeInitiator occurrence) {
    throw new Error("Unresolved compilation problems:"
      + "\n=== cannot be resolved.");
  }
  
  private void $behaviorUnit$EndRenegotiation$5(final EndRenegotiation occurrence) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field Environment.participants refers to the missing type List");
  }
  
  private void $behaviorUnit$AgentSpawned$6(final AgentSpawned occurrence) {
  }
  
  private void $behaviorUnit$AgentKilled$7(final AgentKilled occurrence) {
  }
  
  private void $behaviorUnit$ContextJoined$8(final ContextJoined occurrence) {
  }
  
  private void $behaviorUnit$ContextLeft$9(final ContextLeft occurrence) {
  }
  
  private void $behaviorUnit$MemberJoined$10(final MemberJoined occurrence) {
  }
  
  private void $behaviorUnit$MemberLeft$11(final MemberLeft occurrence) {
  }
  
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
  @ImportedCapacityFeature(ExternalContextAccess.class)
  @SyntheticMember
  private transient ClearableReference<Skill> $CAPACITY_USE$IO_SARL_CORE_EXTERNALCONTEXTACCESS;
  
  @SyntheticMember
  @Pure
  private ExternalContextAccess $CAPACITY_USE$IO_SARL_CORE_EXTERNALCONTEXTACCESS$CALLER() {
    if (this.$CAPACITY_USE$IO_SARL_CORE_EXTERNALCONTEXTACCESS == null || this.$CAPACITY_USE$IO_SARL_CORE_EXTERNALCONTEXTACCESS.get() == null) {
      this.$CAPACITY_USE$IO_SARL_CORE_EXTERNALCONTEXTACCESS = $getSkill(ExternalContextAccess.class);
    }
    return $castSkill(ExternalContextAccess.class, this.$CAPACITY_USE$IO_SARL_CORE_EXTERNALCONTEXTACCESS);
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
  @ImportedCapacityFeature(Schedules.class)
  @SyntheticMember
  private transient ClearableReference<Skill> $CAPACITY_USE$IO_SARL_CORE_SCHEDULES;
  
  @SyntheticMember
  @Pure
  private Schedules $CAPACITY_USE$IO_SARL_CORE_SCHEDULES$CALLER() {
    if (this.$CAPACITY_USE$IO_SARL_CORE_SCHEDULES == null || this.$CAPACITY_USE$IO_SARL_CORE_SCHEDULES.get() == null) {
      this.$CAPACITY_USE$IO_SARL_CORE_SCHEDULES = $getSkill(Schedules.class);
    }
    return $castSkill(Schedules.class, this.$CAPACITY_USE$IO_SARL_CORE_SCHEDULES);
  }
  
  @Extension
  @ImportedCapacityFeature(Logging.class)
  @SyntheticMember
  private transient ClearableReference<Skill> $CAPACITY_USE$IO_SARL_CORE_LOGGING;
  
  @SyntheticMember
  @Pure
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
  private void $guardEvaluator$ContextLeft(final ContextLeft occurrence, final java.util.Collection ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$ContextLeft$9(occurrence));
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$ContextJoined(final ContextJoined occurrence, final java.util.Collection ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$ContextJoined$8(occurrence));
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$MemberLeft(final MemberLeft occurrence, final java.util.Collection ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$MemberLeft$11(occurrence));
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$AgentSpawned(final AgentSpawned occurrence, final java.util.Collection ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$AgentSpawned$6(occurrence));
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$PerturbationImpactingMe(final PerturbationImpactingMe occurrence, final java.util.Collection ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$PerturbationImpactingMe$3(occurrence));
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$Destroy(final Destroy occurrence, final java.util.Collection ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$Destroy$1(occurrence));
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$EndRenegotiation(final EndRenegotiation occurrence, final java.util.Collection ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$EndRenegotiation$5(occurrence));
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$askToBeInitiator(final askToBeInitiator occurrence, final java.util.Collection ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    if ($behaviorUnitGuard$askToBeInitiator$4(occurrence, occurrence)) {
      ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$askToBeInitiator$4(occurrence));
    }
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$perturbation(final perturbation occurrence, final java.util.Collection ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$perturbation$2(occurrence));
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$AgentKilled(final AgentKilled occurrence, final java.util.Collection ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$AgentKilled$7(occurrence));
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$MemberJoined(final MemberJoined occurrence, final java.util.Collection ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$MemberJoined$10(occurrence));
  }
  
  @Pure
  @SyntheticMember
  public boolean equals(final java.lang.Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Environment other = (Environment) obj;
    if (other.negotiationInProgress != this.negotiationInProgress)
      return false;
    if (other.delay != this.delay)
      return false;
    return super.equals(obj);
  }
  
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + (this.negotiationInProgress ? 1231 : 1237);
    result = prime * result + this.delay;
    return result;
  }
}
