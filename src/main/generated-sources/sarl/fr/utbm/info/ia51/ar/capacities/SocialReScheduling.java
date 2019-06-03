package fr.utbm.info.ia51.ar.capacities;

import fr.utbm.info.ia51.ar.capacities.SelfReScheduling;
import fr.utbm.info.ia51.ar.requirements.Episode;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.core.AgentTrait;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * This class represents the capacity of the agent
 * to social Re-schedule following the reception of
 * constraining event
 * </p>
 * 
 * @author komi AGOTSI
 */
@SarlSpecification("0.9")
@SarlElementType(20)
@SuppressWarnings("all")
public interface SocialReScheduling extends SelfReScheduling {
  /**
   * make a social Re-Scheduling according into each
   * participant's schedule.
   * 
   * @param participantEpisode
   * 						Map a participant and his episodes
   */
  public abstract void makeSocialRescheduling(final Map<String, List<Episode>> participantEpisode);
  
  /**
   * @ExcludeFromApidoc
   */
  public static class ContextAwareCapacityWrapper<C extends SocialReScheduling> extends SelfReScheduling.ContextAwareCapacityWrapper<C> implements SocialReScheduling {
    public ContextAwareCapacityWrapper(final C capacity, final AgentTrait caller) {
      super(capacity, caller);
    }
    
    public void makeSocialRescheduling(final Map<String, List<Episode>> participantEpisode) {
      try {
        ensureCallerInLocalThread();
        this.capacity.makeSocialRescheduling(participantEpisode);
      } finally {
        resetCallerInLocalThread();
      }
    }
  }
}
