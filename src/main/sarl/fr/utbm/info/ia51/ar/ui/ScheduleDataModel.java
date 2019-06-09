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
public class ScheduleDataModel {
	
	public final int id;
	public final String day ;
	public final String startTime ;
	public final String duration ;
	public final String origin ;
	public final String destination ;
	public final String travelMode ;
	public final String participant ;
	public final String type ;
	

	 ScheduleDataModel(int id, String day, String startTime, String duration, String origin, String destination,
			String travelMode, String participant, String type) {
		super();
		this.id = id;
		this.day = day;
		this.startTime = startTime;
		this.duration = duration;
		this.origin = origin;
		this.destination = destination;
		this.travelMode = travelMode;
		this.participant = participant;
		this.type = type;
	}


	//getters and setters	


	public int getId() {
		return id;
	}




	public String getDay() {
		return day;
	}




	public String getStartTime() {
		return startTime;
	}




	public String getDuration() {
		return duration;
	}




	public String getOrigin() {
		return origin;
	}




	public String getDestination() {
		return destination;
	}




	public String getTravelMode() {
		return travelMode;
	}




	public String getParticipant() {
		return participant;
	}




	public String getType() {
		return type;
	}


	
}
