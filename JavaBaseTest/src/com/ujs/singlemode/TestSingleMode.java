package com.ujs.singlemode;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * ����ģʽ
 * @author SUN
 * ���ܣ�
 * 1.��Դ����ʱ����ֹ��Դ������ɵ���Դ��ģ�����־�ļ������������ݿ�����ӳ���ƣ�
 * 2.��Դ����ʱ��������Դ֮���ͨ�ţ����̳߳صȣ�
 * ������������ʽ�����ڲ������õ��ò��ϣ�һ��ʼ�ͽ�������������󣺱��磺�и���������
 * ������������ʽ�������������õ���ʱ���ȥ�������������
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
		//����100���߳�ȥ��ȡʵ��
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

	        System.out.println("------�������������ȡ����ʵ��------");
			for (String instance : singleSet) {

	            System.out.println(instance+":"+COUNT);
	            
			}
		}
		
		mExecutorService.shutdown();
		
	}
}
