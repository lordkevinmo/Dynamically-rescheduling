package fr.utbm.info.ia51.ar.agents;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Address;
import io.sarl.lang.core.Event;

/**
 * @author Lilian Durand
 */
@SarlSpecification("0.9")
@SarlElementType(15)
@SuppressWarnings("all")
public class renegotiationAgreed extends Event {
  @SyntheticMember
  public renegotiationAgreed() {
    super();
  }
  
  @SyntheticMember
  public renegotiationAgreed(final Address source) {
    super(source);
  }
  
  @SyntheticMember
  private final static long serialVersionUID = 588368462L;
}
