package fr.utbm.info.ia51.ar.capacities;

import fr.utbm.info.ia51.ar.capacities.SelfReScheduling;
import fr.utbm.info.ia51.ar.requirements.Episode;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;

/**
 * <p>
 * This class represents the capacity of the agent
 * to social Re-schedule following the reception of
 * constraining event
 * </p>
 * 
 * @author komi AGOTSI
 */
@SarlSpecification("0.8")
@SarlElementType(19)
public interface SocialReScheduling extends SelfReScheduling {
  /**
   * make a social Re-Scheduling according into each
   * participant's schedule.
   * 
   * @param participantEpisode
   * 						Map a participant and his episodes
   */
  public abstract void makeSocialRescheduling(final /* Map<String, List<Episode>> */Object participantEpisode);
  
  /**
   * @ExcludeFromApidoc
   */
  public static class ContextAwareCapacityWrapper<C extends SocialReScheduling> extends SelfReScheduling.ContextAwareCapacityWrapper<C> implements SocialReScheduling {
    public ContextAwareCapacityWrapper(final C capacity, final io.sarl.lang.core.AgentTrait caller) {
      super(capacity, caller);
    }
    
    public void makeSocialRescheduling(final /* Map<String, List<Episode>> */Object participantEpisode) {
      try {
        ensureCallerInLocalThread();
        this.capacity.makeSocialRescheduling(participantEpisode);
      } finally {
        resetCallerInLocalThread();
      }
    }
  }
}
