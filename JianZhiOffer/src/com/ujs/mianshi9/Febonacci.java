package com.ujs.mianshi9;
/**
 * 斐波那契数列（兔子数列）
 * @author SUN
 * 用递归的方法
 * 通项公式：f(n+2) = f(n) + f(n+1)  f(1)=f(2)=1  n是第几个月
 */
public class Febonacci {
	public static void main(String[] args) {
		//用一个循环打印1~100的数字
		for(int i = 1; i<=10; i++) {
			System.out.println(feb(i));
		}
	}
	
	private static int feb(int n) {
		if(n == 1 || n ==2) {
			return 1;
		}else {
			//递归
			return feb(n-1)+feb(n-2); 
		}
	}
}
