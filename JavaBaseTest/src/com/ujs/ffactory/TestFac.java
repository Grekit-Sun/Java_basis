package com.ujs.ffactory;

public class TestFac {
	public static void main(String[] args) {
		Restaurant lz = new LanzhouFac().createRestaurant();
		lz.cook();
		Restaurant pm = new PaomianFac().createRestaurant();
		pm.cook();
		Restaurant gq = new GuoqiaoFac().createRestaurant();
		gq.cook();
	}
}
