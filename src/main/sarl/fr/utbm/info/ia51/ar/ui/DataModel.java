package fr.utbm.info.ia51.ar.ui;

import fr.utbm.info.ia51.ar.requirements.DriverLicense;
import fr.utbm.info.ia51.ar.requirements.Gender;
import fr.utbm.info.ia51.ar.requirements.WorkStatus;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * This class enables to build data to populate a table
 * @author Komi AGOTSI
 *
 */
public class DataModel {
	
	public final int id;
	public final String name ;
	public final String gender ;
	public final String workStatus ;
	public final String driverLicence ;
	public final String houseHold;
	
	public DataModel(int id,String name,String gender,String workStatus,String driverLicence,String houseHold) {
		this.id= id;
		this.name = name;
		this.gender = gender;
		this.workStatus =workStatus;
		this.driverLicence = driverLicence;
		this.houseHold = houseHold;
	}
	
	//getters and setters	
	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getWorkStatus() {
		return workStatus;
	}

	public String getDriverLicence() {
		return driverLicence;
	}

	public int getId() {
		return id;
	}

	public String getHouseHold() {
		return houseHold;
	}			

}
