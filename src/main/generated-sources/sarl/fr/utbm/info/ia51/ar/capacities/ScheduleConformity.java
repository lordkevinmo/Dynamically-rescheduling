package fr.utbm.info.ia51.ar.capacities;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.core.AgentTrait;
import io.sarl.lang.core.Capacity;

/**
 * @author Koffi Agbenya
 */
@SarlSpecification("0.9")
@SarlElementType(20)
@SuppressWarnings("all")
public interface ScheduleConformity extends Capacity {
  /**
   * @ExcludeFromApidoc
   */
  public static class ContextAwareCapacityWrapper<C extends ScheduleConformity> extends Capacity.ContextAwareCapacityWrapper<C> implements ScheduleConformity {
    public ContextAwareCapacityWrapper(final C capacity, final AgentTrait caller) {
      super(capacity, caller);
    }
  }
}
