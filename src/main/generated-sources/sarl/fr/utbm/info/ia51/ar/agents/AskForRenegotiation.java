package fr.utbm.info.ia51.ar.agents;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Address;
import io.sarl.lang.core.Event;

/**
 * <p> This event is issued by agent in order to negotiate a new
 * schedule with the participant of the activity or trip following
 * a constraining situation leading an agent to reschedule his
 * activity.
 * </p>
 * 
 * 
 * @author  komi AGOTSI
 */
@SarlSpecification("0.9")
@SarlElementType(15)
@SuppressWarnings("all")
public class AskForRenegotiation extends Event {
  @SyntheticMember
  public AskForRenegotiation() {
    super();
  }
  
  @SyntheticMember
  public AskForRenegotiation(final Address source) {
    super(source);
  }
}
