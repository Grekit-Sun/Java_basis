package com.ujs.simplefactory;

public class TestFactory {
	public static void main(String[] args) {
		Restaurant res = SimpleFactory.createRes(SimpleFactory.TYPE_PM);
		res.cook();
	}
}
