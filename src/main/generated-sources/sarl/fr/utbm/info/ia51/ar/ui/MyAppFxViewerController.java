package fr.utbm.info.ia51.ar.ui;

import com.google.common.base.Objects;
import fr.utbm.info.ia51.ar.agents.Environment;
import fr.utbm.info.ia51.ar.ui.MyAppFxApplication;
import fr.utbm.info.ia51.ar.ui.Refresh;
import io.sarl.javafx.FxViewerController;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Event;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure0;
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
  
  private Desktop desktop = Desktop.getDesktop();
  
  private final FileChooser fileChooser = new FileChooser();
  
  @FXML
  private BorderPane borderPane;
  
  /**
   * UI initialization. The agent framework is started.
   */
  @FXML
  public UUID initialize() {
    UUID _xifexpression = null;
    boolean _andSet = this.launched.getAndSet(true);
    boolean _not = (!_andSet);
    if (_not) {
      final Procedure0 _function = () -> {
      };
      _xifexpression = this.launchedAgent = this.startAgentApplication(Environment.class, _function);
    }
    return _xifexpression;
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
  
  @FXML
  protected void participants(final MouseEvent events) {
    System.out.println("I\'am here");
    this.loadUI("participants");
  }
  
  @FXML
  @Pure
  protected void home(final MouseEvent events) {
  }
  
  @FXML
  @Pure
  protected void jointrip(final MouseEvent events) {
  }
  
  @FXML
  @Pure
  private void simulate(final MouseEvent events) {
  }
  
  @FXML
  @Pure
  private void about(final MouseEvent events) {
  }
  
  @FXML
  private void loadUI(final String ui) {
    Parent root = null;
    VBox box = null;
    try {
      box = FXMLLoader.<VBox>load(this.getClass().getResource((ui + ".fxml")));
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException ex = (IOException)_t;
        ex.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    MyAppFxApplication.loadBorderPaneCenter(box);
  }
  
  @FXML
  private void openFile(final File file) {
    try {
      this.desktop.open(file);
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException ex = (IOException)_t;
        ex.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  @FXML
  protected void loadData(final ActionEvent events) {
    System.out.println("loading");
    File file = this.fileChooser.showOpenDialog(MyAppFxApplication.stage());
    boolean _notEquals = (!Objects.equal(file, null));
    if (_notEquals) {
      this.openFile(file);
      List<File> files = Arrays.<File>asList(file);
    }
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
    if (!java.util.Objects.equals(this.launchedAgent, other.launchedAgent)) {
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
    result = prime * result + java.util.Objects.hashCode(this.launchedAgent);
    return result;
  }
  
  @SyntheticMember
  public MyAppFxViewerController() {
    super();
  }
}
