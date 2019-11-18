package com.ujs.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericClass {
	public static void main(String[] args) {
		Hgeneric<String> mStr = new Hgeneric<String>("");
		mStr.setInfo("����һ��String");
		System.out.println(mStr.getInfo());
		Hgeneric<Integer> mInt = new Hgeneric<Integer>(1);
		mInt.setInfo(110);
		System.out.println(mInt.getInfo());

		Hgeneric<Number> mInfo = new Hgeneric<Number>(232323);
		showKey(mInfo);	
		showKey(mInt);	
		testGArray();
	}
	//Generic<Integer>���ܱ�����ΪGeneric<Number>�����ࡣ�ɴ˿��Կ���:
	//ͬһ�ַ��Ϳ��Զ�Ӧ����汾����Ϊ���������ǲ�ȷ���ģ�����ͬ�汾�ķ�����ʵ���ǲ����ݵġ�
//	public static void showKey(Hgeneric<Number> obj) {	
	public static void showKey(Hgeneric<?> obj) {
		System.out.println(obj.getInfo());
	}
	
	//��������
	/*
	 * ���ܴ���һ��ȷ�еķ������͵�����
		Ҳ����˵����������䲻֧��
		List<String>[] ls = new ArrayList<String>[10]; 
	 */
	public static void testGArray() {
	List<?>[] list = new ArrayList<?>[10];
	List<String> mStrList = new ArrayList<String>();
	mStrList.add("1");
	list[0] = mStrList;
	System.out.println(list[0]);
	}
}
class Hgeneric<A> {
	private A info;
	
	public Hgeneric(A info) {		//���췽����ʹ�÷���
		this.info = info;
	}
	
	public Hgeneric() {}
	
	public A getInfo() {
		return info;
	}

	public void setInfo(A info) {
		this.info = info;
	}
}

class Dgeneric<K,V> {
	
}