package fr.utbm.info.ia51.ar;

import fr.utbm.info.ia51.ar.ui.MyAppFxApplication;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import javafx.application.Application;
import javafx.stage.Stage;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * ** Request for refreshing the JavaFX screen.
 */
@SarlSpecification("0.9")
@SarlElementType(10)
@SuppressWarnings("all")
public class Main extends Application {
  @Pure
  public static void main(final String... args) {
    Application.launch(MyAppFxApplication.class);
  }
  
  public void start(final Stage primaryStage) throws Exception {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @SyntheticMember
  public Main() {
    super();
  }
}
