package fr.utbm.info.ia51.ar.requirements;

import fr.utbm.info.ia51.ar.requirements.Location;
import fr.utbm.info.ia51.ar.requirements.Task;
import fr.utbm.info.ia51.ar.requirements.TravelMode;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import java.util.ArrayList;
import java.util.Date;
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
@SarlSpecification("0.9")
@SarlElementType(10)
@SuppressWarnings("all")
public class Trip extends Task {
  private Location origin;
  
  private String path;
  
  private TravelMode travelMode;
  
  /**
   * Constructor to initialize Trip object
   * 
   * @param origin location from where user begin his trip
   * @param startTime when the trip begin
   * @param duration of the trip
   * @param destination of the trip
   * @param mode which the user used for traveling. -> travel mode
   */
  public Trip(final Location origin, final Date startTime, final int duration, final Location destination, final TravelMode mode) {
    this.origin = origin;
    this.setStartTime(startTime);
    this.setDuration(duration);
    this.setLocation(destination);
    this.travelMode = mode;
    this.path = null;
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
  public void setOrigin(final Location origin) {
    this.origin = origin;
  }
  
  /**
   * @return the path followed by the user for his trip
   */
  @Pure
  public String getPath() {
    return this.path;
  }
  
  /**
   * @param path followed by the user for reaching his destination
   */
  public void setPath(final String path) {
    this.path = path;
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
  public void setTravelMode(final TravelMode mode) {
    this.travelMode = mode;
  }
  
  /**
   * @return all the travel mode add in the enumeration TravelMode enum file.
   */
  @Pure
  public ArrayList<TravelMode> getAllTravelMode() {
    ArrayList<TravelMode> modes = new ArrayList<TravelMode>();
    TravelMode[] _values = TravelMode.values();
    for (final TravelMode mode : _values) {
      modes.add(mode);
    }
    return modes;
  }
  
  @Override
  @Pure
  @SyntheticMember
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe return type is incompatible with equals(Object). Current method has the return type: void. The super method has the return type: boolean."
      + "\nThe return type is incompatible with equals(Object). Current method has the return type: void. The super method has the return type: boolean.");
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe return type is incompatible with equals(Object). Current method has the return type: void. The super method has the return type: boolean.");
  }
}
