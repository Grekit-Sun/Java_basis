package com.ujs.mianshi2;
/**
 * ����ʽ����
 * @author SUN
 *
 */
public class LanHan {
	//˽�л���̬ʵ��
	private static LanHan mLanHan;
	//˽�л����췽��
	private LanHan() {}
	//�ṩһ�����еľ�̬����
	public static LanHan getInstance() {
		if(mLanHan == null) {
			mLanHan = new LanHan();
		}
		return mLanHan;
	}
}
