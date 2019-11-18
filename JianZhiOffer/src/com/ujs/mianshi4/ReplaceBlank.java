package com.ujs.mianshi4;
/**
 * 替换空格
 * @author SUN
 *	题目：请实现一个函数把字符串中的每个空格都换成%20
 */
public class ReplaceBlank {
	public static void main(String[] args) {
		String str = "WE ARE SO HAPPY";
		System.out.println(replaceBlank(str));
	}
	private static String replaceBlank(String input) {
		if(input == null) {
			return null;
		}
		StringBuffer output = new StringBuffer();
		for(int i = 0;i<input.length();i++) {
			if(input.charAt(i)==' ') {
				output.append("%20");
			}else {
				output.append(String.valueOf(input.charAt(i)));
			}
		}
		return new String(output);
	}
}
