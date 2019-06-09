package fr.utbm.info.ia51.ar.requirements;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * 
 * @author Koffi Agbenya
 * @author Komi AGOTSI
 *
 */
@XmlEnum(value = Integer.class)
public enum HouseholdAge {
	@XmlEnumValue("1")
	MEMBERIN0TO34(1),
	@XmlEnumValue("2")
	MEMBERIN35TO54(2),
	@XmlEnumValue("3")
	MEMBERIN55TO64(3),
	@XmlEnumValue("4")
	MEMBERIN65TO74(4),
	@XmlEnumValue("5")
	MEMBEROVER75(5);
	
	private int age;
	
	HouseholdAge(int age){
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
	        return  this.name();
	}
}
