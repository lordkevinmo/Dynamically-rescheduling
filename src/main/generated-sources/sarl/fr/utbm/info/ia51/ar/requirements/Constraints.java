package fr.utbm.info.ia51.ar.requirements;

import fr.utbm.info.ia51.ar.requirements.ConstrainsType;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author Koffi AGBENYA
 */
@SarlSpecification("0.9")
@SarlElementType(10)
@SuppressWarnings("all")
public class Constraints {
  private ConstrainsType type;
  
  private int influence;
  
  private int hour;
  
  public Constraints(final ConstrainsType constraint, final int hour, final int influence) {
    this.type = constraint;
    this.influence = influence;
    this.hour = hour;
  }
  
  @Pure
  public ConstrainsType getType() {
    return this.type;
  }
  
  public void setType(final ConstrainsType type) {
    this.type = type;
  }
  
  @Pure
  public int getHour() {
    return this.hour;
  }
  
  public void setHour(final int h) {
    this.hour = h;
  }
  
  @Pure
  public int getInfluence() {
    return this.influence;
  }
  
  public void setInfluence(final int influ) {
    this.influence = influ;
  }
  
  @Override
  @Pure
  @SyntheticMember
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Constraints other = (Constraints) obj;
    if (other.influence != this.influence)
      return false;
    if (other.hour != this.hour)
      return false;
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + this.influence;
    result = prime * result + this.hour;
    return result;
  }
}
