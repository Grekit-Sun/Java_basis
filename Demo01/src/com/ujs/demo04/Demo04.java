package com.ujs.demo04;

import java.util.HashMap;
import java.util.Map;

public class Demo04 {
	
	public static void main(String[] args) {
		int n = 0;
		Map m = new HashMap();
		m.put("1", "54321");
		change1(m);
		change2(n);
		System.out.println(m);
		System.out.println(n);
	}
	
	private static void change1(Map m) {
		m.put("1","12345");
	}
	
	private static void change2(int m) {
		m = 100;
	}
}
