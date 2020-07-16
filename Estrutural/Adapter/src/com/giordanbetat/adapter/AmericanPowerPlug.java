package com.giordanbetat.adapter;

public class AmericanPowerPlug extends PowerPlug<AmericanPlug>{

	@Override
	public String connect(AmericanPlug plug) {
		
		return plug.getEletricity() + this.getNamePowerPlug();
	}

	@Override
	public String getNamePowerPlug() {
		
		return "tomada americana";
	}

}
