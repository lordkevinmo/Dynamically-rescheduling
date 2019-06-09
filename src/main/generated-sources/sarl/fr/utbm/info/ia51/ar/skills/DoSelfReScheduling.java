package fr.utbm.info.ia51.ar.skills;

import fr.utbm.info.ia51.ar.capacities.SelfReScheduling;
import fr.utbm.info.ia51.ar.requirements.Episode;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Agent;
import io.sarl.lang.core.Skill;
import java.util.List;

/**
 * <p>
 * This sill implements the capacity of the agent
 * to self Re-schedule following the reception of
 * constraining event
 * </p>
 * 
 * @author komi AGOTSI
 */
@SarlSpecification("0.9")
@SarlElementType(22)
@SuppressWarnings("all")
public class DoSelfReScheduling extends Skill implements SelfReScheduling {
  public void makeRescheduling(final List<Episode> episodes) {
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
