package fr.utbm.info.ia51.ar.events;

import fr.utbm.info.ia51.ar.requirements.Constraints;
import fr.utbm.info.ia51.ar.requirements.Episode;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Event;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * @author Lilian Durand
 */
@SarlSpecification("0.9")
@SarlElementType(15)
@SuppressWarnings("all")
public class perturbation extends Event {
  public Constraints constraint;
  
  public Episode episode;
  
  public perturbation(final Constraints constraint, final Episode episode) {
    this.constraint = constraint;
    this.episode = episode;
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
   * Returns a String representation of the perturbation event's attributes only.
   */
  @SyntheticMember
  @Pure
  protected void toString(final ToStringBuilder builder) {
    super.toString(builder);
    builder.add("constraint", this.constraint);
    builder.add("episode", this.episode);
  }
  
  @SyntheticMember
  private static final long serialVersionUID = -2901444723L;
}
