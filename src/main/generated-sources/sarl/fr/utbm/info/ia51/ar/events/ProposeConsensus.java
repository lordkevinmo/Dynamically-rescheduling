package fr.utbm.info.ia51.ar.events;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Address;
import io.sarl.lang.core.Event;

/**
 * <p>
 * This event is issued by agent to propose a new schedule/consensus
 * following the reception of the
 * @see fr.utbm.info.ia51.ar.agents.AskForRenegotiation.Class
 * issued by the initator Agent.
 * 
 * </p>
 * @author  komi AGOTSI
 */
@SarlSpecification("0.8")
@SarlElementType(15)
public class ProposeConsensus extends Event {
  @SyntheticMember
  public ProposeConsensus() {
    super();
  }
  
  @SyntheticMember
  public ProposeConsensus(final Address source) {
    super(source);
  }
<<<<<<< HEAD
  
  @SyntheticMember
  private static final long serialVersionUID = 588368462L;
=======
>>>>>>> a964ccd9ac12f65bb890ba9dff4d4bace10f9fbb
}
