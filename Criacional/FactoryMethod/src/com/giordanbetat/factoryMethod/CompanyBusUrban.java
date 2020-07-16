package com.giordanbetat.factoryMethod;
import java.util.Calendar;

public class CompanyBusUrban extends Company{

	@Override
	public Passage issuesPassage(String origin, String destiny, Calendar dateMatch) {
		
		return new PassageBusInterstate(origin, destiny, dateMatch);
	}

}
