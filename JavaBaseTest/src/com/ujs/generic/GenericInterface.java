package com.ujs.generic;
/**
 * �ӿڵķ���  
 * @author SUN
 * ����Ȩ�� class ������<����,����...>
 * ����Ȩ�� interface �ӿ�����<����,����...>
 */
public class GenericInterface {
	
	public static void main(String[] args) {
		GImp<Integer> mImp1 = new GImp<Integer>(110);
		GImp<Number> mImp2 = new GImp<Number>(120);
		show(mImp1);
		show(mImp2);
	}
	
	public static void show(GImp<?> m) {	//ͨ�����Ҫ������������ķ���
		System.out.println(m);
	}

}

interface GenInterface<T> {
	void say();
}

class GImp<T> implements GenInterface<T> {
	private String mInfo;
	
	@Override
	public void say() {
		System.out.println(mInfo);
	}
	public GImp(T mInfo) {
		System.out.println("������һ����"+mInfo);
	}
	public void setMInfo(String mInfo) {
		this.mInfo = mInfo;
	}
	
	public String getMInfo() {
		return mInfo;
	}
}