package fr.utbm.info.ia51.ar.ui;

import io.sarl.javafx.FxApplication;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;

/**
 * Definition of the JavaFX application.
 */
@SarlSpecification("0.8")
@SarlElementType(10)
public class MyAppFxApplication extends FxApplication {
  private static /* BorderPane */Object root;
  
  private static /* Stage */Object stage;
  
<<<<<<< HEAD
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
      Object _load = loader.<Object>load(location.openStream());
      MyAppFxApplication.root = ((BorderPane) _load);
      Scene scene = new Scene(MyAppFxApplication.root);
      scene.getStylesheets().add(this.getClass().getResource("ViewerController.css").toExternalForm());
      stage.setTitle(bundle.getString("TITLE"));
      stage.setScene(scene);
      stage.centerOnScreen();
      stage.setWidth(1200);
      stage.setHeight(1000);
      MyAppFxApplication.stage = stage;
      return loader;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
=======
  public /* FXMLLoader */Object doApplicationStart(final /* Stage */Object stage) {
    throw new Error("Unresolved compilation problems:"
      + "\nBorderPane cannot be resolved to a type."
      + "\nResourceBundle cannot be resolved to a type."
      + "\nThe method or field class is undefined"
      + "\nFXMLLoader cannot be resolved."
      + "\nJavaFXBuilderFactory cannot be resolved."
      + "\nScene cannot be resolved."
      + "\nThe method or field class is undefined"
      + "\nThe field MyAppFxApplication.root refers to the missing type BorderPane"
      + "\nThe field MyAppFxApplication.root refers to the missing type BorderPane"
      + "\nsimpleName cannot be resolved"
      + "\ngetBundle cannot be resolved"
      + "\npackage cannot be resolved"
      + "\nname cannot be resolved"
      + "\nreplaceAll cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved"
      + "\ngetResource cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nlocation cannot be resolved"
      + "\nbuilderFactory cannot be resolved"
      + "\nresources cannot be resolved"
      + "\nload cannot be resolved"
      + "\nopenStream cannot be resolved"
      + "\nstylesheets cannot be resolved"
      + "\nadd cannot be resolved"
      + "\ngetResource cannot be resolved"
      + "\ntoExternalForm cannot be resolved"
      + "\ntitle cannot be resolved"
      + "\ngetString cannot be resolved"
      + "\nscene cannot be resolved"
      + "\ncenterOnScreen cannot be resolved"
      + "\nstage cannot be resolved");
>>>>>>> a964ccd9ac12f65bb890ba9dff4d4bace10f9fbb
  }
  
  public static void loadBorderPaneCenter(final /* VBox */Object box) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field MyAppFxApplication.root refers to the missing type BorderPane"
      + "\ncenter cannot be resolved");
  }
  
  public static /* Stage */Object stage() {
    throw new Error("Unresolved compilation problems:"
      + "\nstage cannot be resolved");
  }
  
  @SyntheticMember
  public MyAppFxApplication() {
    super();
  }
}
