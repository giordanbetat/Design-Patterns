package com.giordanbetat.factoryMethod;
import java.util.Calendar;

public class PassageBusInterstate extends Passage {

	public PassageBusInterstate(String origin, String destiny, Calendar dateMatch) {
		super(origin, destiny, dateMatch);
	}

	public void getDetails() {
		System.out.println("Passagem de onibus interestadual: " + this.getOrigin() + " para " + this.getDestiny()
				+ ", Data/Hora: " + super.dateFormat.format(this.getDateMatch().getTime()));
	}

}
