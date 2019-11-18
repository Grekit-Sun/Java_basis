package com.ujs.demo02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MyThreadPool {
	public static void main(String[] args) {
		ExecutorService mExecutorServices = Executors.newCachedThreadPool();
		for(int i=0; i<20;i++ ) {
		mExecutorServices.execute(new Runnable() {
			@Override
			public void run() {
				
			}
		});
		System.out.println("这是第："+(i+1)+"个线程");
		}
		mExecutorServices.shutdown();
		
		ScheduledExecutorService mScheduledExecutorService = Executors.newScheduledThreadPool(5);
		mScheduledExecutorService.execute(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("mScheduledExecutorService直接执行");
			}
		});
//		mScheduledExecutorService.shutdown();
		mScheduledExecutorService.schedule(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("线程池延迟执行");
			}
		}, 3, TimeUnit.SECONDS);
		
		mScheduledExecutorService.scheduleAtFixedRate(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("延时1秒，每3秒执行一次");
			}
		}, 1,3,TimeUnit.SECONDS );
		mScheduledExecutorService.shutdownNow();
		ExecutorService mSingleThreadExecutor = Executors.newSingleThreadExecutor();
		for(int i=0 ;i<100;i++) {
			final int index = i;
		mSingleThreadExecutor.execute(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(2*1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(index);
			}
		});
		}
	}
}
