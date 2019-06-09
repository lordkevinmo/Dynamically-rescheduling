package fr.utbm.info.ia51.ar.capacities;

import fr.utbm.info.ia51.ar.requirements.Episode;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.core.Capacity;

/**
 * <p>
 * This class represents the capacity of the agent
 * to self Re-schedule following the reception of
 * constraining event
 * </p>
 * 
 * @author komi AGOTSI
 */
<<<<<<< HEAD
@FunctionalInterface
@SarlSpecification("0.9")
@SarlElementType(20)
@SuppressWarnings("all")
=======
@SarlSpecification("0.8")
@SarlElementType(19)
>>>>>>> a964ccd9ac12f65bb890ba9dff4d4bace10f9fbb
public interface SelfReScheduling extends Capacity {
  /**
   * make a Re-Scheduling of Episodes
   * 
   * @param episodes
   * 					Agent List episodes
   */
  public abstract void makeRescheduling(final /* List<Episode> */Object episodes);
  
  /**
   * @ExcludeFromApidoc
   */
  public static class ContextAwareCapacityWrapper<C extends SelfReScheduling> extends Capacity.ContextAwareCapacityWrapper<C> implements SelfReScheduling {
    public ContextAwareCapacityWrapper(final C capacity, final io.sarl.lang.core.AgentTrait caller) {
      super(capacity, caller);
    }
    
    public void makeRescheduling(final /* List<Episode> */Object episodes) {
      try {
        ensureCallerInLocalThread();
        this.capacity.makeRescheduling(episodes);
      } finally {
        resetCallerInLocalThread();
      }
    }
  }
}
