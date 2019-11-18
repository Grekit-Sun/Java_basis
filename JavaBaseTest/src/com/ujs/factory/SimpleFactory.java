package com.ujs.factory;
/**
 * ��(��̬)�Ĺ�����
 * @author SUN
 *
 */
public class SimpleFactory {
	
	public static final int TYPE_LZ = 1;
	public static final int TYPE_PM = 2;
	public static final int TYPE_KR = 3;
	
	// create()����ͨ���Ǿ�̬�ģ�����Ҳ��֮Ϊ��̬������
	public static Restaurant creatRes(int type) {
		Restaurant res;
		switch (type) {
			case TYPE_LZ:
				res = new Lanzhou();
				break;
			case TYPE_PM:
				res = new PaoMian();
				break;
			case TYPE_KR:
				res = new KouRou();
				break;
			default:
                throw new RuntimeException("Wrong Restaurant Type: " + type); 
		}
		return res;
	}

}

/**
 * �ص�

1 ����һ��������࣬�ǽӿ� �����ࡣ��һ����Ҫ��create()����������if���� switch������Ʒ�����ء�

2 create()����ͨ���Ǿ�̬�ģ�����Ҳ��֮Ϊ��̬������
ȱ��

1 ��չ�Բ��������һ����������������һ��������Ʒ�࣬����Ҫ�޸Ĺ����෽����

2 ��ͬ�Ĳ�Ʒ��Ҫ��ͬ���������ʱ�� ��֧�֡�
 */
