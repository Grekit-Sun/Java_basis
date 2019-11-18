package com.ujs.innerclass;

import com.ujs.innerclass.CommomInnerClassTest.PuTongInnerClass;

/**
 * 普通内部类
 * @author SUN
 * 内部类对象可以直接访问外部类对象中所有访问权限的字段，同时，外部类对象也可以通过内部类的对象引用来访问
  内部类中定义的所有访问权限的字段。
 */
public class CommomInnerClassTest {
	
	public int outFiled1 = 1;
	protected int outFiled2 = 2;
	int outFiled3 = 3;
	private int outFiled4 = 4;
	static int outFiled5 = 5;
	
	CommomInnerClassTest() {
		//外部类方法中直接 new内部类的，创建对象,可以访问内部类中的所有权限的成员
		PuTongInnerClass mNeibu = new PuTongInnerClass();
		System.out.println("创建"+this.getClass().getName()+"对象！");
		System.out.println("其内部类public值为："+mNeibu.innerFiled1);
		System.out.println("其内部类protected值为："+mNeibu.innerFiled2);
		System.out.println("其内部类defalult值为："+mNeibu.innerFiled3);
		System.out.println("其内部类private值为："+mNeibu.innerFiled4);
	}
	
	public class PuTongInnerClass {
		
		public int innerFiled1 = 6;
		protected int innerFiled2 = 7;
		int innerFiled3 = 8;
		private int innerFiled4 = 9;
//		static int innerFiled5 = 10;	//普通内部类中不能定义static属性
		/**
		 * 知识：
		 * 	非static的内部类，在外部类加载的时候，并不会加载它，所以它里面不能有静态变量或者静态方法。
		 * 1、static类型的属性和方法，在类加载的时候就会存在于内存中。
		 * 2、要使用某个类的static属性或者方法，那么这个类必须要加载到jvm中。
		 * **/
		 PuTongInnerClass() {
			 
			 //内部类可以直接访问外部类的所有外部类对象中所有访问权限的字段
			 System.out.println("创建"+this.getClass().getName()+"对象！");
			 System.out.println("其外部类public值为："+outFiled1);
			 System.out.println("其外部类protected值为："+outFiled2);
			 System.out.println("其外部类default值为："+outFiled3);
			 System.out.println("其外部类private值为："+outFiled4);
			 System.out.println("其外部类static值为："+outFiled5);
		} 
		
	}
	
	void TestPuTongInner() {
		
		PuTongInnerClass mInnerClass = new CommomInnerClassTest.PuTongInnerClass();
		System.out.println(mInnerClass.innerFiled1);
		System.out.println(mInnerClass.innerFiled2);
	}
	public static void main(String[] args) {
		new CommomInnerClassTest();
	}
}

class OutClass {
	OutClass() {
	}
}
