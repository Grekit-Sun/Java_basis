package com.ujs.mianshi10;
/**
 * 
 * @author SUN
 * ��Ŀ����ʵ��һ������������һ��������������������Ʊ�ʾ��1�ĸ����������9��ʾ�ɶ�������1001
 * ��2λ��1������������9���������2.
 */
public class CountNum {

	public static void main(String[] args) {
		System.out.println(OneNum(-3));
	}
	
	/**
	 * ��һ��������ȥ1������ԭ���������㣬��Ѹ��������ұߵ�1���0
	 * ������ԭ��1100����1��1011��������������1000.��.��ôһ�������Ķ����Ʊ�ʾ���ж��ٸ�1 ���Ϳ��Խ��ж��ٴ������Ĳ������ܲ�������С����һ��������
	 * @param num
	 * @return
	 */
	private static int OneNum(int num) {
		int count = 0;
		while(num != 0) {
			count++;
//			num = num >> 1;
			num = (num-1) & num;
		}
		return count;
	}
}
