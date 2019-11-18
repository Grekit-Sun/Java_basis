package com.ujs.thisstudy;
/**
 * 隐式参数this与内存分析
 * @author SUN
 *
 */
public class TestThis {
	
	public static void main(String[] args) {
			TestThis mtestThis = new TestThis(1);
			mtestThis.commomMethod2();
	}
	
	TestThis() {
		System.out.println("构造方法中的this："+this.getClass().getName());
	}
	
	//重载构造器
	TestThis(String name) {
		this();	
	}
	
	TestThis(int id) {
		this("");
	}
	
	void commomMethod1() {
		System.out.println("普通方法中的this:"+this.getClass().getName());
	}
	
	void commomMethod2() {
		commomMethod1();
	}
	
}
/**
 * 每一个对象的普通方法和构造方法，都有隐藏的参数，this
	1.普通方法，this指向调用该方法的对象
	2.构造方法，this指向正要创建的对象
	3.static方法，不能使用this（this不用用于静态方法，原因很简单，由于static属性和方法
从属于类，静态方法中不包含this，super隐式参数，也就是不包含对象的地址信息）
 	4.可以用this(参数)来调用其他的重载的构造器，且只能放在方法的第一句；
 */

/**
 * 	1.栈:局部变量,各种对象的引用，返回值（方法开始执行前就先创建栈帧入栈，执行完后就出栈）;
	2.堆:存放对象的信息,数组等，在此分配;
	3.方法区（堆的一部分，通常永久代实现）:存放类的代码信息（编译后的代码），static变量，常量池 ;
	4.程序计数器：计数器，用来记录当前字节码执行的行数；
	ps:成员变量是对象的成员，所以存在堆里面；final修饰的变量存储在常量池中；
 */
