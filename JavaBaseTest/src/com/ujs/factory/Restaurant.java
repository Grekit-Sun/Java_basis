package com.ujs.factory;
/**
 * 接口中public static final（可省略，修饰变量）
 * public abstract（默认不写,修饰方法）,public可以不写，abstract也可以不写
 * @author SUN
 *	 如果是非static的话，就表示属于对象的，只有建立对象时才有它，而接口是不能建立对象的，所以接口的
 *常量必须定义为static。
 *
 *final：
 *   接口中不可以定义变量即定义的变量前都要加上final修饰，使之成为常量(没有final修饰的是变量，
 *	加上final修饰就会变成常量)。所以接口的属性默认是public static final 常量，且必须赋
 *初值。（  final修饰就是保证接口定义的常量不能被实现类去修改，如果没有final的话，由子类随意去
 *修改的话，接口建立这个常量就没有意义了。）
 */
public interface Restaurant {
	void cook();
}
