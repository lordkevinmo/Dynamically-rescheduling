package fr.utbm.info.ia51.ar.capacities;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.core.Capacity;

/**
 * @author DELL
 */
/* @SuppressWarnings("discouraged_capacity_definition") */@SarlSpecification("0.8")
@SarlElementType(19)
public interface InitiatorCapacity extends Capacity {
  /**
   * @ExcludeFromApidoc
   */
  public static class ContextAwareCapacityWrapper<C extends InitiatorCapacity> extends Capacity.ContextAwareCapacityWrapper<C> implements InitiatorCapacity {
    public ContextAwareCapacityWrapper(final C capacity, final io.sarl.lang.core.AgentTrait caller) {
      super(capacity, caller);
    }
  }
}
