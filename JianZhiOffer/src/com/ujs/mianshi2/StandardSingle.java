package com.ujs.mianshi2;
/**
 * 标准的单例模式
 * @author SUN
 *
 */
public class StandardSingle {
	//私有化一个静态实例
	private static StandardSingle mStandardSingle;
	//私有化构造方法
	private StandardSingle() {}
	//提供一个公有方法
	public static StandardSingle getInstance() {
		if(mStandardSingle == null) {
			synchronized (StandardSingle.class) {
				if(mStandardSingle == null) {
					mStandardSingle = new StandardSingle();
				}
			}
		}
		return mStandardSingle;
	}
}
