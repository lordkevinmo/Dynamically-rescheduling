package fr.utbm.info.ia51.ar.util;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.sun.javafx.tk.Toolkit.Task;

import fr.utbm.info.ia51.ar.requirements.Trip;

public class TripAdapter extends XmlAdapter<Trip, Task> {

	@Override
	public Task unmarshal(Trip v) throws Exception {
		// TODO Auto-generated method stub
		return v;
	}

	@Override
	public Trip marshal(Task v) throws Exception {
		// TODO Auto-generated method stub
		return new Trip(v);
	}

}
