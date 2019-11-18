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
		System.out.println("���ǵڣ�"+(i+1)+"���߳�");
		}
		mExecutorServices.shutdown();
		
		ScheduledExecutorService mScheduledExecutorService = Executors.newScheduledThreadPool(5);
		mScheduledExecutorService.execute(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("mScheduledExecutorServiceֱ��ִ��");
			}
		});
//		mScheduledExecutorService.shutdown();
		mScheduledExecutorService.schedule(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("�̳߳��ӳ�ִ��");
			}
		}, 3, TimeUnit.SECONDS);
		
		mScheduledExecutorService.scheduleAtFixedRate(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("��ʱ1�룬ÿ3��ִ��һ��");
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
