package com.ujs.generic;
/**
 * 不使用泛型的例子
 * @author SUN
 *
 */
public class NonGenericClass {
	public static void main(String[] args) {
		Generic g = new Generic();
		g.setInfo(100);
		String info = (String)g.getInfo();  //实际上是int型，编译时不会报错
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
