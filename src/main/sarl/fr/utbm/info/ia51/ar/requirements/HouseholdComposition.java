/**
 * 
 */
package fr.utbm.info.ia51.ar.requirements;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * @author Koffi Agbenya
 * @author komi Agotsi
 *
 */
@XmlEnum(value = Integer.class)
public enum HouseholdComposition {
	@XmlEnumValue("1")
	SINGLENOWORKER(1),
	@XmlEnumValue("2")
	SINGLEONEWORKER(2),
	@XmlEnumValue("3")
	DOUBLEONEWORKER(3),
	@XmlEnumValue("4")
	DOUBLETWOWORKERS(4),
	@XmlEnumValue("5")
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
	
	@Override
	public String toString() {
	        return  this.name();
	}
}
