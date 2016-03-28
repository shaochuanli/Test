package com.chuan.jd.jd3;

public class Task1 implements Runnable {

	@Override
	public void run() {
		while (Test.num < 30) {
			synchronized (Test.status) {
				if (Test.status == 1) {
					for (int i = 0; i < 3; i++) {
						System.out.println("线程1：" + Test.num++);
					}
					Test.status = 2;
				}
			}
		}
	}
}
