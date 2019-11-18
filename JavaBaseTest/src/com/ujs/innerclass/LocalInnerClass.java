package com.ujs.innerclass;
/**
 * �ֲ��ڲ��� (ֻ����һ���ķ�������ʹ��)
 * @author SUN
 *	������ͬ���ģ��ھֲ��ڲ���������Է����ⲿ���������з���Ȩ�޵��ֶΣ����ⲿ��ȴ���ܷ��ʾֲ��ڲ�����
 *������ֶΣ���Ϊ�ֲ��ڲ���Ķ���ֻ�����ض��ķ����� / ���������Ч��һ�����������������ô�䶨���
 *ʧЧ�ˣ�һ�������ڲ���ֱ�����
 */
public class LocalInnerClass {
	
	public int outFiled1 = 1;
	protected int outFiled2 = 2;
	int outFiled3 = 3;
	private int outFiled4 = 4;
	static int outFiled5 = 5;
	
	private void testLocalInnerClass() {
		class A {
			final int innerField = 1;
			
			private A() {
				//�ڲ������ֱ�ӷ����ⲿ��������ⲿ����������з���Ȩ�޵��ֶ�
				 System.out.println("����"+this.getClass().getName()+"����");
				 System.out.println("���ⲿ��publicֵΪ��"+outFiled1);
				 System.out.println("���ⲿ��protectedֵΪ��"+outFiled2);
				 System.out.println("���ⲿ��defaultֵΪ��"+outFiled3);
				 System.out.println("���ⲿ��privateֵΪ��"+outFiled4);
				 System.out.println("���ⲿ��staticֵΪ��"+outFiled5);
				 
				 System.out.println("���ڲ���ֵΪ��"+innerField);
			}
		}
		A a = new A();
	}
//	A a = new A();     //����������� A �Ķ������ڣ��Ҳ����� A
}
