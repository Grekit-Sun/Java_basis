package com.ujs.singlemode;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * 单例模式
 * @author SUN
 * 功能：
 * 1.资源共享时，防止资源操作造成的资源损耗，如日志文件（共享），数据库的连接池设计；
 * 2.资源控制时，方便资源之间的通信，如线程池等；
 * 饿汉：“饿汉式”是在不管你用的用不上，一开始就建立这个单例对象：比如：有个单例对象；
 * 懒汉：“懒汉式”是在你真正用到的时候才去建这个单例对象；
 * 
 */
public class TestSingleMode {
	
	public static int COUNT = 0;
	
	boolean lock;
	
	public boolean isLock() {
		return lock;
	}

	public void setLock(boolean lock) {
		this.lock = lock;
	}
	

	public static void main(String[] args) {
		//创建100个线程去获取实例
		ExecutorService mExecutorService = Executors.newCachedThreadPool();
		
		final Set<String> singleSet = Collections.synchronizedSet(new HashSet<String>());
		final TestSingleMode lock = new TestSingleMode();
		lock.setLock(true);
		
		for(int i=0;i<100;i++) {
			mExecutorService.execute(new Runnable() {
				
				@Override
				public void run() {
					while(true) {
						if(!lock.isLock()) {
							COUNT++;
							SingleMode_Standard instance = SingleMode_Standard.getInstance();
							singleSet.add(instance.toString());
							break;
						}
					}
					
				}
			});
			
			try {
				Thread.sleep(5);
				lock.setLock(false);
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

	        System.out.println("------并发情况下我们取到的实例------");
			for (String instance : singleSet) {

	            System.out.println(instance+":"+COUNT);
	            
			}
		}
		
		mExecutorService.shutdown();
		
	}
}
