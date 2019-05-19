package fr.utbm.info.ia51.ar.agents;

import fr.utbm.info.ia51.ar.agents.renegotiation;
import io.sarl.lang.annotation.PerceptGuardEvaluator;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Agent;
import io.sarl.lang.core.Behavior;
import java.util.Collection;

/**
 * @author Lilian Durand
 */
@SarlSpecification("0.9")
@SarlElementType(20)
@SuppressWarnings("all")
public class participant extends Behavior {
  private void $behaviorUnit$renegotiation$0(final renegotiation occurrence) {
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$renegotiation(final renegotiation occurrence, final Collection<Runnable> ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$renegotiation$0(occurrence));
  }
  
  @SyntheticMember
  public participant(final Agent agent) {
    super(agent);
  }
}
