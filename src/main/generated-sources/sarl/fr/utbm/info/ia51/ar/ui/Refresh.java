package fr.utbm.info.ia51.ar.ui;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Address;
import io.sarl.lang.core.Event;

/**
 * ** Request for refreshing the JavaFX screen.
 */
@SarlSpecification("0.9")
@SarlElementType(15)
@SuppressWarnings("all")
public class Refresh extends Event {
  @SyntheticMember
  public Refresh() {
    super();
  }
  
  @SyntheticMember
  public Refresh(final Address source) {
    super(source);
  }
  
  @SyntheticMember
  private final static long serialVersionUID = 588368462L;
}
