/**
 * 
 */
package fr.utbm.info.ia51.ar.requirements;

/**
 * @author Koffi Agbenya
 *
 */
public enum IncomeCategory {

	IC_0_1249(1),
	IC_1250_2249(2),
	IC_2250_3249(3),
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
	
	
}
