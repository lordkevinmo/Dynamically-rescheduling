/**
 * 
 */
package fr.utbm.info.ia51.ar.requirements;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * @author Koffi AGBENYA
 * 
 * This enumeration is the definition of the Activity Type.
 * The type of activity can be shopping, go to school, etc. 
 * In this enumeration there is a constant activity and we 
 * let the possibility for the users to create their own activities.
 * 
 */
@XmlEnum(value = Integer.class)
public enum ActivityType {
	@XmlEnumValue("4")
	DAILYSHOPPING(4),
	@XmlEnumValue("0")
	HOME(0),
	@XmlEnumValue("1")
	WORK(1),
	@XmlEnumValue("2")
	SCHOOL(2),
	@XmlEnumValue("")
	NONDAILYSHOPPING(5),
	@XmlEnumValue("7")
	SOCIALVISIT(7),
	@XmlEnumValue("6")
	SERVICES(6),
	@XmlEnumValue("8")
	LEISURE(8),
	@XmlEnumValue("9")
	TOURING(9),
	@XmlEnumValue("10")
	OTHER(10);
	
	private int activity;
	
	// Default constructor
	ActivityType(int activity){
		this.activity = activity;
	}
	
	/**
	 * 
	 * @return the activity
	 */
	public int getActivity() {
		return this.activity;
	}
	
	/**
	 * 
	 * @param activity which we set to the Activity class
	 */
	public void setActivity(int activity) {
		this.activity = activity;
	}
	
	@Override
	public String toString() {
	        return  this.name();
	}
	
}
