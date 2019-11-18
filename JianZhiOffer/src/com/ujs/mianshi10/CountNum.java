package com.ujs.mianshi10;
/**
 * 
 * @author SUN
 * 题目：请实现一个函数，输入一个整数，输出该数二进制表示中1的个数。例如把9表示成二进制是1001
 * 有2位是1，因此如果输入9，函数输出2.
 */
public class CountNum {

	public static void main(String[] args) {
		System.out.println(OneNum(-3));
	}
	
	/**
	 * 把一个整数减去1，在与原数做与运算，会把该整数最右边的1变成0
	 * （例如原数1100，减1得1011，做完与运算后得1000.）.那么一个整数的二进制表示中有多少个1 ，就可以进行多少次这样的操作。总操作明显小于上一个方法。
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
