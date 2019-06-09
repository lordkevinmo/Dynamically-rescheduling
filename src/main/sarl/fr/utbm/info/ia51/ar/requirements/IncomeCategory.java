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
public enum IncomeCategory {
	@XmlEnumValue("1")
	IC_0_1249(1),
	@XmlEnumValue("2")
	IC_1250_2249(2),
	@XmlEnumValue("3")
	IC_2250_3249(3),
	@XmlEnumValue("4")
	ICOVER_3250(4);
	
	private int income;
	
	IncomeCategory(int income){
		this.income = income;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}
	
	@Override
	public String toString() {
	        return  this.name();
	}
	
}
