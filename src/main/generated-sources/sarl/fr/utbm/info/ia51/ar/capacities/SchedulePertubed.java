package fr.utbm.info.ia51.ar.capacities;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.core.AgentTrait;
import io.sarl.lang.core.Capacity;

/**
 * @author DELL
 */
@SarlSpecification("0.9")
@SarlElementType(19)
@SuppressWarnings("all")
public interface SchedulePertubed extends Capacity {
  /**
   * @ExcludeFromApidoc
   */
  public static class ContextAwareCapacityWrapper<C extends SchedulePertubed> extends Capacity.ContextAwareCapacityWrapper<C> implements SchedulePertubed {
    public ContextAwareCapacityWrapper(final C capacity, final AgentTrait caller) {
      super(capacity, caller);
    }
  }
}
