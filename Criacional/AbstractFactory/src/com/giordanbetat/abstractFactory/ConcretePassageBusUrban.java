package com.giordanbetat.abstractFactory;
import java.util.Calendar;

public class ConcretePassageBusUrban extends PassageBusUrban {

	public ConcretePassageBusUrban(String origin, String destiny, Calendar dateMatch) {
		super(origin, destiny, dateMatch);
	}

	@Override
	public void getDetails() {
		System.out.println("Passagem de onibus urban: " + this.getOrigin() + " para " + this.getDestiny()
				+ ", Data/Hora: " + super.dateFormat.format(this.getDateMatch().getTime()));
	}

}
