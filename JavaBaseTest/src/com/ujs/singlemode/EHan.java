package com.ujs.singlemode;
/**
 * 饿汉式单例
 * @author SUN
 * 像一个饿汉一样，不管需不需要用到实例都要去创建实例，即在类产生的时候就创建好实例，这是一种空间换时间
 * 的做法。作为一个饿汉而言，体现了它的本质——“我全都要”。
 */
public class EHan {
	
	//私有静态实例(饿汉一开始就new)
	private final static EHan mEHan = new EHan();
	
	/**
	 * 声明为final的变量，必须在类加载完成时已经赋值， 是什么意思呢？
	就是，如果你是final非static成员，必须在构造器、代码块、或者直接定义赋值；
	如果是final static 成员变量，必须直接赋值 或者在静态代码块中赋值。然而直接赋值或静态代码块中赋值就变成饿汉模式了
	所以懒汉模式中不能用final修饰
	 */
	
	
	//私有化构造方法
	private EHan() {}
	
	//给出一个静态公有方法
	public static EHan getInstance() {
		return mEHan;
	}
}
/**	当类加载的时候就初始化这个实例，创建单例实例简单容易，但是有一个弊
*	端，这个实例有可能没有被使用;同时也没有任何的异常处理;
**/