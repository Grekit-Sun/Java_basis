package cn.ujs.edu.threadtest;

public class ImplementThread implements Runnable{

	@Override
	public void run() {
		System.out.println("i am the implement Runnable");
		Thread.currentThread().setName("implement Runnable");
	}

}
