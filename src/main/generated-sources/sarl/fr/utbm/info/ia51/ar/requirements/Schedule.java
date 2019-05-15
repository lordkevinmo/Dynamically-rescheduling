package fr.utbm.info.ia51.ar.requirements;

import fr.utbm.info.ia51.ar.requirements.Episode;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author komi AGOTSI
 */
@SarlSpecification("0.9")
@SarlElementType(10)
@SuppressWarnings("all")
public class Schedule {
  private List<Episode> episodes;
  
  public Schedule(final List<Episode> episodes) {
    this.episodes = episodes;
  }
  
  /**
   * @return  List<Episode>
   * 						List of episodes
   */
  @Pure
  public List<Episode> getEpisodes() {
    return this.episodes;
  }
  
  /**
   * @param List<Episode>
   * 					List of episodes
   */
  public void setEpisodes(final List<Episode> episodes) {
    this.episodes = episodes;
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
