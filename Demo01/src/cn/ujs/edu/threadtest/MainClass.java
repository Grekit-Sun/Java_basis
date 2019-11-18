package cn.ujs.edu.threadtest;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

import com.ujs.demo01.MyCallable;

public class MainClass {
	public static final int POOL_NUM = 10;
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//继承Thread
		ExecutorService mExecutorService = Executors.newFixedThreadPool(POOL_NUM);
		ExtendThread mEThread = new ExtendThread();
//		Object object = mExecutorService.submit(mEThread,null).get();
		
//		System.out.println(mExecutorService.isShutdown()+object.toString());
		mEThread.start();
		
		//实现runnable接口
		ImplementThread mImpRunnable = new ImplementThread();
		Future<String> mFuture = mExecutorService.submit(mImpRunnable,"实现runnable接口返回code：-1");
		String str = mFuture.get();
		System.out.println(str);
		mExecutorService.execute(mImpRunnable);
		
		
		//实现callable接口
		MyCallable mCallable = new MyCallable();
		FutureTask<String> futureTask = new FutureTask<>(mCallable);
		Thread thread = new Thread(futureTask);
		thread.start();
		
		Future<String> submit = mExecutorService.submit(mCallable);
		System.out.println(submit.get());
	}
}
