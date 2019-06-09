package fr.utbm.info.ia51.ar.requirements;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;

import fr.utbm.info.ia51.ar.agents.Person;
/**
 * This class enables to load a datasets
 * @author Komi AGOTSI
 *
 */
@XmlRootElement(name ="Persons")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Persons {
	
	private List<PersonnalInfo> personsalInfos;
	private List<Relation> relations;
	
	private Persons() {
		
	}
	
	//getters and setters
	/**
	 * 
	 * @return a list of personal informations
	 */
	public List<PersonnalInfo> getPersonalInfos(){
		return personsalInfos;
	}
	/**
	 * 
	 * @param personal informations
	 */
	@XmlElement(name ="PersonnalInfos")
	public void setPersonalInfos(List<PersonnalInfo> personalInfos){
		this.personsalInfos = personalInfos;
	}
	/**
	 * set a list of relations between participants
	 * @param relations
	 */
	
	@XmlElement(name="Relations")
	public void setRelations( List<Relation> relations) {
		this.relations = relations;
	}
	/**
	 * List of relations between participants 
	 * @return
	 */
	public List<Relation> getRelations(){
		return relations;
	}

	@Override
	public String toString() {
		return "Persons [personsalInfos=" + personsalInfos + "]";
	}		

}
