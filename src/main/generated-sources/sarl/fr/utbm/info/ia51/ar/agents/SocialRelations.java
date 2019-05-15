package fr.utbm.info.ia51.ar.agents;

import fr.utbm.info.ia51.ar.agents.Person;
import fr.utbm.info.ia51.ar.requirements.SocialStatus;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * This class is the definition of the relationship
 * that can be established between two people.
 * 
 * @author Komi AGOTSI
 */
@SarlSpecification("0.9")
@SarlElementType(10)
@SuppressWarnings("all")
public class SocialRelations {
  private SocialStatus socialStatus;
  
  private Person firstPerson;
  
  private Person secondPerson;
  
  public SocialRelations(final SocialStatus socialStatus, final Person firstPerson, final Person secondPerson) {
    this.socialStatus = socialStatus;
    this.firstPerson = firstPerson;
    this.secondPerson = secondPerson;
  }
  
  public void setSocialStatus(final SocialStatus socialStatus) {
    this.socialStatus = socialStatus;
  }
  
  public void setFirstPerson(final Person firstPerson) {
    this.firstPerson = firstPerson;
  }
  
  public void setSecondPerson(final Person secondPerson) {
    this.secondPerson = secondPerson;
  }
  
  @Pure
  public SocialStatus getSocialStatus() {
    return this.socialStatus;
  }
  
  @Pure
  public Person getFirstPerson() {
    return this.firstPerson;
  }
  
  @Pure
  public Person getSecondPerson() {
    return this.secondPerson;
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
}
