package com.ujs.demo03;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchDemo {
	public static final int POOL_NUM = 10;
	public static void main(String[] args) {
		ExecutorService mExecutorService = Executors.newFixedThreadPool(POOL_NUM);
		CountDownLatch begin = new CountDownLatch(1);
		CountDownLatch end = new CountDownLatch(POOL_NUM);
		for(int i = 0;i<POOL_NUM;i++) {
		mExecutorService.execute(new Runnable() {
			
			@Override
			public void run() {
				try {
					begin.await();
					System.out.println(Thread.currentThread().getName());
					Thread.sleep(1000);
					System.out.println(Thread.currentThread().getName());
					end.countDown();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		}
		try {
			System.out.println("1秒钟后开始比赛");
			Thread.sleep(1000);
			begin.countDown();
			
			end.await();
			System.out.println("比赛停止");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
