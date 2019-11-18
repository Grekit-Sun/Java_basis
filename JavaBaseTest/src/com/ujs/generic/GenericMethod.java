package com.ujs.generic;
/**
 * 泛型方法
 * @author SUN
 * 格式：
 *	访问权限<泛型标识> 泛型标识 方法名称（[泛型标识  参数名称]）
 *
 */
public class GenericMethod {
	public static void main(String[] args) {
		GMethod mGm = new GMethod();
		String tell = mGm.tell("Your Num");
		System.out.println(tell);
	}
}

class GMethod {
	public <T> T tell(T t) {
		return t;
	}
}
