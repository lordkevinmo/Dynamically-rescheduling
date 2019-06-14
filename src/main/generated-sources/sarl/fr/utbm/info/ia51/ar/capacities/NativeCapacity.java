package fr.utbm.info.ia51.ar.capacities;

import fr.utbm.info.ia51.ar.events.perturbation;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.core.AgentTrait;

/**
 * @author Lilian Durand
 */
@SarlSpecification("0.9")
@SarlElementType(20)
@SuppressWarnings("all")
public interface NativeCapacity {
  public abstract boolean isPerturbationImpacting(final perturbation perturb);
  
  public abstract boolean wantsToBeInitiator();
  
  /**
   * @ExcludeFromApidoc
   */
  public static class ContextAwareCapacityWrapper<C extends NativeCapacity> implements NativeCapacity {
    public ContextAwareCapacityWrapper(final C capacity, final AgentTrait caller) {
      super(capacity, caller);
    }
    
    public boolean isPerturbationImpacting(final perturbation perturb) {
      try {
        ensureCallerInLocalThread();
        return this.capacity.isPerturbationImpacting(perturb);
      } finally {
        resetCallerInLocalThread();
      }
    }
    
    public boolean wantsToBeInitiator() {
      try {
        ensureCallerInLocalThread();
        return this.capacity.wantsToBeInitiator();
      } finally {
        resetCallerInLocalThread();
      }
    }
  }
}
