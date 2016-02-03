package com.chuan.blockingqueue.Priority;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

public class PriorityQueueExample {
	static Random r = new Random(47);

	public static void main(String args[]) {
		final PriorityBlockingQueue q = new PriorityBlockingQueue();
		ExecutorService se = Executors.newCachedThreadPool();
		// execute producer
		se.execute(new Runnable() {
			public void run() {
				int i = 0;
				while (true) {
					q.put(new PriorityEntity(r.nextInt(10), i++));
					try {
						TimeUnit.MILLISECONDS.sleep(r.nextInt(1000));
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});

		// execute consumer
		se.execute(new Runnable() {
			public void run() {
				while (true) {
					try {
						System.out.println("take-- " + q.take() + " left:-- ["
								+ q.toString() + "]");
						try {
							TimeUnit.MILLISECONDS.sleep(r.nextInt(1000));
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("shutdown");
	}
}
