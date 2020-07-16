package com.giordanbetat.factoryMethod;
import java.util.Calendar;

public class CompanyBusInterstate extends Company{

	@Override
	public Passage issuesPassage(String origin, String destiny, Calendar dateMatch) {
		
		return new PassageBusUrban(origin, destiny, dateMatch);
	}

}
