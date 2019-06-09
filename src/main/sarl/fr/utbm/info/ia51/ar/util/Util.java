
package fr.utbm.info.ia51.ar.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import fr.utbm.info.ia51.ar.requirements.Activity;
import fr.utbm.info.ia51.ar.requirements.Persons;
import fr.utbm.info.ia51.ar.requirements.Schedule;
import fr.utbm.info.ia51.ar.requirements.Trip;

/**
 * All utils methods
 * @author Komi AGOTSI
 *
 */
public class Util {

	/**
	 * Convert object contain in xml file to Object by JAXB API
	 * @param file
	 * @return
	 */
	public static Persons xmlToObject(File file) {
		Persons persons = null;
		try {

		//	File file = new File(filePath);
			JAXBContext jaxbContext = JAXBContext.newInstance(Persons.class,Activity.class,Trip.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			persons = (Persons)jaxbUnmarshaller.unmarshal(file);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return persons;
	}
	
	/**
	 * Format hour 
	 * @param hour
	 * @return
	 */
	public static String formatHour(int hour) {
		final String  min = hour%100 == 0?"00":hour%100+"";
		return hour/100+" h "+min;
	 
	}
	
	
}
