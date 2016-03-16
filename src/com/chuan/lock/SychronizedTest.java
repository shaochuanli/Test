package com.chuan.lock;

public class SychronizedTest implements Runnable {
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + "synchronized loop " + i);
			}
		}
	}

	public static void main(String[] args) {
		SychronizedTest t1 = new SychronizedTest();
		Thread ta = new Thread(t1, "A");
		Thread tb = new Thread(t1, "B");

		ta.start();
		tb.start();
	}
}
