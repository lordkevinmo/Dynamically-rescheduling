package fr.utbm.info.ia51.ar.requirements;

import fr.utbm.info.ia51.ar.requirements.ActivityType;
import fr.utbm.info.ia51.ar.requirements.DayOfWeek;
import fr.utbm.info.ia51.ar.requirements.Location;
import fr.utbm.info.ia51.ar.requirements.PersonnalInfo;
import fr.utbm.info.ia51.ar.requirements.Task;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author Koffi AGBENYA
 * 
 * This class defines the characteristics of an Activity in this project point of view.
 * Activity extends the Task abstract class. The properties are :
 * - type of the Activity
 * - the Task properties
 */
@SarlSpecification("0.9")
@SarlElementType(10)
@SuppressWarnings("all")
public class Activity extends Task {
  private ActivityType type;
  
  public Activity() {
    super();
  }
  
  public Activity(final ActivityType type, final int id, final int startTime, final int duration, final Location location, final List<PersonnalInfo> participants, final DayOfWeek dayofWeek) {
    this.type = type;
  }
  
  /**
   * @return the type of activity
   */
  @Pure
  public ActivityType getType() {
    return this.type;
  }
  
  /**
   * @param type of the activity
   */
  @XmlElement(name = "type")
  public void setType(final ActivityType type) {
    this.type = type;
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
