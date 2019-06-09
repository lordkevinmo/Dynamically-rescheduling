package fr.utbm.info.ia51.ar.requirements;

import fr.utbm.info.ia51.ar.requirements.DayOfWeek;
import fr.utbm.info.ia51.ar.requirements.Location;
import fr.utbm.info.ia51.ar.requirements.PersonnalInfo;
import fr.utbm.info.ia51.ar.requirements.Task;
import fr.utbm.info.ia51.ar.requirements.TravelMode;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author Koffi AGBENYA
 * 
 * This class defines the characteristics of a Trip in this project point view.
 * It represents the way that an person traveled to a destination for in the future
 * doing some activity. The properties are :
 * - origin :
 * - travel mode :
 * - path :
 */
/* @XmlRootElement()
@XmlAccessorType(/* name is null */./* name is null */) */@SarlSpecification("0.8")
@SarlElementType(10)
public class Trip extends Task {
  private Location origin;
  
  private /* String */Object path;
  
  private TravelMode travelMode;
  
  public Trip() {
    super();
  }
  
  /**
   * Constructor to initialize Trip object
   * 
   * @param origin location from where user begin his trip
   * @param startTime when the trip begin
   * @param duration of the trip
   * @param destination of the trip
   * @param mode which the user used for traveling. -> travel mode
   */
<<<<<<< HEAD
  public Trip(final int id, final Location origin, final int startTime, final int duration, final Location destination, final TravelMode mode, final List<PersonnalInfo> participants, final DayOfWeek dayofWeek) {
    this.origin = origin;
    this.travelMode = mode;
    this.path = null;
=======
  public Trip(final int id, final Location origin, final int startTime, final int duration, final Location destination, final TravelMode mode, final /* List<Person> */Object participants, final DayOfWeek dayofWeek) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe constructor Task(int, int, int, Location, List, DayOfWeek) refers to the missing type List"
      + "\nThe field Trip.path refers to the missing type String");
>>>>>>> a964ccd9ac12f65bb890ba9dff4d4bace10f9fbb
  }
  
  /**
   * @return the origin of the trip
   */
  @Pure
  public Location getOrigin() {
    return this.origin;
  }
  
  /**
   * @param origin of the trip
   */
  /* @XmlElement()
   */public void setOrigin(final Location origin) {
    this.origin = origin;
  }
  
  /**
   * @return the path followed by the user for his trip
   */
  @Pure
  public /* String */Object getPath() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field Trip.path refers to the missing type String");
  }
  
  /**
   * @param path followed by the user for reaching his destination
   */
  public void setPath(final /* String */Object path) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field Trip.path refers to the missing type String");
  }
  
  /**
   * @return the travel mode that user take for reaching the destination
   */
  @Pure
  public TravelMode getTravelMode() {
    return this.travelMode;
  }
  
  /**
   * @param mode for reaching the destination
   */
<<<<<<< HEAD
  public void setTravelMode(final TravelMode mode) {
=======
  /* @XmlElement()
   */public void setTravelMode(final TravelMode mode) {
>>>>>>> a964ccd9ac12f65bb890ba9dff4d4bace10f9fbb
    this.travelMode = mode;
  }
  
  /**
   * @return all the travel mode add in the enumeration TravelMode enum file.
   */
  @Pure
  public /* ArrayList<TravelMode> */Object getAllTravelMode() {
    throw new Error("Unresolved compilation problems:"
      + "\nArrayList cannot be resolved to a type."
      + "\nArrayList cannot be resolved."
      + "\nvalues cannot be resolved"
      + "\nadd cannot be resolved");
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
}
