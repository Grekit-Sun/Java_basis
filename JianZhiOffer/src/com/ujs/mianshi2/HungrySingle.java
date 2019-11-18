package com.ujs.mianshi2;
/**
 * 饿汉式单例
 * @author SUN
 *
 */
public class HungrySingle {
	//私有化实例
	private final static HungrySingle mHungrySingle = new HungrySingle();
	//私有化构造方法
	private HungrySingle() {}
	//提供一个公有的静态方法
	public static HungrySingle getInstance() {
		return mHungrySingle;
	}

}
