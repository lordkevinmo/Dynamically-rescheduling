package fr.utbm.info.ia51.ar.requirements;

import fr.utbm.info.ia51.ar.requirements.DayOfWeek;
import fr.utbm.info.ia51.ar.requirements.Location;
import fr.utbm.info.ia51.ar.requirements.PersonnalInfo;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author koffi AGBENYA
 * 
 * This abstract class defines the entities that classes Trip and Activity have in common.
 * 
 * That properties are :
 * - Start time :
 * - Duration :
 * - Location : Represent the destination or the location where the trip finished or an activity
 *   will be carried out
 */
@SarlSpecification("0.8")
@SarlElementType(10)
<<<<<<< HEAD
@SuppressWarnings("all")
public class Task {
=======
public abstract class Task {
>>>>>>> a964ccd9ac12f65bb890ba9dff4d4bace10f9fbb
  private int id;
  
  private int startTime;
  
  private int duration;
  
  private Location location;
  
<<<<<<< HEAD
  private List<PersonnalInfo> participants;
=======
  private /* List<Person> */Object participants;
>>>>>>> a964ccd9ac12f65bb890ba9dff4d4bace10f9fbb
  
  private DayOfWeek dayofWeek;
  
  public Task() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method super() is undefined");
  }
  
<<<<<<< HEAD
  public Task(final int id, final int startTime, final int duration, final Location location, final List<PersonnalInfo> participants, final DayOfWeek dayofWeek) {
    this.id = id;
    this.startTime = startTime;
    this.duration = duration;
    this.location = location;
    this.participants = participants;
    this.dayofWeek = dayofWeek;
=======
  public Task(final int id, final int startTime, final int duration, final Location location, final /* List<Person> */Object participants, final DayOfWeek dayofWeek) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field Task.participants refers to the missing type List");
>>>>>>> a964ccd9ac12f65bb890ba9dff4d4bace10f9fbb
  }
  
  /**
   * return the start time of the task
   */
  @Pure
  public int getStartTime() {
    return this.startTime;
  }
  
  /**
   * Set the start time of the Task
   * @param : startTime is the start date and time
   */
<<<<<<< HEAD
  public void setStartTime(final int startTime) {
=======
  /* @XmlElement()
   */public void setStartTime(final int startTime) {
>>>>>>> a964ccd9ac12f65bb890ba9dff4d4bace10f9fbb
    this.startTime = startTime;
  }
  
  /**
   * return the duration of this task
   */
  @Pure
  public int getDuration() {
    return this.duration;
  }
  
  /**
   * Set the duration of the task
   * @param duration : of the task
   */
  /* @XmlElement()
   */public void setDuration(final int duration) {
    this.duration = duration;
  }
  
  /**
   * return the current location of the task
   */
  @Pure
  public Location getLocation() {
    return this.location;
  }
  
  /**
   * Set the location of the current task
   */
<<<<<<< HEAD
  @XmlElement(name = "Location")
  public void setLocation(final Location location) {
=======
  /* @XmlElement()
   */public void setLocation(final Location location) {
>>>>>>> a964ccd9ac12f65bb890ba9dff4d4bace10f9fbb
    this.location = location;
  }
  
  /**
   * @return the participants of the task
   */
  @Pure
<<<<<<< HEAD
  public List<PersonnalInfo> getParticipants() {
    return this.participants;
=======
  public /* List<Person> */Object getParticipants() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field Task.participants refers to the missing type List");
>>>>>>> a964ccd9ac12f65bb890ba9dff4d4bace10f9fbb
  }
  
  /**
   * @param : participants are the list of all the participants
   * involved in the task
   */
<<<<<<< HEAD
  @XmlElement(name = "PersonnalInfos")
  public void setParticipants(final List<PersonnalInfo> participants) {
    this.participants = participants;
=======
  /* @XmlElement()
   */public void setParticipants(final /* List<Person> */Object participants) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field Task.participants refers to the missing type List");
>>>>>>> a964ccd9ac12f65bb890ba9dff4d4bace10f9fbb
  }
  
  /**
   * @return the id of the task
   */
<<<<<<< HEAD
  @Pure
=======
  /* @XmlElement()
   */@Pure
>>>>>>> a964ccd9ac12f65bb890ba9dff4d4bace10f9fbb
  public int getId() {
    return this.id;
  }
  
  /**
   * @return the id of the task
   */
  @XmlElement(name = "id")
  public int setId(final int id) {
    return this.id = id;
  }
  
  /**
   * @return The day on which the activity will take place
   */
  @Pure
  public DayOfWeek getDayOfWeek() {
    return this.dayofWeek;
  }
  
  /**
   * @param The day on which the activity will take place
   */
<<<<<<< HEAD
  @XmlElement(name = "dayofweek")
  public void setDayOfWeek(final DayOfWeek dayofWeek) {
=======
  /* @XmlElement()
   */public void setDayOfWeek(final DayOfWeek dayofWeek) {
>>>>>>> a964ccd9ac12f65bb890ba9dff4d4bace10f9fbb
    this.dayofWeek = dayofWeek;
  }
  
  @Pure
  @SyntheticMember
  public boolean equals(final java.lang.Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Task other = (Task) obj;
    if (other.id != this.id)
      return false;
    if (other.startTime != this.startTime)
      return false;
    if (other.duration != this.duration)
      return false;
    return super.equals(obj);
  }
  
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + this.id;
    result = prime * result + this.startTime;
    result = prime * result + this.duration;
    return result;
  }
}
