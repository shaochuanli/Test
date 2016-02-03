package com.chuan.blockingqueue.Linked;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedQueueExample {
	public static void main(String[] args) {
		try {
			BlockingQueue<String> unbounded = new LinkedBlockingQueue<String>();
			BlockingQueue<String> bounded = new LinkedBlockingQueue<String>(1024);

			bounded.put("Value");
			String value = bounded.take();
			System.out.println(value);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
