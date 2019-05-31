package fr.utbm.info.ia51.ar.ui;

import io.sarl.javafx.FxApplication;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * Definition of the JavaFX application.
 */
@SarlSpecification("0.9")
@SarlElementType(10)
@SuppressWarnings("all")
public class MyAppFxApplication extends FxApplication {
  private static BorderPane root;
  
  private static Stage stage;
  
  public FXMLLoader doApplicationStart(final Stage stage) {
    try {
      String simpleName = MyAppFxApplication.class.getSimpleName();
      String _replaceAll = MyAppFxApplication.class.getPackage().getName().replaceAll("\\.", "/");
      String _plus = (_replaceAll + "/");
      String _plus_1 = (_plus + simpleName);
      final ResourceBundle bundle = ResourceBundle.getBundle(_plus_1);
      URL location = this.getClass().getResource((simpleName + ".fxml"));
      FXMLLoader loader = new FXMLLoader();
      loader.setLocation(location);
      JavaFXBuilderFactory _javaFXBuilderFactory = new JavaFXBuilderFactory();
      loader.setBuilderFactory(_javaFXBuilderFactory);
      loader.setResources(bundle);
      Object _load = loader.<Object>load(location.openStream());
      MyAppFxApplication.root = ((BorderPane) _load);
      Scene scene = new Scene(MyAppFxApplication.root);
      scene.getStylesheets().add(this.getClass().getResource("ViewerController.css").toExternalForm());
      stage.setTitle(bundle.getString("TITLE"));
      stage.setScene(scene);
      stage.centerOnScreen();
      MyAppFxApplication.stage = stage;
      return loader;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static void loadBorderPaneCenter(final VBox box) {
    MyAppFxApplication.root.setCenter(box);
  }
  
  @Pure
  public static Stage stage() {
    return MyAppFxApplication.stage;
  }
  
  @SyntheticMember
  public MyAppFxApplication() {
    super();
  }
}
