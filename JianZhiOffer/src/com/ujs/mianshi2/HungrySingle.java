package com.ujs.mianshi2;
/**
 * ����ʽ����
 * @author SUN
 *
 */
public class HungrySingle {
	//˽�л�ʵ��
	private final static HungrySingle mHungrySingle = new HungrySingle();
	//˽�л����췽��
	private HungrySingle() {}
	//�ṩһ�����еľ�̬����
	public static HungrySingle getInstance() {
		return mHungrySingle;
	}

}
