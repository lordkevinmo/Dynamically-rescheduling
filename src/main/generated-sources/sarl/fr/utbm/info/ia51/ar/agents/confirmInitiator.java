package fr.utbm.info.ia51.ar.agents;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Address;
import io.sarl.lang.core.Event;

/**
 * @author Secret
 */
@SarlSpecification("0.9")
@SarlElementType(15)
@SuppressWarnings("all")
public class confirmInitiator extends Event {
  @SyntheticMember
  public confirmInitiator() {
    super();
  }
  
  @SyntheticMember
  public confirmInitiator(final Address source) {
    super(source);
  }
  
  @SyntheticMember
  private static final long serialVersionUID = 588368462L;
}
