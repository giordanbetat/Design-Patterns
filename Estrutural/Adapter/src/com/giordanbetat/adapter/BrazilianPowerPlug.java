package com.giordanbetat.adapter;

public class BrazilianPowerPlug extends PowerPlug<BrazilianPlug>{

	@Override
	public String connect(BrazilianPlug plug) {
		
		return plug.getEletricity() + this.getNamePowerPlug();
	}

	@Override
	public String getNamePowerPlug() {
		
		return "tomada brasileira";
	}

}
