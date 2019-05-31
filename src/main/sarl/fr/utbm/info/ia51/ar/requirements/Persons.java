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
	
	private List<Person> persons;
	
	private Persons() {
		
	}
	
	//getters and setters
	/**
	 * 
	 * @return a list of persons
	 */
	public List<Person> getPersons(){
		return persons;
	}
	/**
	 * 
	 * @param persons
	 */
	@XmlElement(name ="persons")
	public void setPersons(List<Person> persons){
		this.persons = persons;
	}
	
	
	
	

}
