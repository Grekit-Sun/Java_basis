package cn.ujs.edu.threadtest;

import java.util.concurrent.Callable;

public class ImplCallable implements Callable<String>{

	@Override
	public String call() throws Exception {
		System.out.println("i am implement Callable");
		Thread.currentThread().setName("implement callable");
		return Thread.currentThread().getName();
	}

}
