package com.ujs.innerclass;

/**
 * �����ڲ���(�ڷ�����ʵ��)
 * @author SUN
 *	ͬ���ģ��������ڲ����п���ʹ���ⲿ������ԣ������ⲿ��ȴ����ʹ�������ڲ����ж�������ԣ�
 *��Ϊ�������ڲ��࣬������ⲿ�����޷���ȡ������������Ҳ���޷��õ�������Ϣ��
 */
public class AnonymousInnerClass {
	
	public int outFiled1 = 1;
	protected int outFiled2 = 2;
	int outFiled3 = 3;
	private int outFiled4 = 4;
	static int outFiled5 = 5;
	
	AnonymousInnerClass() {
		System.out.println("���� " + this.getClass().getSimpleName() + " ����");
	}

	public static void main(String[] args) {
		AnonymousInnerClass mAnonymousInnerClass = new AnonymousInnerClass();
		mAnonymousInnerClass.anonymousInnerClassTest();
	}
	
	//�Զ���ӿ�
	interface OnClickListener {
		void onClick(Object obj);
	}
	
	//�ڷ����в���ʹ��
	private void anonymousInnerClassTest() {
		OnClickListener onClickListener = new OnClickListener() {
			// �������ڲ����ж������ԣ�����ֻ���ڵ�ǰ�ڲ�����ʹ�ã�
	        // �޷����ⲿ����ʹ�ã���Ϊ�ⲿ���޷���ȡ��ǰ�����ڲ����������
	        // Ҳ���޷����������ڲ���Ķ���
			///��JDK8����������������ڲ�������Ҫ���ʾֲ���������ô����ֲ���������Ҫ��final���η����Ρ�
			//jdk8֮��ϵͳ�Զ�����final��
			/**�ֲ����������������ǵ��÷���������ʱ���÷����еľֲ�������ջ�б����������������ý���ʱ��ִ����ϣ���
			��ջ����Щ�ֲ������ͻ������������ڲ�������Ǵ����ڶ��еģ����������ڸ�������һ����ֻ�е�jvm�ÿɴ��Է���
			�������������ͨ��GCRoots�ڵ��Ѿ����ɴȻ�����gc�Ż�������
			**/
			final int innerField = 1;
			
			@Override
			public void onClick(Object obj) {
				
				 //�ڲ������ֱ�ӷ����ⲿ��������ⲿ����������з���Ȩ�޵��ֶ�
				 System.out.println("����"+this.getClass().getName()+"����");
				 System.out.println("���ⲿ��publicֵΪ��"+outFiled1);
				 System.out.println("���ⲿ��protectedֵΪ��"+outFiled2);
				 System.out.println("���ⲿ��defaultֵΪ��"+outFiled3);
				 System.out.println("���ⲿ��privateֵΪ��"+outFiled4);
				 System.out.println("���ⲿ��staticֵΪ��"+outFiled5);
				 
				 System.out.println("���ڲ���ֵΪ��"+innerField);
			}
		};
		
		// new Object() ���̻��½�һ�������ڲ��࣬�̳��� Object �࣬
        // ����д�� toString() ����
		onClickListener.onClick(new Object() {
			@Override
			public String toString() {
				 return "obj1";
			}
		});
		
	}
	
}
