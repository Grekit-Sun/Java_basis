package com.ujs.thisstudy;
/**
 * ��ʽ����this���ڴ����
 * @author SUN
 *
 */
public class TestThis {
	
	public static void main(String[] args) {
			TestThis mtestThis = new TestThis(1);
			mtestThis.commomMethod2();
	}
	
	TestThis() {
		System.out.println("���췽���е�this��"+this.getClass().getName());
	}
	
	//���ع�����
	TestThis(String name) {
		this();	
	}
	
	TestThis(int id) {
		this("");
	}
	
	void commomMethod1() {
		System.out.println("��ͨ�����е�this:"+this.getClass().getName());
	}
	
	void commomMethod2() {
		commomMethod1();
	}
	
}
/**
 * ÿһ���������ͨ�����͹��췽�����������صĲ�����this
	1.��ͨ������thisָ����ø÷����Ķ���
	2.���췽����thisָ����Ҫ�����Ķ���
	3.static����������ʹ��this��this�������ھ�̬������ԭ��ܼ򵥣�����static���Ժͷ���
�������࣬��̬�����в�����this��super��ʽ������Ҳ���ǲ���������ĵ�ַ��Ϣ��
 	4.������this(����)���������������صĹ���������ֻ�ܷ��ڷ����ĵ�һ�䣻
 */

/**
 * 	1.ջ:�ֲ�����,���ֶ�������ã�����ֵ��������ʼִ��ǰ���ȴ���ջ֡��ջ��ִ�����ͳ�ջ��;
	2.��:��Ŷ������Ϣ,����ȣ��ڴ˷���;
	3.���������ѵ�һ���֣�ͨ�����ô�ʵ�֣�:�����Ĵ�����Ϣ�������Ĵ��룩��static������������ ;
	4.�������������������������¼��ǰ�ֽ���ִ�е�������
	ps:��Ա�����Ƕ���ĳ�Ա�����Դ��ڶ����棻final���εı����洢�ڳ������У�
 */
