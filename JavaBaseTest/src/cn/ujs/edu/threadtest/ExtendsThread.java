package cn.ujs.edu.threadtest;

public class ExtendsThread extends Thread{
		@Override
		public void run() {
			super.run();
			Thread.currentThread().setName("�̳�Thread�����߳�");
			System.out.println("ͨ���̳�Thread��ʵ���߳�:"+Thread.currentThread().getName());
		}
		
		public static void main(String[] args) {
			ExtendsThread thread = new ExtendsThread();
			thread.start();
		}
}
