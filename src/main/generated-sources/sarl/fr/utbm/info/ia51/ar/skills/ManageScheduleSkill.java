package fr.utbm.info.ia51.ar.skills;

import fr.utbm.info.ia51.ar.capacities.ManageSchedule;
import fr.utbm.info.ia51.ar.events.perturbation;
import fr.utbm.info.ia51.ar.requirements.Schedule;
import io.sarl.core.Logging;
import io.sarl.lang.annotation.ImportedCapacityFeature;
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
@SarlElementType(21)
public class ManageScheduleSkill extends Skill implements ManageSchedule {
  public void install() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method info(java.lang.String) is undefined");
  }
  
  public void uninstall() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method info(java.lang.String) is undefined");
  }
  
  @Pure
  public boolean isNewScheduleOK(final Schedule schedule) {
    return true;
  }
  
  @Pure
  public Schedule computeNewSchedule(final perturbation perturb) {
    throw new Error("Unresolved compilation problems:"
      + "\nInvalid number of arguments. The constructor Schedule() is not applicable for the arguments (null)");
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
  public ManageScheduleSkill() {
    super();
  }
  
  @SyntheticMember
  public ManageScheduleSkill(final /*  */Object agent) {
    super(agent);
  }
}
