package fr.utbm.info.ia51.ar.ui;

import fr.utbm.info.ia51.ar.ui.Refresh;
import io.sarl.javafx.FxViewerController;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Event;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import javafx.fxml.FXML;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * JavaFX controller for the JavaFX application.
 */
@SarlSpecification("0.9")
@SarlElementType(10)
@SuppressWarnings("all")
public class MyAppFxViewerController extends FxViewerController {
  private final AtomicBoolean launched = new AtomicBoolean(false);
  
  private UUID launchedAgent;
  
  /**
   * UI initialization. The agent framework is started.
   */
  @FXML
  public UUID initialize() {
    throw new Error("Unresolved compilation problems:"
      + "\nMyAgent cannot be resolved to a type."
      + "\nType mismatch: cannot convert from Class<void> to Class<? extends Agent>");
  }
  
  @Pure
  protected void refreshScreen() {
  }
  
  /**
   * React to any request from the agent refresh the UI.
   */
  public void _receiveEvent(final Refresh event) {
    this.refreshScreen();
  }
  
  public void receiveEvent(final Event event) {
    if (event instanceof Refresh) {
      _receiveEvent((Refresh)event);
      return;
    } else if (event != null) {
      _receiveEvent(event);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(event).toString());
    }
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
    MyAppFxViewerController other = (MyAppFxViewerController) obj;
    if (!Objects.equals(this.launchedAgent, other.launchedAgent)) {
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
    result = prime * result + Objects.hashCode(this.launchedAgent);
    return result;
  }
  
  @SyntheticMember
  public MyAppFxViewerController() {
    super();
  }
}
