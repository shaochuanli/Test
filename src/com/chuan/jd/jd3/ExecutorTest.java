package com.chuan.jd.jd3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTest {
	private static int i = 0;
	private static final int PRINT_COUNT = 3;
	private static final int CYCLE_COUNT = 50;
	private static Object synchronizer = new Object();

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.execute(new Runnable() {
			public void run() {
				int j = 0;
				synchronized (synchronizer) {
					while (i++ < CYCLE_COUNT) {
						if (j++ < PRINT_COUNT) {
							System.out.println("线程1:" + i);
							if (j == PRINT_COUNT) {
								System.out.println();
							}
						} else {
							i--;
							j = 0;
							synchronizer.notify();
							try {
								// Thread.sleep(1000);
								synchronizer.wait();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
					if (i >= CYCLE_COUNT) {
						synchronizer.notify(); // 唤醒最后处于等待状态的线程
					}
				}
			}
		});
		service.execute(new Runnable() {
			public void run() {
				synchronized (synchronizer) {
					int j = 0;
					while (i++ < CYCLE_COUNT) {
						if (j++ < PRINT_COUNT) {
							System.out.println("线程2:" + i);
							if (j == PRINT_COUNT) {
								System.out.println();
							}
						} else {
							i--;
							j = 0;
							synchronizer.notify();
							try {
								// Thread.sleep(1000);
								synchronizer.wait();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
					if (i >= CYCLE_COUNT) {
						synchronizer.notify(); // 唤醒最后处于等待状态的线程
					}
				}
			}
		});
		service.shutdown();
	}
}