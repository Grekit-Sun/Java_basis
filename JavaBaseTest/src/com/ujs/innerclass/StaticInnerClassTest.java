package com.ujs.innerclass;
/**
 * ��̬�ڲ���
 * @author SUN
 * ����֪����һ����ľ�̬��Ա�������������κ�һ��������ڣ�ֻҪ�ھ��з���Ȩ�޵ĵط���
 * ���ǾͿ���ͨ�� ����.��̬��Ա�� ����ʽ�����������̬��Ա��ͬ���ģ���̬�ڲ���Ҳ����Ϊһ���ⲿ���
 * ��̬��Ա�����ڣ�����һ����ľ�̬�ڲ��������Ҫ�������ⲿ�����
 */
public class StaticInnerClassTest {
	
	public int outFiled1 = 1;
	protected int outFiled2 = 2;
	int outFiled3 = 3;
	private int outFiled4 = 4;
	static int outFiled5 = 5;
	
	StaticInnerClassTest() {
		
		System.out.println("����"+this.getClass().getName()+"����");
		System.out.println("�����ڲ��ྲ̬��Ա������Ҫnew��"+ JingTai.innerFiled5);
		//�ⲿ������ڲ��ֱ࣬��new���ڲ��༴��
		JingTai mJingTai = new JingTai();
		System.out.println("���ڲ���publicֵΪ��"+mJingTai.innerFiled1);
		System.out.println("���ڲ���protectedֵΪ��"+mJingTai.innerFiled2);
		System.out.println("���ڲ���defalultֵΪ��"+mJingTai.innerFiled3);
		System.out.println("���ڲ���privateֵΪ��"+mJingTai.innerFiled4);
		
		//��Java�У�static���Ա�����߶���ʵ�����ʣ����ǽ������ֻ���������ʣ���Ϊstatic��ʾ���������˵�����Ա�����������ʵ���� 
		System.out.println("���ڲ��ྲ̬��ԱҲ�������ڲ��������ȡ����"+JingTai.innerFiled5);
	}
	
	//��̬�ڲ���
	public static class JingTai{
		
		public int innerFiled1 = 6;
		protected int innerFiled2 = 7;
		int innerFiled3 = 8;
		private int innerFiled4 = 9;
		static int innerFiled5 = 10;	//��̬�ڲ����п��Զ���static����
		
		JingTai() {
			//��̬�ڲ�������ⲿ���һ����̬��Աһ����������������������ⲿ�����;
			//��̬�ڲ�����Ҳ�޷������ⲿ��ķǾ�̬��Ա;
			System.out.println("����"+this.getClass().getName()+"����");
			System.out.println("���ⲿ��staticֵΪ��"+outFiled5);
		}
		
	} 
}
