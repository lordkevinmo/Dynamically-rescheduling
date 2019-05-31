package fr.utbm.info.ia51.ar.requirements;

import fr.utbm.info.ia51.ar.requirements.Episode;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author komi AGOTSI
 */
@XmlRootElement(name = "Schedule")
@XmlAccessorType(XmlAccessType.PROPERTY)
@SarlSpecification("0.9")
@SarlElementType(10)
@SuppressWarnings("all")
public class Schedule {
  private List<Episode> episodes;
  
  public Schedule() {
    super();
  }
  
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
  @XmlElement(name = "episode")
  public void setEpisodes(final List<Episode> episodes) {
    this.episodes = episodes;
  }
  
  @Pure
  public String toString() {
    return (("Schedule [episode =" + this.episodes) + "]");
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
