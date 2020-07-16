package com.giordanbetat.adapter;

public class AdapterAmericanToBrazilian extends BrazilianPowerPlug {

	public String connect(AmericanPlug plug) {
		return plug.getEletricity() + this.getNamePowerPlug();
	}

}
