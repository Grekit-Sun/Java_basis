package com.ujs.compare;
/**
 * compareTo��Comparable�ӿ��ṩ
 * @author SUN
 * compare()��equals()����������Comparator�ӿ��ṩ
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
