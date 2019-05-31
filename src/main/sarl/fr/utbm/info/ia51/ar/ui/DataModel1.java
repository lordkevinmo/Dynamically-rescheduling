package fr.utbm.info.ia51.ar.ui;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * This class enables to build data to populate a table
 * @author Komi AGOTSI
 *
 */
public class DataModel1 {

	public final SimpleStringProperty name ;
	public final SimpleIntegerProperty gender ;
	public final SimpleIntegerProperty workStatus ;
	public final SimpleIntegerProperty driverLicence ;
	
	public DataModel1(String name,int gender,int workStatus,int driverLicence) {
		this.name = new SimpleStringProperty(name);
		this.gender = new SimpleIntegerProperty(gender);
		this.workStatus = new SimpleIntegerProperty(workStatus);
		this.driverLicence = new SimpleIntegerProperty(driverLicence);
	}

	//getters and setters
	public SimpleStringProperty getName() {
		return name;
	}

	public SimpleIntegerProperty getGender() {
		return gender;
	}

	public SimpleIntegerProperty getWorkStatus() {
		return workStatus;
	}

	public SimpleIntegerProperty getDriverLicence() {
		return driverLicence;
	}
	
	 
}
