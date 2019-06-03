package fr.utbm.info.ia51.ar.ui;

import fr.utbm.info.ia51.ar.ui.Refresh;
import io.sarl.javafx.FxViewerController;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Event;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * JavaFX controller for the JavaFX application.
 */
@SarlSpecification("0.8")
@SarlElementType(10)
public class MyAppFxViewerController extends FxViewerController {
  private final Object launched /* Skipped initializer because of errors */;
  
  private /* UUID */Object launchedAgent;
  
  private /* Desktop */Object desktop /* Skipped initializer because of errors */;
  
  private final /* FileChooser */Object fileChooser /* Skipped initializer because of errors */;
  
  /* @FXML
   */private /* BorderPane */Object borderPane;
  
  /**
   * UI initialization. The agent framework is started.
   */
  /* @FXML
   */public UUID initialize() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method startAgentApplication(java.lang.Class, (Object)=>java.lang.Object) is undefined"
      + "\nThe field MyAppFxViewerController.launched refers to the missing type Object"
      + "\nThe field MyAppFxViewerController.launchedAgent refers to the missing type UUID"
      + "\ngetAndSet cannot be resolved"
      + "\n! cannot be resolved");
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
  
  /* @FXML
   */protected Object participants(final /* MouseEvent */Object events) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field System is undefined"
      + "\nThe method loadUI(String) from the type MyAppFxViewerController refers to the missing type Object"
      + "\nout cannot be resolved"
      + "\nprintln cannot be resolved");
  }
  
  /* @FXML
   */@Pure
  protected void home(final /* MouseEvent */Object events) {
  }
  
  /* @FXML
   */@Pure
  protected void jointrip(final /* MouseEvent */Object events) {
  }
  
  /* @FXML
   */@Pure
  private void simulate(final /* MouseEvent */Object events) {
  }
  
  /* @FXML
   */@Pure
  private void about(final /* MouseEvent */Object events) {
  }
  
  /* @FXML
   */private Object loadUI(final /* String */Object ui) {
    throw new Error("Unresolved compilation problems:"
      + "\nParent cannot be resolved to a type."
      + "\nVBox cannot be resolved to a type."
      + "\nIOException cannot be resolved to a type."
      + "\nThe method or field FXMLLoader is undefined"
      + "\nThe method or field class is undefined"
      + "\nNo exception of type IOException can be thrown; an exception type must be a subclass of Throwable"
      + "\nload cannot be resolved"
      + "\ngetResource cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nprintStackTrace cannot be resolved"
      + "\nloadBorderPaneCenter cannot be resolved");
  }
  
  /* @FXML
   */private Object openFile(final /* File */Object file) {
    throw new Error("Unresolved compilation problems:"
      + "\nIOException cannot be resolved to a type."
      + "\nThe field MyAppFxViewerController.desktop refers to the missing type Desktop"
      + "\nNo exception of type IOException can be thrown; an exception type must be a subclass of Throwable"
      + "\nopen cannot be resolved"
      + "\nprintStackTrace cannot be resolved");
  }
  
  /* @FXML
   */protected void loadData(final /* ActionEvent */Object events) {
    throw new Error("Unresolved compilation problems:"
      + "\nFile cannot be resolved to a type."
      + "\nList cannot be resolved to a type."
      + "\nThe method or field System is undefined"
      + "\nThe method or field Arrays is undefined"
      + "\nFile cannot be resolved to a type."
      + "\nThe field MyAppFxViewerController.fileChooser refers to the missing type FileChooser"
      + "\nThe method openFile(File) from the type MyAppFxViewerController refers to the missing type Object"
      + "\nout cannot be resolved"
      + "\nprintln cannot be resolved"
      + "\nshowOpenDialog cannot be resolved"
      + "\nstage cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nasList cannot be resolved");
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
  
  @Pure
  @SyntheticMember
  public boolean equals(final java.lang.Object obj) {
    return super.equals(obj);
  }
  
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    return result;
  }
  
  @SyntheticMember
  public MyAppFxViewerController() {
    super();
  }
}
