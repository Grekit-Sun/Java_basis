package cn.ujs.edu.threadtest;

public class ExtendThread extends Thread{
	@Override
	public void run() {
		super.run();
		System.out.println("l am extended Thread");
		Thread.currentThread().setName("extended Thread");
	}
}
