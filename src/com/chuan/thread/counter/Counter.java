package com.chuan.thread.counter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
	private volatile int i = 0;

	private AtomicInteger atomicI = new AtomicInteger(0);

	/**
	 * 非线程安全计数器
	 */
	private void count() {
		i++;
	}

	/**
	 * 线程安全计数器
	 */
	private void safeCount() {
		while (true) {
			int i = atomicI.get();
			boolean suc = atomicI.compareAndSet(i, i + 1);
			if (suc) {
				break;
			}
		}
		// 使用compareAndSet可以预防ABA问题

		// atomicI.getAndIncrement();
		// atomicI.addAndGet(1);
	}

	public static void main(String[] args) {
		final Counter cas = new Counter();
		List<Thread> ts = new ArrayList<Thread>(100);
		long start = System.currentTimeMillis();
		for (int j = 0; j < 100; j++) {
			Thread t = new Thread(new Runnable() {
				@Override
				public void run() {
					for (int i = 0; i < 10000; i++) {
						cas.count();
						cas.safeCount();
					}
				}
			});
			ts.add(t);
		}
		for (Thread thread : ts) {
			thread.start();
		}
		for (Thread thread : ts) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(cas.i);
		System.out.println(cas.atomicI.get());
		System.out.println("运行时间：" + (System.currentTimeMillis() - start));
	}

}
