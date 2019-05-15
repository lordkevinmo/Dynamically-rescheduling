package fr.utbm.info.ia51.ar.ui;

import io.sarl.javafx.FxApplication;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

/**
 * Definition of the JavaFX application.
 */
@SarlSpecification("0.9")
@SarlElementType(10)
@SuppressWarnings("all")
public class MyAppFxApplication extends FxApplication {
  public FXMLLoader doApplicationStart(final Stage stage) {
    throw new Error("Unresolved compilation problems:"
      + "\nAccess restriction: The type FXMLLoader is not accessible due to restriction on required project Activity_rescheduling"
      + "\nAccess restriction: The type JavaFXBuilderFactory is not accessible due to restriction on required project Activity_rescheduling"
      + "\nAccess restriction: The type Parent is not accessible due to restriction on required project Activity_rescheduling"
      + "\nAccess restriction: The type Scene is not accessible due to restriction on required project Activity_rescheduling");
  }
  
  @SyntheticMember
  public MyAppFxApplication() {
    super();
  }
}
