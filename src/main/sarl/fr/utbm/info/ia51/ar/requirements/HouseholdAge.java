package fr.utbm.info.ia51.ar.requirements;

/**
 * 
 * @author Koffi Agbenya
 *
 */
public enum HouseholdAge {
	MEMBERIN0TO34(1),
	MEMBERIN35TO54(2),
	MEMBERIN55TO64(3),
	MEMBERIN65TO74(4),
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
	
	
}
