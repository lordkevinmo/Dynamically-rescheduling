package fr.utbm.info.ia51.ar.agents;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Agent;
import io.sarl.lang.core.Behavior;

/**
 * <p> This behavior represents the behavior of participants.
 * </p>
 * @author komi AGOTSI
 */
@SarlSpecification("0.9")
@SarlElementType(20)
@SuppressWarnings("all")
public class CarpolingBehavior extends Behavior {
  @SyntheticMember
  public CarpolingBehavior(final Agent agent) {
    super(agent);
  }
}
