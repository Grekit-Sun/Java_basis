package com.ujs.mianshi2;
/**
 * ��׼�ĵ���ģʽ
 * @author SUN
 *
 */
public class StandardSingle {
	//˽�л�һ����̬ʵ��
	private static StandardSingle mStandardSingle;
	//˽�л����췽��
	private StandardSingle() {}
	//�ṩһ�����з���
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
