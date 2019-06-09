package fr.utbm.info.ia51.ar.requirements;

import fr.utbm.info.ia51.ar.requirements.ActivityType;
import fr.utbm.info.ia51.ar.requirements.DayOfWeek;
import fr.utbm.info.ia51.ar.requirements.Location;
import fr.utbm.info.ia51.ar.requirements.PersonnalInfo;
import fr.utbm.info.ia51.ar.requirements.Task;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
<<<<<<< HEAD
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
=======
>>>>>>> a964ccd9ac12f65bb890ba9dff4d4bace10f9fbb
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author Koffi AGBENYA
 * 
 * This class defines the characteristics of an Activity in this project point of view.
 * Activity extends the Task abstract class. The properties are :
 * - type of the Activity
 * - the Task properties
 */
<<<<<<< HEAD
@SarlSpecification("0.9")
=======
/* @XmlRootElement()
@XmlAccessorType(/* name is null */./* name is null */) */@SarlSpecification("0.8")
>>>>>>> a964ccd9ac12f65bb890ba9dff4d4bace10f9fbb
@SarlElementType(10)
public class Activity extends Task {
  private ActivityType type;
  
  public Activity() {
    super();
  }
  
<<<<<<< HEAD
  public Activity(final ActivityType type, final int id, final int startTime, final int duration, final Location location, final List<PersonnalInfo> participants, final DayOfWeek dayofWeek) {
    this.type = type;
=======
  public Activity(final ActivityType type, final int id, final int startTime, final int duration, final Location location, final /* List<Person> */Object participants, final DayOfWeek dayofWeek) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe constructor Task(int, int, int, Location, List, DayOfWeek) refers to the missing type List");
>>>>>>> a964ccd9ac12f65bb890ba9dff4d4bace10f9fbb
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
  /* @XmlElement()
   */public void setType(final ActivityType type) {
    this.type = type;
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
