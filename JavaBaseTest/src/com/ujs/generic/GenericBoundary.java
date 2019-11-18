package com.ujs.generic;
/**
 * 泛型上下边界
 * @author SUN
 *
 */
public class GenericBoundary {
	public static void main(String[] args) {
		GenericImp<Integer> imp = new GenericImp<>(11);
		showUp(imp);
		showDown(imp);
	}
	//设置上边界
	public static void showUp(GenericImp<? extends Number> gImp) {
		System.out.println("我是在设置上边界：" + gImp);
	}
	//设置下边界
	public static void showDown(GenericImp<? super Integer> gImp) {
		System.out.println("我是在设置下边界：" + gImp);
	}
	//泛型方法的例子
	//在泛型方法中添加上下边界限制的时候，必须在权限声明与返回值之间的<T>上添加上下边界，即在泛型声明的时候添加
	//上边界
	public <T extends Number> T tellUp(T t) {
		return t;
	}
//	public <T super Integer> T tellDown(T t) {
//		return t;
//	}
}

class GenericImp<T> {
	GenericImp(T t) {
		System.out.println(t);
	}
}
