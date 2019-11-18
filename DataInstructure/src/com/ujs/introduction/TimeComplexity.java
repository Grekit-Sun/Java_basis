package com.ujs.introduction;
/**
 * 时间复杂度
 * @author SUN
 *
 */
/*
 * 定义：算法的时间复杂度是执行完所有语句的总和；通常将完成一个语句时间视为单位时间1；
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
		/**1. 语句15、语句16各执行一次，花费单位时间为2；
		 * 2. 语句18、语句19是语句17for语句的循环体，for循环执行次数为N，所以语句17花费单位时间为2N;
		 * 3.因此语句15-语句20，花费时间T（N） = 2+2N;
		 * PS:由于时间问题的复杂性，通常取高阶项，为时间复杂度，记为O（n），
		 * 如：T（n）=2n平方+n+1020,
		 * **/
		System.out.println("x = "+x+";"+"y = "+y+";");
	}
	
}
