/**
 * 
 */
package fr.utbm.info.ia51.ar.requirements;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * @author Koffi Agbenya
 *
 */
@XmlEnum(value = Integer.class)
public enum DriverLicense {
	@XmlEnumValue("1")
	HASDRIVERLICENSE(1),
	@XmlEnumValue("2")
	HASNODRIVERLICENSE(2);
	
	private int driverStatus;
	
	DriverLicense(int status){
		driverStatus = status;
	}

	public int getDriverStatus() {
		return driverStatus;
	}

	public void setDriverStatus(int driverStatus) {
		this.driverStatus = driverStatus;
	}
	
	@Override
	public String toString() {
	        return this.name();
	}
	
	
	
	
}
