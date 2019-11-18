package com.ujs.singlemode;
/**
 * 懒汉式单例
 * @author SUN
 * 这种方式的创建实例在单线程中是没有问题，但是在多线程中就会造成创建
 * 多个实例，所以线程是不安全的，我们需要改进一下。
 */
public class LanHan {
	
	//私有静态实例
	private static LanHan mLanHan;
	
	//私有构造方法
	private LanHan() {}
	
	//提供一个静态的公有方法，返回单一实例
	public synchronized static LanHan getInstance() {
		if(mLanHan == null) {
			mLanHan = new LanHan();
		}
		return mLanHan; 
	}
}
