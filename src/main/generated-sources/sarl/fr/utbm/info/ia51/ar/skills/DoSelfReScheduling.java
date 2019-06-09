package fr.utbm.info.ia51.ar.skills;

import fr.utbm.info.ia51.ar.capacities.SelfReScheduling;
import fr.utbm.info.ia51.ar.requirements.Episode;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Skill;

/**
 * <p>
 * This sill implements the capacity of the agent
 * to self Re-schedule following the reception of
 * constraining event
 * </p>
 * 
 * @author komi AGOTSI
 */
<<<<<<< HEAD
@SarlSpecification("0.9")
@SarlElementType(22)
@SuppressWarnings("all")
=======
@SarlSpecification("0.8")
@SarlElementType(21)
>>>>>>> a964ccd9ac12f65bb890ba9dff4d4bace10f9fbb
public class DoSelfReScheduling extends Skill implements SelfReScheduling {
  public void makeRescheduling(final /* List<Episode> */Object episodes) {
  }
  
  @SyntheticMember
  public DoSelfReScheduling() {
    super();
  }
  
  @SyntheticMember
  public DoSelfReScheduling(final /*  */Object agent) {
    super(agent);
  }
}
