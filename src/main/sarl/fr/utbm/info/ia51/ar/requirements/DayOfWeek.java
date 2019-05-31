package fr.utbm.info.ia51.ar.requirements;

/**
 * 
 * @author Koffi Agbenya
 *
 */
public enum DayOfWeek {
	MONDAY(1),
	TUESDAY(2),
	WEDNESDAY(3),
	THURSDAY(4),
	FRIDAY(5),
	SATURDAY(6),
	SUNDAY(7);
	
	private int day;
	
	DayOfWeek(int day){
		this.day = day;
	}
	
	public int getDay(){
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
}
