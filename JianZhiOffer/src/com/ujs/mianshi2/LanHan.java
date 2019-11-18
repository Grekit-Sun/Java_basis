package com.ujs.mianshi2;
/**
 * 懒汉式单例
 * @author SUN
 *
 */
public class LanHan {
	//私有化静态实例
	private static LanHan mLanHan;
	//私有化构造方法
	private LanHan() {}
	//提供一个公有的静态方法
	public static LanHan getInstance() {
		if(mLanHan == null) {
			mLanHan = new LanHan();
		}
		return mLanHan;
	}
}
