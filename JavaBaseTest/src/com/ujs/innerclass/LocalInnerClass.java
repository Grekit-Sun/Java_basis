package com.ujs.innerclass;
/**
 * 局部内部类 (只能在一定的方法里面使用)
 * @author SUN
 *	与匿名同样的，在局部内部类里面可以访问外部类对象的所有访问权限的字段，而外部类却不能访问局部内部类中
 *定义的字段，因为局部内部类的定义只在其特定的方法体 / 代码块中有效，一旦出了这个定义域，那么其定义就
 *失效了，一般匿名内部类直接替代
 */
public class LocalInnerClass {
	
	public int outFiled1 = 1;
	protected int outFiled2 = 2;
	int outFiled3 = 3;
	private int outFiled4 = 4;
	static int outFiled5 = 5;
	
	private void testLocalInnerClass() {
		class A {
			final int innerField = 1;
			
			private A() {
				//内部类可以直接访问外部类的所有外部类对象中所有访问权限的字段
				 System.out.println("创建"+this.getClass().getName()+"对象！");
				 System.out.println("其外部类public值为："+outFiled1);
				 System.out.println("其外部类protected值为："+outFiled2);
				 System.out.println("其外部类default值为："+outFiled3);
				 System.out.println("其外部类private值为："+outFiled4);
				 System.out.println("其外部类static值为："+outFiled5);
				 
				 System.out.println("其内部类值为："+innerField);
			}
		}
		A a = new A();
	}
//	A a = new A();     //编译错误不在类 A 的定义域内，找不到类 A
}
