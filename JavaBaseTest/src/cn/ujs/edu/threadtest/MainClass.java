package cn.ujs.edu.threadtest;
/**
 *
 * 1）Runnable提供run方法，无法通过throws抛出异常，所有CheckedException必须在run方法内部处理。Callable提供call方法，直接抛出Exception异常。
 * 2）Runnable的run方法无返回值，Callable的call方法提供返回值用来表示任务运行的结果
 * 3）Runnable可以作为Thread构造器的参数，通过开启新的线程来执行，也可以通过线程池来执行。而Callable只能通过线程池执行。
 */
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class MainClass {
	public static final int POOL_NUM = 10;
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//继承Thread
		ExecutorService mExecutorService = Executors.newFixedThreadPool(POOL_NUM);
		ExtendsThread mEThread = new ExtendsThread();
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
//		Callable任务通过线程池的submit方法提交。且submit方法返回Future对象，
//		通过Future的get方法可以获得具体的计算结果。而且get是个阻塞的方法，如果任务未执行完，则一直等待。
		MyCallable mCallable = new MyCallable();
		FutureTask<String> futureTask = new FutureTask<>(mCallable);
		Thread thread = new Thread(futureTask);
		thread.start();
		
		Future<String> submit = mExecutorService.submit(mCallable);
		System.out.println(submit.get());
	}
}
