package fr.utbm.info.ia51.ar.capacities;

import fr.utbm.info.ia51.ar.events.perturbation;
import fr.utbm.info.ia51.ar.requirements.Schedule;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.core.AgentTrait;
import io.sarl.lang.core.Capacity;

/**
 * @author Lilian Durand
 */
@SarlSpecification("0.9")
@SarlElementType(19)
@SuppressWarnings("all")
public interface ManageSchedule extends Capacity {
  public abstract boolean isNewScheduleOK(final Schedule schedule);
  
  public abstract Schedule computeNewSchedule(final perturbation perturb);
  
  /**
   * @ExcludeFromApidoc
   */
  public static class ContextAwareCapacityWrapper<C extends ManageSchedule> extends Capacity.ContextAwareCapacityWrapper<C> implements ManageSchedule {
    public ContextAwareCapacityWrapper(final C capacity, final AgentTrait caller) {
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
