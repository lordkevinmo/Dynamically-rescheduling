package fr.utbm.info.ia51.ar.skills;

import fr.utbm.info.ia51.ar.capacities.SocialReScheduling;
import fr.utbm.info.ia51.ar.requirements.Episode;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Agent;
import io.sarl.lang.core.Skill;
import java.util.List;
import java.util.Map;
import org.eclipse.xtext.xbase.lib.Pure;

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
@SarlElementType(22)
@SuppressWarnings("all")
public class DoSelfReScheduling extends Skill implements SocialReScheduling {
  @Pure
  public void makeSocialRescheduling(final Map<String, List<Episode>> participantEpisode) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Pure
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
