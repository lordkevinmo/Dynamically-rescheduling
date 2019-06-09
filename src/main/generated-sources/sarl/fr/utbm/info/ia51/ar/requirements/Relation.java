package fr.utbm.info.ia51.ar.requirements;

import fr.utbm.info.ia51.ar.requirements.SocialStatus;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * this enables to mapping a relation betwenn two persons
 * @author Komi AGOTSI
 */
@XmlRootElement(name = "Relation")
@XmlAccessorType(XmlAccessType.PROPERTY)
@SarlSpecification("0.9")
@SarlElementType(10)
@SuppressWarnings("all")
public class Relation {
  private int firstPerson;
  
  private int secondPerson;
  
  private SocialStatus socialStatus;
  
  public Relation() {
  }
  
  public Relation(final int firstPerson, final int secondPerson, final SocialStatus socialStatus) {
    this.firstPerson = firstPerson;
    this.socialStatus = socialStatus;
    this.secondPerson = secondPerson;
  }
  
  @Pure
  public int getFirstPerson() {
    return this.firstPerson;
  }
  
  @XmlElement(name = "firstPerson")
  public void setFirstPerson(final int firstPerson) {
    this.firstPerson = firstPerson;
  }
  
  @Pure
  public int getSecondPerson() {
    return this.secondPerson;
  }
  
  @XmlElement(name = "secondPerson")
  public void setSecondPerson(final int secondPerson) {
    this.secondPerson = secondPerson;
  }
  
  @Pure
  public SocialStatus getSocialStatus() {
    return this.socialStatus;
  }
  
  @XmlElement(name = "socialStatus")
  public void setSocialStatus(final SocialStatus socialStatus) {
    this.socialStatus = socialStatus;
  }
  
  @Pure
  public static Relation relation(final List<Relation> relations, final int firstPerson, final int participant) {
    Relation relation = null;
    for (final Relation elt : relations) {
      {
        if ((((elt.firstPerson == firstPerson) && (elt.secondPerson == participant)) || ((elt.secondPerson == firstPerson) && (elt.firstPerson == participant)))) {
          relation = elt;
        }
        return relation;
      }
    }
    return null;
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
    Relation other = (Relation) obj;
    if (other.firstPerson != this.firstPerson)
      return false;
    if (other.secondPerson != this.secondPerson)
      return false;
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + this.firstPerson;
    result = prime * result + this.secondPerson;
    return result;
  }
}
