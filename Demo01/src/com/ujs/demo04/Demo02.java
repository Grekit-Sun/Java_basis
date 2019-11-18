package com.ujs.demo04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo02 {
	public static void main(String[] args) {
		Demo02 demo02 = new Demo02();
		demo02.test();
	}

	
	private void test() {
		String s = "jkejjr";
		StringBuffer strb = new StringBuffer();
		strb.append("\"\\999999999999");
		strb.replace(0, 7, s);
		System.err.println(strb);
		ExecutorService mExecutorService = Executors.newFixedThreadPool(10);
		final int Count = 0;
		
		mExecutorService.execute(new Runnable() {
			int index = Count;
			
			@Override
			public void run() {
				index++;
				System.out.println(index);
			}
		});
		mExecutorService.shutdown();
		
	}
}
