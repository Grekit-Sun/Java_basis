package com.ujs.demo01;

public class ImplementThread implements Runnable{

	@Override
	public void run() {
		System.out.println("ʵ�������̣߳�"+Thread.currentThread().getName());
	}

}
