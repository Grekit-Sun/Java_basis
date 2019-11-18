package com.ujs.demo04;

public class SkipCirculate {
	
	public static void main(String[] args) {
		skipCir();
	}
	
	private static void skipCir() {
		int j1 = 0,j2 = 0;
		ok:
		for (;;) {
			j1++;
			System.out.println("第一层循环！"+j1);
			for (;;) {
				j2++;
				System.out.println("第二层循环！"+j2);
				if (j2 == 100) {
					break ok;
				}
			}
		}
		System.out.println("代码走出来了...");
	}
}
