/**
 * 
 */
package fr.utbm.info.ia51.ar.requirements;

/**
 * @author Koffi AGBENYA
 * 
 * This enumeration is the definition of the travel mode used by the user to reach 
 * a destination for the trip.
 *
 */
public enum TravelMode {
	BMT(0),
	CAR(1),
	MOTORBIKE(7),
	BICYCLE(2),
	PLANE(8),
	SLOW(3),
	PUBLIC(4),
	CARPASSENGER(6),
	BOAT(9);
	
	
	private int mode;
	
	TravelMode(int mode){
		this.mode = mode;
	}

	/**
	 * 
	 * @return the transportation mode
	 */
	public int getMode() {
		return mode;
	}

	/**
	 * 
	 * @param mode of transportation
	 */
	public void setMode(int mode) {
		this.mode = mode;
	}
	
	
}
