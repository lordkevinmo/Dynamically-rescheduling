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
public class askToBeInitiator extends Event {
  @SyntheticMember
  public askToBeInitiator() {
    super();
  }
  
  @SyntheticMember
  public askToBeInitiator(final Address source) {
    super(source);
  }
}
