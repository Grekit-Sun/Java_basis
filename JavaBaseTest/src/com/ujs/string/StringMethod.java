package com.ujs.string;

public class StringMethod {
	public static void main(String[] args) {
		String str = "abcdefghijk";
		//使用StringBuffer或者StringBuilder进行字符反转
		StringBuffer strBuff = new StringBuffer(str);
		System.out.println("字符反转："+strBuff.reverse());
//		indexOf():返回指定字符的索引；
		System.out.println("指定字符的索引:"+str.indexOf("d"));
//		charAt():返回指定索引处的字符；
		System.out.println("指定索引处的字符："+str.charAt(3));
//		replace():字符串替换；
		System.out.println("字符串替换:"+str.replace('a', 'c'));
//		trim():去除字符串两端空白；
		String strTrim = "      "+str+"           ";
		System.out.println("两端空白："+strTrim);
		System.out.println("去除两端空白："+strTrim.trim());
//		split():分割字符串，返回一个分割后的字符串数组。
		String[] strs = str.split("b");
		for(String str1 : strs) {
			System.out.println(str1);
		}
//		getBytes():返回字符串的byte类型数组。
		byte[] bytes = str.getBytes();
		System.out.print("字符串的byte类型数组:");
		for(byte b:bytes) {
			System.out.print(b+",");
		}
//		length():返回字符串长度；
		System.out.println("字符串长度:"+str.length());
//		toLowerCase():将字符串转成小写字母；
		String str2 = "KSKAjaskdjKJASFJAcakj";
		System.out.println("字符串转成小写字母:"+str2.toLowerCase());
//		toUpperCase():将字符串转成大写字母；
		System.out.println("将字符串转成大写字母:"+str.toUpperCase());
//		substring():截取字符串,用于提取字符串中介于两个指定下标之间的字符；
		System.out.println("截取字符串1:"+str.substring(3,4));
		System.out.println("截取字符串2:"+str.substring(3));
//		equals():字符串比较；
	}
}
