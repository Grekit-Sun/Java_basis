package com.ujs.demo04;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownAndCyclicBarrier {
	public static final int POOL_NUM = 10;
	public static void main(String[] args) {
		demoCyclic(POOL_NUM);
		demoCountDown(POOL_NUM);
	}
	
	private static void demoCyclic(int POOL_NUM) {
		CyclicBarrier barrier = new CyclicBarrier(POOL_NUM);
		ExecutorService mExecutorService = Executors.newFixedThreadPool(POOL_NUM);
		for(int i = 0;i<POOL_NUM;i++) {
			final int index = i;
		mExecutorService.execute(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(1000*(new Random().nextInt(6)));
					System.out.println("第:"+index+"线程Ready！");
					barrier.await();
				} catch (InterruptedException e) {
				} catch (BrokenBarrierException e) {
					e.printStackTrace();
				}
				System.out.println("所有线程均准备完毕！");
			}
		});
		}
		mExecutorService.shutdown();
	}
	
	private static void demoCountDown(int POOL_NUM) {
		ExecutorService mExecutorService = Executors.newFixedThreadPool(POOL_NUM);
		CountDownLatch latch = new CountDownLatch(POOL_NUM);
		for(int i = 0;i<POOL_NUM;i++) {
			final int index = i;
		mExecutorService.execute(new Runnable() {
			
			@Override
			public void run() {
				try {
					latch.await();
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("第："+index+"线程启动！");
			}
		});
		}
		for(int j =0;j<POOL_NUM;j++) {
			try {
				Thread.sleep(1000);
				System.out.println("放开第："+j+"线程");
				latch.countDown();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
}
