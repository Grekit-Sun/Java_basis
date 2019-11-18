package com.ujs.singlemode;

public class Test01 {
	//构造方法私有化
	private Test01() {}
	//创建单例
	private static Test01 mTest01 = null;
	//提供一个公用方法获取该实例
	public static Test01 getInstance() {
		if(mTest01 == null) {
			mTest01 = new Test01();
		}
		return mTest01;
	}
}
