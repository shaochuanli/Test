package com.chuan.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest2 {

	static CyclicBarrier c = new CyclicBarrier(2, new A());
	
	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					System.out.println("1:before");
					c.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (BrokenBarrierException e) {
					e.printStackTrace();
				}
				System.out.println("1:after");
			}
		}).start();
		
		try {
			System.out.println("2:before");
			c.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
		System.out.println("2:after");
	}
	
	static class A implements Runnable{
		@Override
		public void run() {
			System.out.println(3);
		}
	}
}
