package fr.utbm.info.ia51.ar.events;

import fr.utbm.info.ia51.ar.requirements.PersonnalInfo;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Event;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * @author komi Agotsi
 */
@SarlSpecification("0.9")
@SarlElementType(15)
@SuppressWarnings("all")
public class InitAgent extends Event {
  public PersonnalInfo data;
  
  public InitAgent(final PersonnalInfo data) {
    this.data = data;
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
   * Returns a String representation of the InitAgent event's attributes only.
   */
  @SyntheticMember
  @Pure
  protected void toString(final ToStringBuilder builder) {
    super.toString(builder);
    builder.add("data", this.data);
  }
  
  @SyntheticMember
  private static final long serialVersionUID = -1217501969L;
}
