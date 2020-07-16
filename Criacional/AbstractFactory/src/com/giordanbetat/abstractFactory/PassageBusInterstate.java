package com.giordanbetat.abstractFactory;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class PassageBusInterstate {

	private String origin;
	private String destiny;
	private Calendar dateMatch;
	
	protected SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");

	public PassageBusInterstate(String origin, String destiny, Calendar dateMatch) {
		this.origin = origin;
		this.destiny = destiny;
		this.dateMatch = dateMatch;
	}
	
	public String getOrigin(){
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestiny() {
		return destiny;
	}

	public void setDestiny(String destiny) {
		this.destiny = destiny;
	}

	public Calendar getDateMatch() {
		return dateMatch;
	}

	public void setDateMatch(Calendar dateMatch) {
		this.dateMatch = dateMatch;
	}
	
	public abstract void getDetails();

}
