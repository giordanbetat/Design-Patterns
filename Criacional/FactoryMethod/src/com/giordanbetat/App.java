package com.giordanbetat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import com.giordanbetat.factoryMethod.Company;
import com.giordanbetat.factoryMethod.CompanyBusInterstate;
import com.giordanbetat.factoryMethod.CompanyBusUrban;
import com.giordanbetat.factoryMethod.Passage;

public class App {

	public static void main(String[] args) {

		Company urbanBus = new CompanyBusUrban();
		Company interstateBus = new CompanyBusInterstate();

		Passage passageUrban = urbanBus.issuesPassage("Restinga", "Centro",
				new GregorianCalendar(2020, Calendar.JULY, 15, 18, 0));

		Passage passageInterstate = interstateBus.issuesPassage("Porto Alegre", "Santa Catarina",
				new GregorianCalendar(2020, Calendar.JULY, 15, 18, 0));

		passageUrban.getDetails();

		passageInterstate.getDetails();
	}

}
