package fr.utbm.info.ia51.ar.events;

import fr.utbm.info.ia51.ar.events.perturbation;
import fr.utbm.info.ia51.ar.requirements.Schedule;
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
public class renegotiation extends Event {
  public Schedule newSchedule;
  
  public perturbation perturb;
  
  @SyntheticMember
  public renegotiation() {
    super();
  }
  
  @SyntheticMember
  public renegotiation(final Address source) {
    super(source);
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
   * Returns a String representation of the renegotiation event's attributes only.
   */
  @SyntheticMember
  @Pure
  protected void toString(final ToStringBuilder builder) {
    super.toString(builder);
    builder.add("newSchedule", this.newSchedule);
    builder.add("perturb", this.perturb);
  }
<<<<<<< HEAD
  
  @SyntheticMember
  private static final long serialVersionUID = 2000066274L;
=======
>>>>>>> a964ccd9ac12f65bb890ba9dff4d4bace10f9fbb
}
