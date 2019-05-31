package fr.utbm.info.ia51.ar.requirements;

import fr.utbm.info.ia51.ar.agents.Person;
import fr.utbm.info.ia51.ar.requirements.DayOfWeek;
import fr.utbm.info.ia51.ar.requirements.Location;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
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
@SarlSpecification("0.9")
@SarlElementType(10)
@SuppressWarnings("all")
public abstract class Task {
  private int id;
  
  private int startTime;
  
  private int duration;
  
  private Location location;
  
  private List<Person> participants;
  
  private DayOfWeek dayofWeek;
  
  public Task() {
    super();
  }
  
  public Task(final int id, final int startTime, final int duration, final Location location, final List<Person> participants, final DayOfWeek dayofWeek) {
    this.id = id;
    this.startTime = startTime;
    this.duration = duration;
    this.location = location;
    this.participants = participants;
    this.dayofWeek = dayofWeek;
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
  @XmlElement(name = "startTime")
  public void setStartTime(final int startTime) {
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
  @XmlElement(name = "duration")
  public void setDuration(final int duration) {
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
  @XmlElement(name = "location")
  public void setLocation(final Location location) {
    this.location = location;
  }
  
  /**
   * @return the participants of the task
   */
  @Pure
  public List<Person> getParticipants() {
    return this.participants;
  }
  
  /**
   * @param : participants are the list of all the participants
   * involved in the task
   */
  @XmlElement(name = "participants")
  public void setParticipants(final List<Person> participants) {
    this.participants = participants;
  }
  
  /**
   * @return the id of the task
   */
  @XmlElement(name = "id")
  @Pure
  public int getId() {
    return this.id;
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
  @XmlElement(name = "dayofWeek")
  public void setDayOfWeek(final DayOfWeek dayofWeek) {
    this.dayofWeek = dayofWeek;
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
    Task other = (Task) obj;
    if (other.id != this.id)
      return false;
    if (other.startTime != this.startTime)
      return false;
    if (other.duration != this.duration)
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
    result = prime * result + this.startTime;
    result = prime * result + this.duration;
    return result;
  }
}
