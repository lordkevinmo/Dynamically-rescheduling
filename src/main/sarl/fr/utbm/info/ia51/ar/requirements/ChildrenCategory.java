package fr.utbm.info.ia51.ar.requirements;

/**
 * 
 * @author koffi Agbenya
 *
 */
public enum ChildrenCategory {
	
	NOCHILDREN(1),
	OLDESTCHILDRENYOUNGERTHAN6(2),
	OLDESTCHILDRENBETWEEN6AND12(3),
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
	
	

}
