package fr.utbm.info.ia51.ar.capacities;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.core.Capacity;

/**
 * @author Koffi Agbenya
 */
<<<<<<< HEAD
@SarlSpecification("0.9")
@SarlElementType(20)
@SuppressWarnings("all")
=======
@SarlSpecification("0.8")
@SarlElementType(19)
>>>>>>> a964ccd9ac12f65bb890ba9dff4d4bace10f9fbb
public interface ScheduleConformity extends Capacity {
  /**
   * @ExcludeFromApidoc
   */
  public static class ContextAwareCapacityWrapper<C extends ScheduleConformity> extends Capacity.ContextAwareCapacityWrapper<C> implements ScheduleConformity {
    public ContextAwareCapacityWrapper(final C capacity, final io.sarl.lang.core.AgentTrait caller) {
      super(capacity, caller);
    }
  }
}
