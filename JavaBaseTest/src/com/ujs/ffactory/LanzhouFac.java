package com.ujs.ffactory;

public class LanzhouFac implements CookFactory{

	@Override
	public Restaurant createRestaurant() {
		
		return new Lanzhou();
		
	}

}
