package fr.utbm.info.ia51.ar.events;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Address;
import io.sarl.lang.core.Event;

/**
 * <p> This represents an event that will be triggered
 * during a constraining situation that requires rescheduling.
 * </p>
 * 
 * This InitRenegotiation event will be the origin of the
 * renegotiation process.
 * 
 * @author komi AGOTSI
 */
@SarlSpecification("0.9")
@SarlElementType(15)
@SuppressWarnings("all")
public class InitRenegotiation extends Event {
  @SyntheticMember
  public InitRenegotiation() {
    super();
  }
  
  @SyntheticMember
  public InitRenegotiation(final Address source) {
    super(source);
  }
  
  @SyntheticMember
  private final static long serialVersionUID = 588368462L;
}
