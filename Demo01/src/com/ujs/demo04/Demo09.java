package com.ujs.demo04;

public class Demo09 {
	public static void main(String[] args) {
		int num = getNum();
		System.out.println(num);
		
	}
	
	private static int getNum() {
		try {
			int a = 10/0;
			return 1;
		}catch(Exception e) {
			return 2;
		}finally {
			return 3;
		}
		
	}
}




class C {
	protected void name() {
		System.out.println("Class c");
	}
}

class D extends C{
	@Override
	protected void name() {
		super.name();
		System.out.println("Class D");
	}
}
