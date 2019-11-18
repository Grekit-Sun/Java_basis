package com.ujs.demo04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/*���⣺https://baijiahao.baidu.com/s?id=1579593311241280382&wfr=spider&for=pc
 * 
 * ���https://blog.csdn.net/xiongyouqiang/article/details/77882385
 * 
 * */
public class Demo01 {
	public static int COUNT = 0;
//	public static AtomicInteger COUNT = new AtomicInteger();
//	public Lock lock = new ReentrantLock();
	public void inc() {
		try {
			Thread.sleep(1);
//			System.out.println("1");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized(this) {
			COUNT++;
		}
	}
	
	public static void main(String[] args) {
		ExecutorService mExecutorService = Executors.newCachedThreadPool();
		for(int i = 0;i<1000;i++) {
		mExecutorService.execute(new Runnable() {
			@Override
			public void run() {
				Demo01 demo01 = new Demo01();
				demo01.inc();
			}
		});
		}
		mExecutorService.shutdown();
		//��������Ȼ�����߳�û��ִ�����
      while(Thread.activeCount() > 1){
            Thread.yield();//ʹ�õ�ǰ�̣߳����̣߳��ó�CPUʱ��Ƭ
      }
        
		System.out.println("���н��:Counter.count=" + COUNT);
	}
}
