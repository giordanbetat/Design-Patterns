package com.giordanbetat.factoryMethod;
import java.util.Calendar;

public class PassageBusUrban extends Passage {

	public PassageBusUrban(String origin, String destiny, Calendar dateMatch) {
		super(origin, destiny, dateMatch);
	}

	public void getDetails() {
		System.out.println("Passagem de onibus urbana: " + this.getOrigin() + " para " + this.getDestiny()
				+ ", Data/Hora: " + super.dateFormat.format(this.getDateMatch().getTime()));
	}

}
