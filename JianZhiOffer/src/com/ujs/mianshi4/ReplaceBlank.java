package com.ujs.mianshi4;
/**
 * �滻�ո�
 * @author SUN
 *	��Ŀ����ʵ��һ���������ַ����е�ÿ���ո񶼻���%20
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
