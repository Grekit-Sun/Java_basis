package com.ujs.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericClass {
	public static void main(String[] args) {
		Hgeneric<String> mStr = new Hgeneric<String>("");
		mStr.setInfo("塞了一个String");
		System.out.println(mStr.getInfo());
		Hgeneric<Integer> mInt = new Hgeneric<Integer>(1);
		mInt.setInfo(110);
		System.out.println(mInt.getInfo());

		Hgeneric<Number> mInfo = new Hgeneric<Number>(232323);
		showKey(mInfo);	
		showKey(mInt);	
		testGArray();
	}
	//Generic<Integer>不能被看作为Generic<Number>的子类。由此可以看出:
	//同一种泛型可以对应多个版本（因为参数类型是不确定的），不同版本的泛型类实例是不兼容的。
//	public static void showKey(Hgeneric<Number> obj) {	
	public static void showKey(Hgeneric<?> obj) {
		System.out.println(obj.getInfo());
	}
	
	//泛型数组
	/*
	 * 不能创建一个确切的泛型类型的数组
		也就是说下面这条语句不支持
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
	
	public Hgeneric(A info) {		//构造方法中使用泛型
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