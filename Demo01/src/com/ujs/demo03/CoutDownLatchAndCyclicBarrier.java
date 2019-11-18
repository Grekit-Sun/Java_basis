package com.ujs.demo03;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CoutDownLatchAndCyclicBarrier {
	public static final int POOL_NUM = 10;
		public static void main(String[] args) {
			ExecutorService mSingleThreadExecutor = Executors.newFixedThreadPool(POOL_NUM);
			CountDownLatch begin = new CountDownLatch(1);
			CountDownLatch end = new CountDownLatch(POOL_NUM);
			for (int i = 0; i<POOL_NUM; i++) {
				final int index = i;
				mSingleThreadExecutor.execute(new Runnable() {
				
				@Override
				public void run() {
					try {
						begin.await();
						System.out.println(Thread.currentThread().getName());
						Thread.sleep(1000);
						System.out.println(Thread.currentThread().getName());
						System.out.println(index);
						end.countDown();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
			});
		}
			
			try {
				System.out.println("1s后开始赛跑");
				Thread.sleep(1000);
				begin.countDown();
				
				end.await();
				System.out.println("比赛停止");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
}
