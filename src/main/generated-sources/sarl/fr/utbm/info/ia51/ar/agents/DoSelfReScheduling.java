package fr.utbm.info.ia51.ar.agents;

import fr.utbm.info.ia51.ar.agents.SocialReScheduling;
import fr.utbm.info.ia51.ar.requirements.Episode;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Agent;
import io.sarl.lang.core.Skill;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * This skill implements  the capacity of the agent
 * to self Re-schedule following the reception of
 * constraining event
 * </p>
 * 
 * @author komi AGOTSI
 */
@SarlSpecification("0.9")
@SarlElementType(21)
@SuppressWarnings("all")
public class DoSelfReScheduling extends Skill implements SocialReScheduling {
  public void makeSocialRescheduling(final Map<String, List<Episode>> participantEpisode) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public void makeRescheduling(final List<Episode> episodes) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @SyntheticMember
  public DoSelfReScheduling() {
    super();
  }
  
  @SyntheticMember
  public DoSelfReScheduling(final Agent agent) {
    super(agent);
  }
}
