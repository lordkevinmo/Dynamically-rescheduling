/**
 * 
 */
package fr.utbm.info.ia51.ar.requirements;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * @author Koffi AGBENYA
 * 
 * This enumeration is the definition of the travel mode used by the user to reach 
 * a destination for the trip.
 *
 */
@XmlEnum(value = Integer.class)
public enum TravelMode {
	@XmlEnumValue("0")
	BMT(0),
	@XmlEnumValue("1")
	CAR(1),
	@XmlEnumValue("7")
	MOTORBIKE(7),
	@XmlEnumValue("2")
	BICYCLE(2),
	@XmlEnumValue("8")
	PLANE(8),
	@XmlEnumValue("3")
	SLOW(3),
	@XmlEnumValue("4")
	PUBLIC(4),
	@XmlEnumValue("6")
	CARPASSENGER(6),
	@XmlEnumValue("9")
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
	
	@Override
	public String toString() {
	        return  this.name();
	}
}
