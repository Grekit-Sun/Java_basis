package com.ujs.singlemode;

public class Test02 {
	//私有化构造方法
	private Test02() {}
	//创建静态实例化
	private static Test02 mTest;
	//提供一个公有的静态方法
	public static Test02 getInstance() {
		if(mTest == null) {
			synchronized (Test02.class) {
				if(mTest == null) {
					mTest = new Test02();
				}
			}
		}
		return mTest;
	}
}
