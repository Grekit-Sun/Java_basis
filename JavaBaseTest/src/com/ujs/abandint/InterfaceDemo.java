package com.ujs.abandint;
/**
 * �ӿ��ǹ����ģ�������˽�еķ�����������ӿ��е����з�����û�з�����;
 * @author SUN
 * �ӿ��еĳ�Ա��������public static final����;
 * �ӿڳ�Ա����Ĭ��Ϊpublic static final�����븳��ֵ�����ܱ��޸ģ�
 */
public interface InterfaceDemo {
	public abstract void case1();
}

/**
 * �ӿ�Interface
1. �ӿ��еĳ�Ա����Ĭ�϶���public��static��final���͵ģ����뱻��ʽ��ʼ��
2. �ӿ��еķ���Ĭ�϶���public��abstract���͵ġ�
3. �ӿ���ֻ�ܰ���public��static��final���͵ĳ�Ա������public��abstract���͵ĳ�Ա������
4. �ӿ�û�й��췽�������ܱ�ʵ�������ڽӿ��ж��幹�췽���ǷǷ��ġ�
5. һ���ӿڲ���ʵ����һ���ӿڣ��������Լ̳ж�������ӿڡ�
interface C extends A, B{} // A��B���ǽӿ�
6. ����ʵ��ĳ���ӿ�ʱ��������ʵ�ֽӿ������еĳ��󷽷��������������뱻����Ϊ�����ࡣ
7. �ӿ���û�з�����
 */
