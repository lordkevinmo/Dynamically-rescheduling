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
	DAILYSHOPPING(4),
	HOME(0),
	WORK(1),
	SCHOOL(2),
	NONDAILYSHOPPING(5),
	SOCIALVISIT(7),
	SERVICES(6),
	LEISURE(8),
	TOURING(9),
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
	
}
