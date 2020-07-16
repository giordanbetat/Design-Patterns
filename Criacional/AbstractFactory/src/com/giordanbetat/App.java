package com.giordanbetat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import com.giordanbetat.abstractFactory.CompanyBus;
import com.giordanbetat.abstractFactory.ConcreteCompanyBus;
import com.giordanbetat.abstractFactory.PassageBusInterstate;
import com.giordanbetat.abstractFactory.PassageBusUrban;

public class App {

	public static void main(String[] args) {

		CompanyBus companyBus = new ConcreteCompanyBus();

		PassageBusUrban passageUrban = companyBus.issuesPassageBusUrban("Restinga", "Centro",
				new GregorianCalendar(2020, Calendar.JULY, 15, 18, 0));

		PassageBusInterstate passageInterstate = companyBus.issuesPassageBusInterstate("Porto Alegre", "Santa Catarina",
				new GregorianCalendar(2020, Calendar.JULY, 15, 18, 0));
		
		passageUrban.getDetails();
		
		passageInterstate.getDetails();

	}

}
