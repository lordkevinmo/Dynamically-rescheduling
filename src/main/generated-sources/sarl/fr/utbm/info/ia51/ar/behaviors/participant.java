package fr.utbm.info.ia51.ar.behaviors;

import fr.utbm.info.ia51.ar.capacities.ManageSchedule;
import fr.utbm.info.ia51.ar.events.renegotiation;
import fr.utbm.info.ia51.ar.events.renegotiationAgreed;
import fr.utbm.info.ia51.ar.events.renegotiationDisagreed;
import fr.utbm.info.ia51.ar.requirements.Schedule;
import io.sarl.core.DefaultContextInteractions;
import io.sarl.core.Initialize;
import io.sarl.lang.annotation.ImportedCapacityFeature;
import io.sarl.lang.annotation.PerceptGuardEvaluator;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Skill;
import io.sarl.lang.util.ClearableReference;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author Lilian Durand
 */
@SarlSpecification("0.8")
@SarlElementType(20)
public class participant implements io.sarl.lang.core.Behavior {
  private void $behaviorUnit$Initialize$0(final Initialize occurrence) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method setSkill(ManageScheduleSkill) is undefined");
  }
  
  private void $behaviorUnit$renegotiation$1(final renegotiation occurrence) {
    ManageSchedule _$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_MANAGESCHEDULE$CALLER = this.$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_MANAGESCHEDULE$CALLER();
    boolean _isNewScheduleOK = _$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_MANAGESCHEDULE$CALLER.isNewScheduleOK(occurrence.newSchedule);
    if (_isNewScheduleOK) {
      DefaultContextInteractions _$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS$CALLER = this.$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS$CALLER();
      renegotiationAgreed _renegotiationAgreed = new renegotiationAgreed();
      _$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS$CALLER.emit(_renegotiationAgreed);
    } else {
      DefaultContextInteractions _$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS$CALLER_1 = this.$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS$CALLER();
      ManageSchedule _$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_MANAGESCHEDULE$CALLER_1 = this.$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_MANAGESCHEDULE$CALLER();
      Schedule _computeNewSchedule = _$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_MANAGESCHEDULE$CALLER_1.computeNewSchedule(occurrence.perturb);
      renegotiationDisagreed _renegotiationDisagreed = new renegotiationDisagreed(_computeNewSchedule);
      _$CAPACITY_USE$IO_SARL_CORE_DEFAULTCONTEXTINTERACTIONS$CALLER_1.emit(_renegotiationDisagreed);
    }
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
  @ImportedCapacityFeature(ManageSchedule.class)
  @SyntheticMember
  private transient ClearableReference<Skill> $CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_MANAGESCHEDULE;
  
  @SyntheticMember
  @Pure
  private ManageSchedule $CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_MANAGESCHEDULE$CALLER() {
    if (this.$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_MANAGESCHEDULE == null || this.$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_MANAGESCHEDULE.get() == null) {
      this.$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_MANAGESCHEDULE = $getSkill(ManageSchedule.class);
    }
    return $castSkill(ManageSchedule.class, this.$CAPACITY_USE$FR_UTBM_INFO_IA51_AR_CAPACITIES_MANAGESCHEDULE);
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
  private void $guardEvaluator$renegotiation(final renegotiation occurrence, final java.util.Collection ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$renegotiation$1(occurrence));
  }
}
