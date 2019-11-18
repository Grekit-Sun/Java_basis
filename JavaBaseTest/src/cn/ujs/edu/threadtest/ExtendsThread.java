package cn.ujs.edu.threadtest;

public class ExtendsThread extends Thread{
		@Override
		public void run() {
			super.run();
			Thread.currentThread().setName("继承Thread来的线程");
			System.out.println("通过继承Thread类实现线程:"+Thread.currentThread().getName());
		}
		
		public static void main(String[] args) {
			ExtendsThread thread = new ExtendsThread();
			thread.start();
		}
}
