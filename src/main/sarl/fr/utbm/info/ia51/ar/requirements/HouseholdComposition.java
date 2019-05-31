/**
 * 
 */
package fr.utbm.info.ia51.ar.requirements;

/**
 * @author Koffi Agbenya
 *
 */
public enum HouseholdComposition {
	SINGLENOWORKER(1),
	SINGLEONEWORKER(2),
	DOUBLEONEWORKER(3),
	DOUBLETWOWORKERS(4),
	DOUBLENOWORKERS(5);
	
	private int h;
	
	HouseholdComposition(int house){
		this.h = house;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}
	
	
}
