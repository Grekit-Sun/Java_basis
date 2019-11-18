package com.ujs.demo04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/*问题：https://baijiahao.baidu.com/s?id=1579593311241280382&wfr=spider&for=pc
 * 
 * 解答：https://blog.csdn.net/xiongyouqiang/article/details/77882385
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
		//若当期依然有子线程没有执行完毕
      while(Thread.activeCount() > 1){
            Thread.yield();//使得当前线程（主线程）让出CPU时间片
      }
        
		System.out.println("运行结果:Counter.count=" + COUNT);
	}
}
