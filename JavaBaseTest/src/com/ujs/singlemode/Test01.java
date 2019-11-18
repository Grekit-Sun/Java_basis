package com.ujs.singlemode;

public class Test01 {
	//���췽��˽�л�
	private Test01() {}
	//��������
	private static Test01 mTest01 = null;
	//�ṩһ�����÷�����ȡ��ʵ��
	public static Test01 getInstance() {
		if(mTest01 == null) {
			mTest01 = new Test01();
		}
		return mTest01;
	}
}
