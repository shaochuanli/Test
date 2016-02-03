package com.chuan.blockingqueue.delay;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;

public class DelayQueueExample {
	public static void main(String[] args) {
		try {
			BlockingQueue<Delayed> delayQueue = new DelayQueue<Delayed>();
			DelayedElement element1 = new DelayedElement(5000);
			DelayedElement element2 = new DelayedElement(3000);

			delayQueue.put(element1);
			delayQueue.put(element2);

			while (true) {
				System.out.println("获取并移除此队列的头(到期的) :" + delayQueue.poll());
				System.out.println("获取但不移除此队列的头部 :" + delayQueue.peek());
				Thread.sleep(500);

			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
