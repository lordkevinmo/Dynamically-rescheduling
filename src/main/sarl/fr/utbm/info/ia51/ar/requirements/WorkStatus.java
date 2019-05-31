package fr.utbm.info.ia51.ar.requirements;

/**
 * 
 * @author Koffi Agbenya
 *
 */
public enum WorkStatus {

	NOWORK(1),
	WORK(2);
	
	private int status;
	
	WorkStatus(int status){
		this.status = status;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
}
