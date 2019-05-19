package fr.utbm.info.ia51.ar.agents;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Address;
import io.sarl.lang.core.Event;

/**
 * @author Koffi Agbenya
 */
@SarlSpecification("0.9")
@SarlElementType(15)
@SuppressWarnings("all")
public class InitiatorConfirmation extends Event {
  @SyntheticMember
  public InitiatorConfirmation() {
    super();
  }
  
  @SyntheticMember
  public InitiatorConfirmation(final Address source) {
    super(source);
  }
  
  @SyntheticMember
  private final static long serialVersionUID = 588368462L;
}
