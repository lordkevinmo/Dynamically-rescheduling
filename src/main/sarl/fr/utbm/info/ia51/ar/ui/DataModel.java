package fr.utbm.info.ia51.ar.ui;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * This class enables to build data to populate a table
 * @author Komi AGOTSI
 *
 */
public class DataModel {

	public final String name ;
	public final int gender ;
	public final int workStatus ;
	public final int driverLicence ;
	
	public DataModel(String name,int gender,int workStatus,int driverLicence) {
		this.name = name;
		this.gender = gender;
		this.workStatus =workStatus;
		this.driverLicence = driverLicence;
	}
	
	//getters and setters	
	public String getName() {
		return name;
	}

	public int getGender() {
		return gender;
	}

	public int getWorkStatus() {
		return workStatus;
	}

	public int getDriverLicence() {
		return driverLicence;
	}	
}
