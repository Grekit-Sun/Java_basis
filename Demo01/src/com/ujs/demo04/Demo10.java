package com.ujs.demo04;

public class Demo10 {
	public static void main(String[] args) {
//		String a = "1"+new String("1");
		String a = new String("1")+new String("1");
		a.intern();
		String b = "11";
		System.out.println(a==b);
	}
}

interface AA{
	void eat();
	void listen();
} 

class BB implements AA {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat");
		
	}

	@Override
	public void listen() {
		System.out.println("listen");		
	}
	
}
