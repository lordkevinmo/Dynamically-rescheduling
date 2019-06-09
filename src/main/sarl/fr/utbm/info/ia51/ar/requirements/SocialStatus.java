/**
 * 
 */
package fr.utbm.info.ia51.ar.requirements;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * This enum is the definition of the type of relationship
 *  that can be established between two people.
 *  
 *  @author Komi AGOTSI
 *
 */
@XmlEnum(Integer.class)
public enum SocialStatus {
	@XmlEnumValue("1")
	FRIEND(1),
	@XmlEnumValue("2")
	FAMILY(2),
	@XmlEnumValue("3")
	COLLEAGUE(3),
	@XmlEnumValue("4")
	STRANGERS(4);
	
	
	private int socialStatus;
	
	private SocialStatus() {
		
	}

	private SocialStatus(int socialStatus) {
		this.socialStatus = socialStatus;
	}

	public int getSocialStatus() {
		return socialStatus;
	}

	public void setSocialStatus(int socialStatus) {
		this.socialStatus = socialStatus;
	}	
	
	@Override
	public String toString() {
	        return  this.name();
	}
	
}
