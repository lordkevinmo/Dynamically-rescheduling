/**
 * 
 */
package fr.utbm.info.ia51.ar.requirements;

/**
 * @author Koffi Agbenya
 *
 */
public enum Gender {

	MALE(1),
	FEMALE(2);
	
	private int gender;
	
	Gender(int g){
		gender = g;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}
	
	
}
