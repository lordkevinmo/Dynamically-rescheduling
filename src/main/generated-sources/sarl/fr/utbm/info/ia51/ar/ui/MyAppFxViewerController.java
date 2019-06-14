package fr.utbm.info.ia51.ar.ui;

import com.google.common.base.Objects;
import fr.utbm.info.ia51.ar.agents.Environment;
import fr.utbm.info.ia51.ar.requirements.Activity;
import fr.utbm.info.ia51.ar.requirements.ChildrenCategory;
import fr.utbm.info.ia51.ar.requirements.ConstrainsType;
import fr.utbm.info.ia51.ar.requirements.Episode;
import fr.utbm.info.ia51.ar.requirements.HouseholdAge;
import fr.utbm.info.ia51.ar.requirements.IncomeCategory;
import fr.utbm.info.ia51.ar.requirements.PersonnalInfo;
import fr.utbm.info.ia51.ar.requirements.Persons;
import fr.utbm.info.ia51.ar.requirements.Relation;
import fr.utbm.info.ia51.ar.requirements.Schedule;
import fr.utbm.info.ia51.ar.requirements.SocialStatus;
import fr.utbm.info.ia51.ar.requirements.Trip;
import fr.utbm.info.ia51.ar.ui.DataModel;
import fr.utbm.info.ia51.ar.ui.MyAppFxApplication;
import fr.utbm.info.ia51.ar.ui.Refresh;
import fr.utbm.info.ia51.ar.ui.ScheduleDataModel;
import fr.utbm.info.ia51.ar.util.Util;
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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
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
  
  private Persons data;
  
  private final AtomicBoolean started = new AtomicBoolean();
  
  private ConstrainsType contraintType;
  
  private Trip carpolingTrip;
  
  private final String CENTER = "center";
  
  private final String RIGHT = "right";
  
  @FXML
  private BorderPane borderPane;
  
  @FXML
  private VBox scheduleBox;
  
  @FXML
  private ComboBox<String> joinTripCombo;
  
  private ObservableList<String> joinTripList = FXCollections.<String>observableArrayList();
  
  @FXML
  private TableView<DataModel> table;
  
  @FXML
  private TableColumn<DataModel, Integer> colId;
  
  @FXML
  private TableColumn<DataModel, String> colName;
  
  @FXML
  private TableColumn<DataModel, String> colGender;
  
  @FXML
  private TableColumn<DataModel, String> colWorkStatus;
  
  @FXML
  private TableColumn<DataModel, String> colDriverLicence;
  
  @FXML
  private TableColumn<DataModel, String> colHouseHold;
  
  private ObservableList<DataModel> objectList = FXCollections.<DataModel>observableArrayList();
  
  @FXML
  private TableView<ScheduleDataModel> scheduleTable;
  
  @FXML
  private TableColumn<ScheduleDataModel, Integer> colIds;
  
  @FXML
  private TableColumn<ScheduleDataModel, String> colDay;
  
  @FXML
  private TableColumn<ScheduleDataModel, String> colStartTime;
  
  @FXML
  private TableColumn<ScheduleDataModel, String> colDuration;
  
  @FXML
  private TableColumn<ScheduleDataModel, String> colOrigin;
  
  @FXML
  private TableColumn<ScheduleDataModel, String> colDestination;
  
  @FXML
  private TableColumn<ScheduleDataModel, String> colTravelMode;
  
  @FXML
  private TableColumn<ScheduleDataModel, String> colParticipant;
  
  @FXML
  private TableColumn<ScheduleDataModel, String> colType;
  
  private ObservableList<ScheduleDataModel> scheduleList;
  
  /**
   * start Environnement Agent
   */
  public UUID startApplication() {
    UUID _xifexpression = null;
    boolean _andSet = this.started.getAndSet(true);
    if ((!_andSet)) {
      final Procedure0 _function = () -> {
      };
      _xifexpression = this.startAgentApplication(Environment.class, _function);
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
    this.loadUI("participants", this.CENTER);
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
  protected void simulate(final MouseEvent events) {
    System.out.println("Simulate");
    this.loadUI("controlpane", this.RIGHT);
  }
  
  @FXML
  @Pure
  private void about(final MouseEvent events) {
  }
  
  @FXML
  private void loadUI(final String ui, final String position) {
    try {
      Parent root = null;
      VBox box = null;
      VBox otherBox = null;
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
      boolean _equals = Objects.equal(position, this.CENTER);
      if (_equals) {
        BorderPane _root = MyAppFxApplication.getRoot();
        _root.setRight(null);
        MyAppFxApplication.loadBorderPaneCenter(box);
      } else {
        boolean _equals_1 = Objects.equal(position, this.RIGHT);
        if (_equals_1) {
          otherBox = FXMLLoader.<VBox>load(this.getClass().getResource("map.fxml"));
          MyAppFxApplication.loadBorderPaneCenter(otherBox);
          MyAppFxApplication.loadBorderPaneRIght(box);
          this.fillJoinTripCombo();
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
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
  
  /**
   * Load Schedule xml file, init TableView and start Environnement
   */
  @FXML
  protected UUID loadData(final ActionEvent events) {
    UUID _xblockexpression = null;
    {
      File file = this.fileChooser.showOpenDialog(MyAppFxApplication.stage());
      boolean _notEquals = (!Objects.equal(file, null));
      if (_notEquals) {
        this.openFile(file);
        File selectedFile = file;
        Persons _xmlToObject = Util.xmlToObject(selectedFile);
        this.data = _xmlToObject;
      }
      this.initTable();
      _xblockexpression = this.startApplication();
    }
    return _xblockexpression;
  }
  
  @FXML
  @Pure
  protected void onCapacitySelected(final ActionEvent events) {
  }
  
  @FXML
  @Pure
  protected void onTImeSelected(final ActionEvent events) {
  }
  
  @FXML
  protected void onStart(final ActionEvent events) {
    throw new Error("Unresolved compilation problems:"
      + "\npertubation cannot be resolved.");
  }
  
  /**
   * Init the Participant TbaleView
   */
  public void initTable() {
    List<PersonnalInfo> _personalInfos = this.data.getPersonalInfos();
    for (final PersonnalInfo elt : _personalInfos) {
      {
        int _id = elt.getId();
        String _name = elt.getName();
        String _string = elt.getGender().toString();
        String _string_1 = elt.getWorkStatus().toString();
        String _string_2 = elt.isDriver().toString();
        HouseholdAge _houseHoldAge = elt.getHouseHoldAge();
        String _plus = (_houseHoldAge + " || ");
        String _string_3 = elt.getHouseHoldComposition().toString();
        IncomeCategory _incomeCategory = elt.getIncomeCategory();
        ChildrenCategory _childrenCategory = elt.getChildrenCategory();
        IncomeCategory _incomeCategory_1 = elt.getIncomeCategory();
        DataModel _dataModel = new DataModel(_id, _name, _string, _string_1, _string_2, (((((((_plus + _string_3) + " || ") + _incomeCategory) + " || ") + _childrenCategory) + " || ") + _incomeCategory_1));
        this.objectList.add(_dataModel);
        PropertyValueFactory<DataModel, Integer> _propertyValueFactory = new PropertyValueFactory<DataModel, Integer>("id");
        this.colId.setCellValueFactory(_propertyValueFactory);
        PropertyValueFactory<DataModel, String> _propertyValueFactory_1 = new PropertyValueFactory<DataModel, String>("name");
        this.colName.setCellValueFactory(_propertyValueFactory_1);
        PropertyValueFactory<DataModel, String> _propertyValueFactory_2 = new PropertyValueFactory<DataModel, String>("gender");
        this.colGender.setCellValueFactory(_propertyValueFactory_2);
        PropertyValueFactory<DataModel, String> _propertyValueFactory_3 = new PropertyValueFactory<DataModel, String>("workStatus");
        this.colWorkStatus.setCellValueFactory(_propertyValueFactory_3);
        PropertyValueFactory<DataModel, String> _propertyValueFactory_4 = new PropertyValueFactory<DataModel, String>("driverLicence");
        this.colDriverLicence.setCellValueFactory(_propertyValueFactory_4);
        PropertyValueFactory<DataModel, String> _propertyValueFactory_5 = new PropertyValueFactory<DataModel, String>("houseHold");
        this.colHouseHold.setCellValueFactory(_propertyValueFactory_5);
        this.table.setItems(this.objectList);
      }
    }
  }
  
  /**
   * This method handle the display the selected participant
   * and show participant Schedule
   */
  @FXML
  private void displayItem(final MouseEvent events) {
    PersonnalInfo displayItem = null;
    DataModel model = this.table.getSelectionModel().getSelectedItem();
    this.init();
    boolean _notEquals = (!Objects.equal(model, null));
    if (_notEquals) {
      List<PersonnalInfo> _personalInfos = this.data.getPersonalInfos();
      for (final PersonnalInfo elt : _personalInfos) {
        int _id = elt.getId();
        int _id_1 = model.getId();
        if ((_id == _id_1)) {
          displayItem = elt;
        }
      }
      this.scheduleBox.setVisible(true);
      this.initScheduleTable(displayItem);
    }
  }
  
  /**
   * Handle when select a constraint item
   */
  @FXML
  @Pure
  private void onJoinTripComboSelected(final ActionEvent events) {
  }
  
  /**
   * Reset a schedule TableView Data.
   */
  public void init() {
    this.scheduleList = FXCollections.<ScheduleDataModel>observableArrayList();
  }
  
  /**
   * init schedule Table
   */
  public void initScheduleTable(final PersonnalInfo personnalInfos) {
    String participants = "";
    boolean _isEmpty = personnalInfos.getSchedules().isEmpty();
    if ((!_isEmpty)) {
      List<Schedule> _schedules = personnalInfos.getSchedules();
      for (final Schedule elt : _schedules) {
        List<Episode> _episodes = elt.getEpisodes();
        for (final Episode ep : _episodes) {
          {
            Activity _activity = ep.getActivity();
            boolean _notEquals = (!Objects.equal(_activity, null));
            if (_notEquals) {
              int _id = ep.getActivity().getId();
              String _formatHour = Util.formatHour(ep.getActivity().getStartTime());
              String _string = Integer.valueOf(ep.getActivity().getDuration()).toString();
              String _string_1 = ep.getActivity().getLocation().toString();
              String _string_2 = ep.getActivity().getType().toString();
              ScheduleDataModel _scheduleDataModel = new ScheduleDataModel(_id, "", _formatHour, (_string + " min"), "", _string_1, "", participants, _string_2);
              this.scheduleList.add(_scheduleDataModel);
            }
            Trip _trip = ep.getTrip();
            boolean _notEquals_1 = (!Objects.equal(_trip, null));
            if (_notEquals_1) {
              List<PersonnalInfo> _participants = ep.getTrip().getParticipants();
              boolean _notEquals_2 = (!Objects.equal(_participants, null));
              if (_notEquals_2) {
                this.joinTripList.add(ep.getTrip().getLocation().toString());
                List<PersonnalInfo> _participants_1 = ep.getTrip().getParticipants();
                for (final PersonnalInfo part : _participants_1) {
                  {
                    Relation participantRel = Relation.relation(this.data.getRelations(), personnalInfos.getId(), part.getId());
                    String _name = PersonnalInfo.getPersonnalInfoById(participantRel.getSecondPerson(), this.data.getPersonalInfos()).getName();
                    SocialStatus _socialStatus = participantRel.getSocialStatus();
                    participants = (participants + (((_name + ":") + _socialStatus) + "\n"));
                  }
                }
              }
              int _id_1 = ep.getTrip().getId();
              String _formatHour_1 = Util.formatHour(ep.getTrip().getStartTime());
              String _string_3 = Integer.valueOf(ep.getTrip().getDuration()).toString();
              String _string_4 = ep.getTrip().getOrigin().toString();
              String _string_5 = ep.getTrip().getLocation().toString();
              String _string_6 = ep.getTrip().getTravelMode().toString();
              ScheduleDataModel _scheduleDataModel_1 = new ScheduleDataModel(_id_1, "", _formatHour_1, (_string_3 + " min"), _string_4, _string_5, _string_6, participants, "");
              this.scheduleList.add(_scheduleDataModel_1);
            }
          }
        }
      }
    } else {
      this.init();
    }
    PropertyValueFactory<ScheduleDataModel, Integer> _propertyValueFactory = new PropertyValueFactory<ScheduleDataModel, Integer>("id");
    this.colIds.setCellValueFactory(_propertyValueFactory);
    PropertyValueFactory<ScheduleDataModel, String> _propertyValueFactory_1 = new PropertyValueFactory<ScheduleDataModel, String>("day");
    this.colDay.setCellValueFactory(_propertyValueFactory_1);
    PropertyValueFactory<ScheduleDataModel, String> _propertyValueFactory_2 = new PropertyValueFactory<ScheduleDataModel, String>("startTime");
    this.colStartTime.setCellValueFactory(_propertyValueFactory_2);
    PropertyValueFactory<ScheduleDataModel, String> _propertyValueFactory_3 = new PropertyValueFactory<ScheduleDataModel, String>("duration");
    this.colDuration.setCellValueFactory(_propertyValueFactory_3);
    PropertyValueFactory<ScheduleDataModel, String> _propertyValueFactory_4 = new PropertyValueFactory<ScheduleDataModel, String>("origin");
    this.colOrigin.setCellValueFactory(_propertyValueFactory_4);
    PropertyValueFactory<ScheduleDataModel, String> _propertyValueFactory_5 = new PropertyValueFactory<ScheduleDataModel, String>("destination");
    this.colDestination.setCellValueFactory(_propertyValueFactory_5);
    PropertyValueFactory<ScheduleDataModel, String> _propertyValueFactory_6 = new PropertyValueFactory<ScheduleDataModel, String>("travelMode");
    this.colTravelMode.setCellValueFactory(_propertyValueFactory_6);
    PropertyValueFactory<ScheduleDataModel, String> _propertyValueFactory_7 = new PropertyValueFactory<ScheduleDataModel, String>("participant");
    this.colParticipant.setCellValueFactory(_propertyValueFactory_7);
    PropertyValueFactory<ScheduleDataModel, String> _propertyValueFactory_8 = new PropertyValueFactory<ScheduleDataModel, String>("type");
    this.colType.setCellValueFactory(_propertyValueFactory_8);
    this.scheduleTable.setItems(this.scheduleList);
  }
  
  @Pure
  public Persons getData() {
    return this.data;
  }
  
  public void fillJoinTripCombo() {
    System.out.println(("join trip " + this.joinTripList));
    System.out.println(("composant " + this.joinTripCombo));
    this.joinTripCombo.setItems(this.joinTripList);
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
    if (!java.util.Objects.equals(this.CENTER, other.CENTER)) {
      return false;
    }
    if (!java.util.Objects.equals(this.RIGHT, other.RIGHT)) {
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
    result = prime * result + java.util.Objects.hashCode(this.CENTER);
    result = prime * result + java.util.Objects.hashCode(this.RIGHT);
    return result;
  }
  
  @SyntheticMember
  public MyAppFxViewerController() {
    super();
  }
}
