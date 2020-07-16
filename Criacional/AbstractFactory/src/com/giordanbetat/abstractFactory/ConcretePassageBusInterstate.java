package com.giordanbetat.abstractFactory;
import java.util.Calendar;

public class ConcretePassageBusInterstate extends PassageBusInterstate {

	public ConcretePassageBusInterstate(String origin, String destiny, Calendar dateMatch) {
		super(origin, destiny, dateMatch);
	}

	@Override
	public void getDetails() {
		System.out.println("Passagem de onibus interestadual: " + this.getOrigin() + " para " + this.getDestiny()
				+ ", Data/Hora: " + super.dateFormat.format(this.getDateMatch().getTime()));
	}

}
