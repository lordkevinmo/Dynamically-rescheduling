package fr.utbm.info.ia51.ar.requirements;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * 
 * @author koffi Agbenya
 * @author komi Agotsi
 *
 */
@XmlEnum(value = Integer.class)
public enum ChildrenCategory {
	@XmlEnumValue("1")
	NOCHILDREN(1),
	@XmlEnumValue("2")
	OLDESTCHILDRENYOUNGERTHAN6(2),
	@XmlEnumValue("3")
	OLDESTCHILDRENBETWEEN6AND12(3),
	@XmlEnumValue("4")
	OLDESTCHILDRENOTHERTHAN12(4);
	
	private int children;
	
	ChildrenCategory(int child){
		this.children = child;
	}

	public int getChildren() {
		return children;
	}

	public void setChildren(int children) {
		this.children = children;
	}
	
	@Override
	public String toString() {
	        return  this.name();
	}

}
