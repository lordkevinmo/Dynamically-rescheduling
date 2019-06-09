package fr.utbm.info.ia51.ar.requirements;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * 
 * @author Koffi Agbenya
 *
 */
@XmlEnum(value = Integer.class)
public enum WorkStatus {
	@XmlEnumValue("1")
	NOWORK(1),
	@XmlEnumValue("2")
	WORK(2);
	
	private int status;
	
	WorkStatus(){
		
	}
	
	WorkStatus(int status){
		this.status = status;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
	        return this.name();
	}
	
	
}
