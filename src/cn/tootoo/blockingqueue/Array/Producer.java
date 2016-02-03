package cn.tootoo.blockingqueue.Array;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	private final BlockingQueue<Integer> queue;

	public Producer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			int i = 0;
			while (true) {
				queue.put(i);
				System.out.println(Thread.currentThread() + "生产者往队列里put:" + i++);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
