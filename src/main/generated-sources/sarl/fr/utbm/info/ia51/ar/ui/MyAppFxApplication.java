package fr.utbm.info.ia51.ar.ui;

import io.sarl.javafx.FxApplication;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * Definition of the JavaFX application.
 */
@SarlSpecification("0.9")
@SarlElementType(10)
@SuppressWarnings("all")
public class MyAppFxApplication extends FxApplication {
  public FXMLLoader doApplicationStart(final Stage stage) {
    try {
      String simpleName = MyAppFxApplication.class.getSimpleName();
      String _replaceAll = MyAppFxApplication.class.getPackage().getName().replaceAll("\\.", "/");
      final ResourceBundle bundle = ResourceBundle.getBundle(
        ((_replaceAll + "/") + simpleName));
      URL location = this.getClass().getResource((simpleName + ".fxml"));
      FXMLLoader loader = new FXMLLoader();
      loader.setLocation(location);
      JavaFXBuilderFactory _javaFXBuilderFactory = new JavaFXBuilderFactory();
      loader.setBuilderFactory(_javaFXBuilderFactory);
      loader.setResources(bundle);
      Parent root = loader.<Parent>load(location.openStream());
      Scene scene = new Scene(root);
      scene.getStylesheets().add(this.getClass().getResource("ViewerController.css").toExternalForm());
      stage.setTitle(bundle.getString("TITLE"));
      stage.setScene(scene);
      stage.centerOnScreen();
      return loader;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @SyntheticMember
  public MyAppFxApplication() {
    super();
  }
}
