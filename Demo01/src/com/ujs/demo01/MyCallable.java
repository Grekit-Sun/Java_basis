package com.ujs.demo01;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String>{

	@Override
	public String call() throws Exception {
		Thread.currentThread().setName("implementCallable");
		System.out.println("java���߳�ʵ��callable�ӿ�:"+Thread.currentThread().getName());
		String str = "callable";
		return  str;
	}

}
