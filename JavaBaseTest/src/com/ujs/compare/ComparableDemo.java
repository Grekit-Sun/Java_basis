package com.ujs.compare;
/**
 * compareTo是Comparable接口提供
 * @author SUN
 * compare()和equals()两个方法是Comparator接口提供
 */
public class ComparableDemo	{

	public static void main(String[] args) {
		String str1 = new String();
		String str2 = new String("1231");
		int compareTo = str1.compareTo(str2);
		System.out.println(compareTo);
		str1.equals(str2);
//		str1.compare(str2);
	}

}
