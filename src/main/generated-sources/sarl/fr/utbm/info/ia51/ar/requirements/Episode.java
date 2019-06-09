package fr.utbm.info.ia51.ar.requirements;

import fr.utbm.info.ia51.ar.requirements.Activity;
import fr.utbm.info.ia51.ar.requirements.Trip;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author Koffi AGBENYA
 * 
 * The episode class consists of a pair of activity and trip.
 */
@XmlRootElement(name = "Episode")
@XmlAccessorType(XmlAccessType.PROPERTY)
@SarlSpecification("0.9")
@SarlElementType(10)
@SuppressWarnings("all")
public class Episode {
  private int id;
  
  private Trip trip;
  
  private Activity activity;
  
  public Episode() {
    super();
  }
  
  public Episode(final int name, final Activity activity, final Trip trip) {
    this.id = name;
    this.activity = activity;
    this.trip = trip;
  }
  
  /**
   * @return the name of the episode
   */
  @Pure
  public int getId() {
    return this.id;
  }
  
  /**
   * @param newName which we set to the episode name
   */
  @XmlElement(name = "id")
  public void setId(final int newId) {
    this.id = newId;
  }
  
  /**
   * @return the current activity
   */
  @Pure
  public Activity getActivity() {
    return this.activity;
  }
  
  /**
   * @param: Activity: act is an activity witch is set to the episode
   */
  @XmlElement(name = "Activity")
  public void setActivity(final Activity act) {
    this.activity = act;
  }
  
  /**
   * @return the current trip
   */
  @Pure
  public Trip getTrip() {
    return this.trip;
  }
  
  /**
   * @param Trip : trip which is set to the episode
   */
  @XmlElement(name = "Trip")
  public void setTrip(final Trip trip) {
    this.trip = trip;
  }
  
  @Override
  @Pure
  public String toString() {
    return ("id episode" + Integer.valueOf(this.id));
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
    Episode other = (Episode) obj;
    if (other.id != this.id)
      return false;
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + this.id;
    return result;
  }
}
