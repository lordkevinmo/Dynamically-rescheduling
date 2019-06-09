package fr.utbm.info.ia51.ar.capacities;

import fr.utbm.info.ia51.ar.events.perturbation;
import fr.utbm.info.ia51.ar.requirements.Schedule;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.core.Capacity;

/**
 * @author Lilian Durand
 */
<<<<<<< HEAD
@SarlSpecification("0.9")
@SarlElementType(20)
@SuppressWarnings("all")
=======
@SarlSpecification("0.8")
@SarlElementType(19)
>>>>>>> a964ccd9ac12f65bb890ba9dff4d4bace10f9fbb
public interface ManageSchedule extends Capacity {
  public abstract boolean isNewScheduleOK(final Schedule schedule);
  
  public abstract Schedule computeNewSchedule(final perturbation perturb);
  
  /**
   * @ExcludeFromApidoc
   */
  public static class ContextAwareCapacityWrapper<C extends ManageSchedule> extends Capacity.ContextAwareCapacityWrapper<C> implements ManageSchedule {
    public ContextAwareCapacityWrapper(final C capacity, final io.sarl.lang.core.AgentTrait caller) {
      super(capacity, caller);
    }
    
    public boolean isNewScheduleOK(final Schedule schedule) {
      try {
        ensureCallerInLocalThread();
        return this.capacity.isNewScheduleOK(schedule);
      } finally {
        resetCallerInLocalThread();
      }
    }
    
    public Schedule computeNewSchedule(final perturbation perturb) {
      try {
        ensureCallerInLocalThread();
        return this.capacity.computeNewSchedule(perturb);
      } finally {
        resetCallerInLocalThread();
      }
    }
  }
}
