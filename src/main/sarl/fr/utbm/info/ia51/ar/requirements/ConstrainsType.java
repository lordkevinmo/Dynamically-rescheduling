/**
 * 
 */
package fr.utbm.info.ia51.ar.requirements;

import javax.xml.bind.annotation.XmlEnumValue;

/**
 * @author Koffi AGBENYA
 *
 */
public enum ConstrainsType {

	TRAFFICJAMS(1),
	CAPACITY(2);	
	
	private int constraintType;
		
		
	private ConstrainsType(int constraintType) {
		this.constraintType = constraintType;
	}


	public int getConstraintType() {
		return constraintType;
	}


	public void setConstraintType(int constraintType) {
		this.constraintType = constraintType;
	}


	@Override
	public String toString() {
	        return  this.name();
	}
	
}
