package fr.utbm.info.ia51.ar.behaviors;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Agent;
import io.sarl.lang.core.Behavior;

/**
 * <p> This behavior represents the behavior of driver.
 * </p>
 * @author komi AGOTSI
 */
@SarlSpecification("0.9")
@SarlElementType(20)
@SuppressWarnings("all")
public class Driver extends Behavior {
  @SyntheticMember
  public Driver(final Agent agent) {
    super(agent);
  }
}
