package com.ujs.reverse;

public class Reverse {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("abcdefg");
		str.append("hijklmn");
		System.out.println(str.reverse());
	}
}
