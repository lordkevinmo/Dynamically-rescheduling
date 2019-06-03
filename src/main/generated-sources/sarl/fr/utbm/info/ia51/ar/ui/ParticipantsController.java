package fr.utbm.info.ia51.ar.ui;

import com.google.common.base.Objects;
import fr.utbm.info.ia51.ar.agents.Person;
import fr.utbm.info.ia51.ar.requirements.Persons;
import fr.utbm.info.ia51.ar.ui.DataModel;
import fr.utbm.info.ia51.ar.ui.MyAppFxApplication;
import fr.utbm.info.ia51.ar.util.Util;
import io.sarl.javafx.FxViewerController;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * JavaFX controller for the JavaFX application.
 */
@SarlSpecification("0.9")
@SarlElementType(10)
@SuppressWarnings("all")
public class ParticipantsController extends FxViewerController implements Initializable {
  private final FileChooser fileChooser = new FileChooser();
  
  private Desktop desktop = Desktop.getDesktop();
  
  private Persons data;
  
  private Person p;
  
  @FXML
  private TextField loadFileNameTf;
  
  @FXML
  private TableView<DataModel> table;
  
  @FXML
  private TableColumn<DataModel, Integer> colId;
  
  @FXML
  private TableColumn<DataModel, String> colName;
  
  @FXML
  private TableColumn<DataModel, Integer> colGender;
  
  @FXML
  private TableColumn<DataModel, Integer> colWorkStatus;
  
  @FXML
  private TableColumn<DataModel, Integer> colDriverLicence;
  
  private ObservableList<DataModel> objectList = FXCollections.<DataModel>observableArrayList();
  
  public void initialize(final URL location, final ResourceBundle resources) {
    PropertyValueFactory<DataModel, Integer> _propertyValueFactory = new PropertyValueFactory<DataModel, Integer>("id");
    this.colId.setCellValueFactory(_propertyValueFactory);
    PropertyValueFactory<DataModel, String> _propertyValueFactory_1 = new PropertyValueFactory<DataModel, String>("name");
    this.colName.setCellValueFactory(_propertyValueFactory_1);
    PropertyValueFactory<DataModel, Integer> _propertyValueFactory_2 = new PropertyValueFactory<DataModel, Integer>("gender");
    this.colGender.setCellValueFactory(_propertyValueFactory_2);
    PropertyValueFactory<DataModel, Integer> _propertyValueFactory_3 = new PropertyValueFactory<DataModel, Integer>("Work status");
    this.colWorkStatus.setCellValueFactory(_propertyValueFactory_3);
    PropertyValueFactory<DataModel, Integer> _propertyValueFactory_4 = new PropertyValueFactory<DataModel, Integer>("Driver Licence");
    this.colDriverLicence.setCellValueFactory(_propertyValueFactory_4);
    this.table.setItems(this.objectList);
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
      File selectedFile = file;
      String _name = selectedFile.getName();
      System.out.println(("file name : " + _name));
      Persons _xmlToObject = Util.xmlToObject(selectedFile);
      this.data = _xmlToObject;
      String _name_1 = selectedFile.getName();
      System.out.println(("file name : " + _name_1));
      System.out.println(("data : " + this.data));
    }
  }
  
  private final ObservableList<DataModel> dataTableData = FXCollections.<DataModel>observableArrayList();
  
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
  
  @SyntheticMember
  public ParticipantsController() {
    super();
  }
}
