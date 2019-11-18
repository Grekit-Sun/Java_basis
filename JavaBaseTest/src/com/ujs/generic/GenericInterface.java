package com.ujs.generic;
/**
 * 接口的泛型  
 * @author SUN
 * 访问权限 class 类名称<泛型,泛型...>
 * 访问权限 interface 接口名称<泛型,泛型...>
 */
public class GenericInterface {
	
	public static void main(String[] args) {
		GImp<Integer> mImp1 = new GImp<Integer>(110);
		GImp<Number> mImp2 = new GImp<Number>(120);
		show(mImp1);
		show(mImp2);
	}
	
	public static void show(GImp<?> m) {	//通配符主要用作含有子类的泛型
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
		System.out.println("构造了一个："+mInfo);
	}
	public void setMInfo(String mInfo) {
		this.mInfo = mInfo;
	}
	
	public String getMInfo() {
		return mInfo;
	}
}