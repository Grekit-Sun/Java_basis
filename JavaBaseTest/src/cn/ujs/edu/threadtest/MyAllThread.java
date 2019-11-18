package cn.ujs.edu.threadtest;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class MyAllThread {
	private static int POOL_NUM = 1;
	public static void main(String[] args) {
		ExecutorService mExecutorService = Executors.newFixedThreadPool(10);
		ExtendsThread me1 = new ExtendsThread();
		ExtendsThread me2 = new ExtendsThread();
		me1.start();
		me2.start();
		
		
		//创建实现runable接口的类的对象
		ImplementThread mIThread = new ImplementThread();
		
		//实现多线程
		Thread t1 = new Thread(mIThread,"name1");
		Thread t2 = new Thread(mIThread,"name2");
		t1.start();
		t2.start();
		mExecutorService.submit(mIThread);
		mExecutorService.submit(mIThread);
		
		for(int i=0;i<POOL_NUM;i++) {
			MyCallable myCallable = new MyCallable();
			FutureTask<String> futureTask1 = new FutureTask<String>(myCallable);
			FutureTask<String> futureTask2 = new FutureTask<String>(myCallable);
			mExecutorService.submit(futureTask1);
			mExecutorService.submit(futureTask2);
			
			try {
				Thread.sleep(100);
				System.out.println(futureTask1.get());
				System.out.println(futureTask2.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		System.out.println(mExecutorService.isShutdown()+"");
		//关闭线程池
		mExecutorService.shutdown();
		System.out.println(mExecutorService.isShutdown()+"");
	}
}
