package fr.utbm.info.ia51.ar.capacities;

import fr.utbm.info.ia51.ar.events.perturbation;
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
public interface NativeCapacity extends Capacity {
  public abstract boolean isPerturbationImpacting(final perturbation perturb);
  
  public abstract boolean wantsToBeInitiator();
  
  /**
   * @ExcludeFromApidoc
   */
  public static class ContextAwareCapacityWrapper<C extends NativeCapacity> extends Capacity.ContextAwareCapacityWrapper<C> implements NativeCapacity {
    public ContextAwareCapacityWrapper(final C capacity, final io.sarl.lang.core.AgentTrait caller) {
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
