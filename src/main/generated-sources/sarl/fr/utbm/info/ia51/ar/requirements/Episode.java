package fr.utbm.info.ia51.ar.requirements;

import fr.utbm.info.ia51.ar.requirements.Activity;
import fr.utbm.info.ia51.ar.requirements.Trip;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author Koffi AGBENYA
 * 
 * The episode class consists of a pair of activity and trip.
 */
/* @XmlRootElement()
@XmlAccessorType(/* name is null */./* name is null */) */@SarlSpecification("0.8")
@SarlElementType(10)
public class Episode {
  private int id;
  
  private Trip trip;
  
  private Activity activity;
  
  public Episode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method super() is undefined");
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
<<<<<<< HEAD
  @XmlElement(name = "id")
  public void setId(final int newId) {
    this.id = newId;
=======
  public void setId(final /* String */Object newId) {
    this.id = (newId).StringValue();
>>>>>>> a964ccd9ac12f65bb890ba9dff4d4bace10f9fbb
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
<<<<<<< HEAD
  @XmlElement(name = "Activity")
  public void setActivity(final Activity act) {
=======
  /* @XmlElement()
   */public void setActivity(final Activity act) {
>>>>>>> a964ccd9ac12f65bb890ba9dff4d4bace10f9fbb
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
<<<<<<< HEAD
  @XmlElement(name = "Trip")
  public void setTrip(final Trip trip) {
=======
  /* @XmlElement()
   */public void setTrip(final Trip trip) {
>>>>>>> a964ccd9ac12f65bb890ba9dff4d4bace10f9fbb
    this.trip = trip;
  }
  
  @Pure
  public String toString() {
    return ("id episode" + Integer.valueOf(this.id));
  }
  
  @Override
  @Pure
  @SyntheticMember
  public boolean equals(final java.lang.Object obj) {
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
  
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + this.id;
    return result;
  }
}
