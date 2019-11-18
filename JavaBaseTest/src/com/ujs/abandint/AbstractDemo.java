package com.ujs.abandint;
/**
 * 抽象类是可以有私有方法或私有变量的，通过把类或者类中的方法声明为abstract来表示一个类是抽象类，
 * 被声明为抽象的方法不能包含方法体。子类实现方法必须含有相同的或者更低的访问级别(public->
 * protected->private)。抽象类的子类为父类中所有抽象方法的具体实现，否则也是抽象类。
 * @author SUN
 *  抽象方法被abstract修饰，不能被private、static、synchronized和native等修饰，
 *  必须以分号结尾，不带花括号。
 */
public abstract class AbstractDemo {
	
	public abstract void case1();
	abstract void case2();

}
