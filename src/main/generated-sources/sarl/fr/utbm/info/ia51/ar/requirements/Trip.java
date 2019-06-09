package fr.utbm.info.ia51.ar.requirements;

import fr.utbm.info.ia51.ar.requirements.DayOfWeek;
import fr.utbm.info.ia51.ar.requirements.Location;
import fr.utbm.info.ia51.ar.requirements.PersonnalInfo;
import fr.utbm.info.ia51.ar.requirements.Task;
import fr.utbm.info.ia51.ar.requirements.TravelMode;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
@XmlRootElement(name = "Trip")
@XmlAccessorType(XmlAccessType.PROPERTY)
@SarlSpecification("0.9")
@SarlElementType(10)
@SuppressWarnings("all")
public class Trip extends Task {
  private Location origin;
  
  private String path;
  
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
  public Trip(final int id, final Location origin, final int startTime, final int duration, final Location destination, final TravelMode mode, final List<PersonnalInfo> participants, final DayOfWeek dayofWeek) {
    this.origin = origin;
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
  @XmlElement(name = "origin")
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
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Trip other = (Trip) obj;
    if (!Objects.equals(this.path, other.path)) {
      return false;
    }
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + Objects.hashCode(this.path);
    return result;
  }
}
