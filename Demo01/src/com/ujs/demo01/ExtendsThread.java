package com.ujs.demo01;

public class ExtendsThread extends Thread{
		@Override
		public void run() {
			super.run();
			Thread.currentThread().setName("�̳�Thread�����߳�");
			System.out.println("ͨ���̳�Thread��ʵ���߳�:"+Thread.currentThread().getName());
		}
}
