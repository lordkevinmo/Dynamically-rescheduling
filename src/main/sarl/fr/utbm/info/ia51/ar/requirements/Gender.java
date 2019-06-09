/**
 * 
 */
package fr.utbm.info.ia51.ar.requirements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

/**
 * @author Koffi Agbenya
 * @author Komi AGOTSI
 *
 */

@XmlEnum(value = Integer.class)
public enum Gender {
	@XmlEnumValue("1")
	MALE(1),
	@XmlEnumValue("2")
	FEMALE(2);
	
	private int gender;
	
	Gender(){
		
	}
	
	Gender(int g){
		gender = g;
	}
	
	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
	        return  this.name();
	}
	
	
}
