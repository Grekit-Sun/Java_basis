package com.ujs.ffactory;

public class GuoqiaoFac implements CookFactory{

	@Override
	public Restaurant createRestaurant() {
		return new Guoqiao();
	}

}
