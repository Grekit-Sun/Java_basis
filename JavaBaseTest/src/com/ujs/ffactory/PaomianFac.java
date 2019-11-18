package com.ujs.ffactory;

public class PaomianFac implements CookFactory{

	@Override
	public Restaurant createRestaurant() {
		return new Paomian();
	}

}
