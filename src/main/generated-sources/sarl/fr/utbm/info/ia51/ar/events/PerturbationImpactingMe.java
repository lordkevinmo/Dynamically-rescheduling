package fr.utbm.info.ia51.ar.events;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Address;
import io.sarl.lang.core.Event;

/**
 * @author Lilian Durand
 */
@SarlSpecification("0.8")
@SarlElementType(15)
public class PerturbationImpactingMe extends Event {
  @SyntheticMember
  public PerturbationImpactingMe() {
    super();
  }
  
  @SyntheticMember
  public PerturbationImpactingMe(final Address source) {
    super(source);
  }
}
