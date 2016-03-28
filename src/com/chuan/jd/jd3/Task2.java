package com.chuan.jd.jd3;

public class Task2 implements Runnable {

	@Override
	public void run() {
		while (Test.num < 30) {
			synchronized (Test.status) {
				if (Test.status == 2) {
					for (int i = 0; i < 3; i++) {
						System.out.println("线程2：" + Test.num++);
					}
					Test.status = 1;
				}
			}
		}
	}
}
