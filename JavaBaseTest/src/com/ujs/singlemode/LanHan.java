package com.ujs.singlemode;
/**
 * ����ʽ����
 * @author SUN
 * ���ַ�ʽ�Ĵ���ʵ���ڵ��߳�����û�����⣬�����ڶ��߳��оͻ���ɴ���
 * ���ʵ���������߳��ǲ���ȫ�ģ�������Ҫ�Ľ�һ�¡�
 */
public class LanHan {
	
	//˽�о�̬ʵ��
	private static LanHan mLanHan;
	
	//˽�й��췽��
	private LanHan() {}
	
	//�ṩһ����̬�Ĺ��з��������ص�һʵ��
	public synchronized static LanHan getInstance() {
		if(mLanHan == null) {
			mLanHan = new LanHan();
		}
		return mLanHan; 
	}
}
