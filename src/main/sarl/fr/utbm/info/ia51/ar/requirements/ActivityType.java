/**
 * 
 */
package fr.utbm.info.ia51.ar.requirements;

/**
 * @author Koffi AGBENYA
 * 
 * This enumeration is the definition of the Activity Type.
 * The type of activity can be shopping, go to school, etc. 
 * In this enumeration there is a constant activity and we 
 * let the possibility for the users to create their own activities.
 * 
 */
public enum ActivityType {
	SHOPPING("Going shopping"),
	HOME("Going home"),
	WORK("Going to work"),
	SCHOOL("Going to school");
	
	private String activity;
	
	// Default constructor
	ActivityType(String activity){
		this.activity = activity;
	}
	
	/**
	 * 
	 * @return the activity
	 */
	public String getActivity() {
		return this.activity;
	}
	
	/**
	 * 
	 * @param activity which we set to the Activity class
	 */
	public void setActivity(String activity) {
		this.activity = activity;
	}
	
}
