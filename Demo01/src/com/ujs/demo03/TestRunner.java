package com.ujs.demo03;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestRunner {
	public static final int RUNNER = 10;
	public static void main(String[] args) {
		CyclicBarrier barrier = new CyclicBarrier(RUNNER);
		ExecutorService mExecutorService = Executors.newFixedThreadPool(RUNNER);
		for(int i=0; i < RUNNER;i++) {
			mExecutorService.execute(new Runner(barrier, "Runner"+i+"ºÅ£º"));
		}
		
		mExecutorService.shutdown();
	}
}
