package fr.utbm.info.ia51.ar.events;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Address;
import io.sarl.lang.core.Event;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * @author Lilian Durand
 */
@SarlSpecification("0.8")
@SarlElementType(15)
public class ConfirmInitiator extends Event {
  public /* List<Address> */Object participants;
  
  public ConfirmInitiator(final /* List<Address> */Object participants) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field ConfirmInitiator.participants refers to the missing type List");
  }
  
  @Pure
  @SyntheticMember
  public boolean equals(final java.lang.Object obj) {
    return super.equals(obj);
  }
  
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    return result;
  }
  
  /**
   * Returns a String representation of the ConfirmInitiator event's attributes only.
   */
  @SyntheticMember
  @Pure
  protected void toString(final ToStringBuilder builder) {
    super.toString(builder);
    builder.add("participants", this.participants);
  }
}
