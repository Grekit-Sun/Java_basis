package com.ujs.introduction;
/**
 * ʱ�临�Ӷ�
 * @author SUN
 *
 */
/*
 * ���壺�㷨��ʱ�临�Ӷ���ִ�������������ܺͣ�ͨ�������һ�����ʱ����Ϊ��λʱ��1��
 * */
public class TimeComplexity {
	public static final int N = 100;
	public static void main(String[] args) {
		int x,y;
		
		x = 0;
		y = 0;
		for (int i=0;i<N;i++) {
			x = x+i;
			y = x+i;
		}
		/**1. ���15�����16��ִ��һ�Σ����ѵ�λʱ��Ϊ2��
		 * 2. ���18�����19�����17for����ѭ���壬forѭ��ִ�д���ΪN���������17���ѵ�λʱ��Ϊ2N;
		 * 3.������15-���20������ʱ��T��N�� = 2+2N;
		 * PS:����ʱ������ĸ����ԣ�ͨ��ȡ�߽��Ϊʱ�临�Ӷȣ���ΪO��n����
		 * �磺T��n��=2nƽ��+n+1020,
		 * **/
		System.out.println("x = "+x+";"+"y = "+y+";");
	}
	
}
