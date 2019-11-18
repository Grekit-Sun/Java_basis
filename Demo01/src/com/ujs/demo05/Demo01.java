package com.ujs.demo05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01 {
	public static void main(String[] args) {
		String time = time();
		System.err.println(time);
	}
	
	private static String time() {
		SimpleDateFormat mFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		System.out.println(date);
		String format = mFormat.format(date);
		return format;
	}
}
