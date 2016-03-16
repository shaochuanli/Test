 package com.chuan.jd.jd3;

public class Thread1 extends Thread {

	@Override
	public void run() {
		while (Test.NUM <= 30) {
			synchronized (Test.sychoner) {
				if (Test.executor == 1) {
					for (int i = 0; i < 3; i++) {
						System.out.println("线程1：" + Test.NUM);
						Test.NUM++;
					}
					Test.executor = 2;
				}

				Test.sychoner.notify();
				try {
					Test.sychoner.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (Test.NUM > 30) {
					Test.sychoner.notify();
				}
			}
		}
	}
}
