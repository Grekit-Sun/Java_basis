package com.ujs.demo01;

public class ImplementThread implements Runnable{

	@Override
	public void run() {
		System.out.println("实现来的线程："+Thread.currentThread().getName());
	}

}
