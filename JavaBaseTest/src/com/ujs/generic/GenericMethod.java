package com.ujs.generic;
/**
 * ���ͷ���
 * @author SUN
 * ��ʽ��
 *	����Ȩ��<���ͱ�ʶ> ���ͱ�ʶ �������ƣ�[���ͱ�ʶ  ��������]��
 *
 */
public class GenericMethod {
	public static void main(String[] args) {
		GMethod mGm = new GMethod();
		String tell = mGm.tell("Your Num");
		System.out.println(tell);
	}
}

class GMethod {
	public <T> T tell(T t) {
		return t;
	}
}
