package fr.utbm.info.ia51.ar.requirements;

public class Schedule {
<<<<<<< HEAD
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
  @XmlElement(name = "Episode")
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
=======
>>>>>>> a964ccd9ac12f65bb890ba9dff4d4bace10f9fbb
}
