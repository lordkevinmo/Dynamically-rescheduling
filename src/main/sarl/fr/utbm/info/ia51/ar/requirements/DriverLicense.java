/**
 * 
 */
package fr.utbm.info.ia51.ar.requirements;

/**
 * @author Koffi Agbenya
 *
 */
public enum DriverLicense {
	HASDRIVERLICENSE(1),
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
	
	
}
