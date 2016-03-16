package com.chuan.test;

import java.util.concurrent.ConcurrentHashMap;


public class Test extends Thread{
	
	ConcurrentHashMap c = new ConcurrentHashMap();
	private int threadNo;
	private String lock;

	public Test(int threadNo, String lock) {
		this.threadNo = threadNo;
		this.lock = lock;
	}

	public static void main(String[] args) throws Exception {
		for (int i = 1; i < 10; i++) {
			new Test(i, "lock").start();
			Thread.sleep(1);
		}
	}

	@Override
	public void run() {
		//synchronized (lock) {
			for (int i = 1; i < 10000; i++) {
				System.out.println("No." + threadNo + ":" + i);
			}
		//}
	}
}
