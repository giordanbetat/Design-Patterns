package com.giordanbetat.abstractFactory;
import java.util.Calendar;

public class ConcreteCompanyBus extends CompanyBus{

	@Override
	public PassageBusUrban issuesPassageBusUrban(String origin, String destiny, Calendar dateMatch) {
		
		return new ConcretePassageBusUrban(origin, destiny, dateMatch);
	}

	@Override
	public PassageBusInterstate issuesPassageBusInterstate(String origin, String destiny, Calendar dateMatch) {
		
		return new ConcretePassageBusInterstate(origin, destiny, dateMatch);
	}

	
	
}
