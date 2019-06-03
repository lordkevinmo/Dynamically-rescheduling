package fr.utbm.info.ia51.ar.behaviors;

import fr.utbm.info.ia51.ar.events.EndRenegotiation;
import fr.utbm.info.ia51.ar.events.renegotiationAgreed;
import fr.utbm.info.ia51.ar.events.renegotiationDisagreed;
import io.sarl.core.AgentKilled;
import io.sarl.core.AgentSpawned;
import io.sarl.core.ContextJoined;
import io.sarl.core.ContextLeft;
import io.sarl.core.DefaultContextInteractions;
import io.sarl.core.Destroy;
import io.sarl.core.Initialize;
import io.sarl.core.Logging;
import io.sarl.core.MemberJoined;
import io.sarl.core.MemberLeft;
import io.sarl.lang.annotation.ImportedCapacityFeature;
import io.sarl.lang.annotation.PerceptGuardEvaluator;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Address;
import io.sarl.lang.core.Skill;
import io.sarl.lang.util.ClearableReference;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author Koffi Agbenya
 * @author Lilian Durand
 */
@SarlSpecification("0.8")
@SarlElementType(20)
public class Initiator implements io.sarl.lang.core.Behavior {
  private int nbAnswer;
  
  private /* List<Address> */Object participants;
  
  private int nbParticipants;
  
  private int nbLoop;
  
  private final int nbLoopMax = 4;
  
  private void $behaviorUnit$renegotiationAgreed$0(final renegotiationAgreed occurrence) {
    int _plusPlus = IntegerExtensions.operator_plusPlus(this.nbAnswer);
    boolean _greaterEqualsThan = IntegerExtensions.operator_greaterEqualsThan(_plusPlus, this.nbParticipants);
    if (_greaterEqualsThan) {
      DefaultContextInteractions _$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS$CALLER = this.$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS$CALLER();
      EndRenegotiation _endRenegotiation = new EndRenegotiation();
      _$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS$CALLER.emit(_endRenegotiation);
    }
  }
  
  private void $behaviorUnit$renegotiationDisagreed$1(final renegotiationDisagreed occurrence) {
  }
  
  private void $behaviorUnit$Initialize$2(final Initialize occurrence) {
    throw new Error("Unresolved compilation problems:"
      + "\nList cannot be resolved to a type."
      + "\nThe method or field parameters is undefined for the type Initialize"
      + "\nThe method info(java.lang.String) is undefined"
      + "\nThe field Initiator.participants refers to the missing type List"
      + "\nThe field Initiator.participants refers to the missing type List"
      + "\nget cannot be resolved"
      + "\nsize cannot be resolved");
  }
  
  private void $behaviorUnit$Destroy$3(final Destroy occurrence) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method info(java.lang.String) is undefined");
  }
  
  private void $behaviorUnit$AgentSpawned$4(final AgentSpawned occurrence) {
  }
  
  private void $behaviorUnit$AgentKilled$5(final AgentKilled occurrence) {
  }
  
  private void $behaviorUnit$ContextJoined$6(final ContextJoined occurrence) {
  }
  
  private void $behaviorUnit$ContextLeft$7(final ContextLeft occurrence) {
  }
  
  private void $behaviorUnit$MemberJoined$8(final MemberJoined occurrence) {
  }
  
  private void $behaviorUnit$MemberLeft$9(final MemberLeft occurrence) {
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
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$Initialize(final Initialize occurrence, final java.util.Collection ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$Initialize$2(occurrence));
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$ContextLeft(final ContextLeft occurrence, final java.util.Collection ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$ContextLeft$7(occurrence));
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$ContextJoined(final ContextJoined occurrence, final java.util.Collection ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$ContextJoined$6(occurrence));
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$MemberLeft(final MemberLeft occurrence, final java.util.Collection ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$MemberLeft$9(occurrence));
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$renegotiationAgreed(final renegotiationAgreed occurrence, final java.util.Collection ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$renegotiationAgreed$0(occurrence));
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$AgentSpawned(final AgentSpawned occurrence, final java.util.Collection ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$AgentSpawned$4(occurrence));
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$renegotiationDisagreed(final renegotiationDisagreed occurrence, final java.util.Collection ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$renegotiationDisagreed$1(occurrence));
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$Destroy(final Destroy occurrence, final java.util.Collection ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$Destroy$3(occurrence));
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$AgentKilled(final AgentKilled occurrence, final java.util.Collection ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$AgentKilled$5(occurrence));
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$MemberJoined(final MemberJoined occurrence, final java.util.Collection ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$MemberJoined$8(occurrence));
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
    Initiator other = (Initiator) obj;
    if (other.nbAnswer != this.nbAnswer)
      return false;
    if (other.nbParticipants != this.nbParticipants)
      return false;
    if (other.nbLoop != this.nbLoop)
      return false;
    if (other.nbLoopMax != this.nbLoopMax)
      return false;
    return super.equals(obj);
  }
  
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + this.nbAnswer;
    result = prime * result + this.nbParticipants;
    result = prime * result + this.nbLoop;
    result = prime * result + this.nbLoopMax;
    return result;
  }
}
