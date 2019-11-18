package com.ujs.abandint;
/**
 * 接口是公开的，不能有私有的方法或变量，接口中的所有方法都没有方法体;
 * @author SUN
 * 接口中的成员变量都是public static final类型;
 * 接口成员变量默认为public static final，必须赋初值，不能被修改；
 */
public interface InterfaceDemo {
	public abstract void case1();
}

/**
 * 接口Interface
1. 接口中的成员变量默认都是public、static、final类型的，必须被显式初始化
2. 接口中的方法默认都是public、abstract类型的。
3. 接口中只能包含public、static、final类型的成员变量和public、abstract类型的成员方法。
4. 接口没有构造方法，不能被实例化，在接口中定义构造方法是非法的。
5. 一个接口不能实现另一个接口，但它可以继承多个其他接口。
interface C extends A, B{} // A和B都是接口
6. 当类实现某个接口时，它必须实现接口中所有的抽象方法，否则这个类必须被定义为抽象类。
7. 接口中没有方法体
 */
