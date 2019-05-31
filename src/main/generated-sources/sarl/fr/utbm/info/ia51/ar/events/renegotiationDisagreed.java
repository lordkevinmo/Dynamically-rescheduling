package fr.utbm.info.ia51.ar.events;

import fr.utbm.info.ia51.ar.requirements.Schedule;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Event;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * @author Secret
 */
@SarlSpecification("0.9")
@SarlElementType(15)
@SuppressWarnings("all")
public class renegotiationDisagreed extends Event {
  public Schedule newSchedule;
  
  public renegotiationDisagreed(final Schedule schedule) {
    this.newSchedule = schedule;
  }
  
  @Override
  @Pure
  @SyntheticMember
  public boolean equals(final Object obj) {
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    return result;
  }
  
  /**
   * Returns a String representation of the renegotiationDisagreed event's attributes only.
   */
  @SyntheticMember
  @Pure
  protected void toString(final ToStringBuilder builder) {
    super.toString(builder);
    builder.add("newSchedule", this.newSchedule);
  }
  
  @SyntheticMember
  private static final long serialVersionUID = -284435076L;
}
