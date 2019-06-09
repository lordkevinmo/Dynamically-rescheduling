package fr.utbm.info.ia51.ar.requirements;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * @author Koffi Agbenya
 *
 */
@XmlType(name="DayOfWeek")
@XmlEnum(value = Integer.class)
public enum DayOfWeek {
	@XmlEnumValue("1")
	MONDAY(1),
	@XmlEnumValue("2")
	TUESDAY(2),
	@XmlEnumValue("3")
	WEDNESDAY(3),
	@XmlEnumValue("4")
	THURSDAY(4),
	@XmlEnumValue("5")
	FRIDAY(5),
	@XmlEnumValue("6")
	SATURDAY(6),
	@XmlEnumValue("7")
	SUNDAY(7);
	
	private int dayofWeek;
	
	DayOfWeek(){
		
	}
	
	DayOfWeek(int day){
		this.dayofWeek = day;
	}
	
	
	public int getDay(){
		return dayofWeek;
	}
	
	public void setDay(int day) {
		this.dayofWeek = day;
	}
	
	@Override
	public String toString() {
	        return  this.name();
	}
}
