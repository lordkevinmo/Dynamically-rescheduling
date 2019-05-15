package fr.utbm.info.ia51.ar.requirements;

import fr.utbm.info.ia51.ar.requirements.Location;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import java.util.Date;
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
  private Date startTime;
  
  private int duration;
  
  private Location location;
  
  /**
   * return the start time of the task
   */
  @Pure
  public Date getStartTime() {
    return this.startTime;
  }
  
  /**
   * Set the start time of the Task
   * @startTime is the start date and time
   */
  public void setStartTime(final Date startTime) {
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
   * @duration : of the task
   */
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
  public void setLocation(final Location location) {
    this.location = location;
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
    result = prime * result + this.duration;
    return result;
  }
  
  @SyntheticMember
  public Task() {
    super();
  }
}
