package com.ujs.demo04;

public class Demo03 {
	public static void main(String[] args) {
		System.out.println("多态test------------------------");
		A a = new B();
		if(a instanceof B) {
			B b = (B)a;
			b.gongyou();
		}
		System.out.println(a instanceof B);
		System.out.println("--------------------------------");
		
		System.out.println("Clone test----------------------");
		A a3 = new A();
		A a2 = null;
		try {
			a2 = (A) a3.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(a3);
		System.out.println(a2);
		System.out.println(a3.name);
		System.out.println(a2.name);
	}
}

class A implements Cloneable{
	
	public String name;
	
	public A(String name) {
		this.name = name;
	}
	
	public A() {}
	
	private void siyou() {
		System.out.println("我是A的私有方法");
	}
	public void gongyou() {
		System.out.println("我是A的公有方法");
		System.out.println("调用私有方法...");
		siyou();
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

class B extends A {
	public void gongyou() {
		System.out.println("我是B的公有方法，我应该是重写了A中的此方法！");
	}
}