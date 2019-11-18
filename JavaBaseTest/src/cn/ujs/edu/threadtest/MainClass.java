package cn.ujs.edu.threadtest;
/**
 *
 * 1��Runnable�ṩrun�������޷�ͨ��throws�׳��쳣������CheckedException������run�����ڲ�����Callable�ṩcall������ֱ���׳�Exception�쳣��
 * 2��Runnable��run�����޷���ֵ��Callable��call�����ṩ����ֵ������ʾ�������еĽ��
 * 3��Runnable������ΪThread�������Ĳ�����ͨ�������µ��߳���ִ�У�Ҳ����ͨ���̳߳���ִ�С���Callableֻ��ͨ���̳߳�ִ�С�
 */
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class MainClass {
	public static final int POOL_NUM = 10;
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//�̳�Thread
		ExecutorService mExecutorService = Executors.newFixedThreadPool(POOL_NUM);
		ExtendsThread mEThread = new ExtendsThread();
//		Object object = mExecutorService.submit(mEThread,null).get();
		
//		System.out.println(mExecutorService.isShutdown()+object.toString());
		mEThread.start();
		
		//ʵ��runnable�ӿ�
		ImplementThread mImpRunnable = new ImplementThread();
		Future<String> mFuture = mExecutorService.submit(mImpRunnable,"ʵ��runnable�ӿڷ���code��-1");
		String str = mFuture.get();
		System.out.println(str);
		mExecutorService.execute(mImpRunnable);
		
		
		//ʵ��callable�ӿ�
//		Callable����ͨ���̳߳ص�submit�����ύ����submit��������Future����
//		ͨ��Future��get�������Ի�þ���ļ�����������get�Ǹ������ķ������������δִ���꣬��һֱ�ȴ���
		MyCallable mCallable = new MyCallable();
		FutureTask<String> futureTask = new FutureTask<>(mCallable);
		Thread thread = new Thread(futureTask);
		thread.start();
		
		Future<String> submit = mExecutorService.submit(mCallable);
		System.out.println(submit.get());
	}
}
