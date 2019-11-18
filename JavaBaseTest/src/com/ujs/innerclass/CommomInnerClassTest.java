package com.ujs.innerclass;

import com.ujs.innerclass.CommomInnerClassTest.PuTongInnerClass;

/**
 * ��ͨ�ڲ���
 * @author SUN
 * �ڲ���������ֱ�ӷ����ⲿ����������з���Ȩ�޵��ֶΣ�ͬʱ���ⲿ�����Ҳ����ͨ���ڲ���Ķ�������������
  �ڲ����ж�������з���Ȩ�޵��ֶΡ�
 */
public class CommomInnerClassTest {
	
	public int outFiled1 = 1;
	protected int outFiled2 = 2;
	int outFiled3 = 3;
	private int outFiled4 = 4;
	static int outFiled5 = 5;
	
	CommomInnerClassTest() {
		//�ⲿ�෽����ֱ�� new�ڲ���ģ���������,���Է����ڲ����е�����Ȩ�޵ĳ�Ա
		PuTongInnerClass mNeibu = new PuTongInnerClass();
		System.out.println("����"+this.getClass().getName()+"����");
		System.out.println("���ڲ���publicֵΪ��"+mNeibu.innerFiled1);
		System.out.println("���ڲ���protectedֵΪ��"+mNeibu.innerFiled2);
		System.out.println("���ڲ���defalultֵΪ��"+mNeibu.innerFiled3);
		System.out.println("���ڲ���privateֵΪ��"+mNeibu.innerFiled4);
	}
	
	public class PuTongInnerClass {
		
		public int innerFiled1 = 6;
		protected int innerFiled2 = 7;
		int innerFiled3 = 8;
		private int innerFiled4 = 9;
//		static int innerFiled5 = 10;	//��ͨ�ڲ����в��ܶ���static����
		/**
		 * ֪ʶ��
		 * 	��static���ڲ��࣬���ⲿ����ص�ʱ�򣬲���������������������治���о�̬�������߾�̬������
		 * 1��static���͵����Ժͷ�����������ص�ʱ��ͻ�������ڴ��С�
		 * 2��Ҫʹ��ĳ�����static���Ի��߷�������ô��������Ҫ���ص�jvm�С�
		 * **/
		 PuTongInnerClass() {
			 
			 //�ڲ������ֱ�ӷ����ⲿ��������ⲿ����������з���Ȩ�޵��ֶ�
			 System.out.println("����"+this.getClass().getName()+"����");
			 System.out.println("���ⲿ��publicֵΪ��"+outFiled1);
			 System.out.println("���ⲿ��protectedֵΪ��"+outFiled2);
			 System.out.println("���ⲿ��defaultֵΪ��"+outFiled3);
			 System.out.println("���ⲿ��privateֵΪ��"+outFiled4);
			 System.out.println("���ⲿ��staticֵΪ��"+outFiled5);
		} 
		
	}
	
	void TestPuTongInner() {
		
		PuTongInnerClass mInnerClass = new CommomInnerClassTest.PuTongInnerClass();
		System.out.println(mInnerClass.innerFiled1);
		System.out.println(mInnerClass.innerFiled2);
	}
	public static void main(String[] args) {
		new CommomInnerClassTest();
	}
}

class OutClass {
	OutClass() {
	}
}
