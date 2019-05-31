
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

import fr.utbm.info.ia51.ar.requirements.Persons;
import fr.utbm.info.ia51.ar.requirements.Schedule;

public class Util {

	public static Persons xmlToObject(File file) {
		Persons persons = null;
		try {

		//	File file = new File(filePath);
			JAXBContext jaxbContext = JAXBContext.newInstance(Persons.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			persons = (Persons)jaxbUnmarshaller.unmarshal(file);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return persons;
	}
}
