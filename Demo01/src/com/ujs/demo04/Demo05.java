package com.ujs.demo04;

public class Demo05 {
	public static void main(String[] args) {
		Demo07 d = new Demo06();
		d.change();
	}
}

class Demo06 extends Demo07 {
	public void change() {
		System.out.println("��д����");
	}
	
}

class Demo07{
	protected void change() {
		System.out.println("���෽��");
	}
}