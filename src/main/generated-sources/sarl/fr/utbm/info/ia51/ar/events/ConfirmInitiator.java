package fr.utbm.info.ia51.ar.events;

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
public class ConfirmInitiator extends Event {
  @SyntheticMember
  public ConfirmInitiator() {
    super();
  }
  
  @SyntheticMember
  public ConfirmInitiator(final Address source) {
    super(source);
  }
  
  @SyntheticMember
  private final static long serialVersionUID = 588368462L;
}
