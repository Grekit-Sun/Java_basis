package com.ujs.generic;
/**
 * ��ʹ�÷��͵�����
 * @author SUN
 *
 */
public class NonGenericClass {
	public static void main(String[] args) {
		Generic g = new Generic();
		g.setInfo(100);
		String info = (String)g.getInfo();  //ʵ������int�ͣ�����ʱ���ᱨ��
		System.out.println(info);

	}
}

class Generic {
	private Object info;
 
	public Object getInfo() {
		return info;
	}
	public void setInfo(Object info) {
		this.info = info;
	}

}
