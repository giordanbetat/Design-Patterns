package com.giordanbetat.abstractFactory;
import java.util.Calendar;

public abstract class CompanyBus {

	public abstract PassageBusUrban issuesPassageBusUrban(String origin, String destiny, Calendar dateMatch);
	
	public abstract PassageBusInterstate issuesPassageBusInterstate(String origin, String destiny, Calendar dateMatch);
	
}
