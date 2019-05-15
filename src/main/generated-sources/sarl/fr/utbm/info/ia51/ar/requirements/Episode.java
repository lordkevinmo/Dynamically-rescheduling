package fr.utbm.info.ia51.ar.requirements;

import fr.utbm.info.ia51.ar.requirements.Activity;
import fr.utbm.info.ia51.ar.requirements.Trip;
import fr.utbm.info.ia51.ar.requirements.Tuple;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import java.util.Objects;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author Koffi AGBENYA
 * 
 * The episode class consists of a pair of activity and trip.
 */
@SarlSpecification("0.9")
@SarlElementType(10)
@SuppressWarnings("all")
public class Episode {
  private String name;
  
  private Tuple<Trip, Activity> episode;
  
  public Episode(final String name, final Tuple<Trip, Activity> episode) {
    this.name = name;
    this.episode = episode;
  }
  
  /**
   * @return the name of the episode
   */
  @Pure
  public String getName() {
    return this.name;
  }
  
  /**
   * @param newName which we set to the episode name
   */
  public void setName(final String newName) {
    this.name = newName;
  }
  
  /**
   * @return the current episode
   */
  @Pure
  public Tuple<Trip, Activity> getEpisode() {
    return this.episode;
  }
  
  /**
   * @param newEps which we set to the current episode
   */
  public void setEpisode(final Tuple<Trip, Activity> newEps) {
    this.episode = newEps;
  }
  
  /**
   * @return the activity related to the current episode
   */
  @Pure
  public Activity getActivity() {
    return this.episode.getSecond();
  }
  
  /**
   * @return the Trip related to the current episode
   */
  @Pure
  public Trip getTrip() {
    return this.episode.getFirst();
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
    if (!Objects.equals(this.name, other.name)) {
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
    result = prime * result + Objects.hashCode(this.name);
    return result;
  }
}
