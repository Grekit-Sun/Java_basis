package com.ujs.generic;
/**
 * �������±߽�
 * @author SUN
 *
 */
public class GenericBoundary {
	public static void main(String[] args) {
		GenericImp<Integer> imp = new GenericImp<>(11);
		showUp(imp);
		showDown(imp);
	}
	//�����ϱ߽�
	public static void showUp(GenericImp<? extends Number> gImp) {
		System.out.println("�����������ϱ߽磺" + gImp);
	}
	//�����±߽�
	public static void showDown(GenericImp<? super Integer> gImp) {
		System.out.println("�����������±߽磺" + gImp);
	}
	//���ͷ���������
	//�ڷ��ͷ�����������±߽����Ƶ�ʱ�򣬱�����Ȩ�������뷵��ֵ֮���<T>��������±߽磬���ڷ���������ʱ�����
	//�ϱ߽�
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
