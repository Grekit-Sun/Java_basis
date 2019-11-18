package com.ujs.singlemode;

public class Test02 {
	//˽�л����췽��
	private Test02() {}
	//������̬ʵ����
	private static Test02 mTest;
	//�ṩһ�����еľ�̬����
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
