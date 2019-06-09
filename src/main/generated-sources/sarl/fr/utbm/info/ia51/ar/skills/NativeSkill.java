package fr.utbm.info.ia51.ar.skills;

import fr.utbm.info.ia51.ar.capacities.NativeCapacity;
import fr.utbm.info.ia51.ar.events.perturbation;
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
<<<<<<< HEAD
@SarlSpecification("0.9")
@SarlElementType(22)
@SuppressWarnings("all")
=======
@SarlSpecification("0.8")
@SarlElementType(21)
>>>>>>> a964ccd9ac12f65bb890ba9dff4d4bace10f9fbb
public class NativeSkill extends Skill implements NativeCapacity {
  public void install() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method info(java.lang.String) is undefined");
  }
  
  public void uninstall() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method info(java.lang.String) is undefined");
  }
  
  public boolean isPerturbationImpacting(final perturbation perturb) {
    return false;
  }
  
  public boolean wantsToBeInitiator() {
<<<<<<< HEAD
    int _nextInt = new Random().nextInt(10);
    return ((_nextInt % 2) == 0);
=======
    throw new Error("Unresolved compilation problems:"
      + "\nRandom cannot be resolved."
      + "\nnextInt cannot be resolved"
      + "\n% cannot be resolved"
      + "\n== cannot be resolved");
>>>>>>> a964ccd9ac12f65bb890ba9dff4d4bace10f9fbb
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
  public NativeSkill() {
    super();
  }
  
  @SyntheticMember
  public NativeSkill(final /*  */Object agent) {
    super(agent);
  }
}
