package com.ujs.demo05;

public class Demo02 {
	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer("bad");
		test(buffer);
		System.out.println(buffer);
		
	}
	
	private static void test (StringBuffer s) {
		
//		s = new StringBuffer("good");
		s.append("boy");
		
	}
}
