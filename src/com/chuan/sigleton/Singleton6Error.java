package com.chuan.sigleton;

public class Singleton6Error {

	private int i = 0;

	private Singleton6Error() {
	}

	private static Singleton6Error instance;

	public static Singleton6Error getInstance() {
		if (instance == null) {
			synchronized (Singleton6Error.class) {
				if (instance == null) {
					System.out.println("--------初始化开始---------");
					instance = new Singleton6Error();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					instance.i = 10;
					System.out.println(instance + "--------初始化完成---------" + instance.i);
				}
			}
		}
		return instance;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 50; i++) {
			new Thread(new Runnable() {
				public void run() {
					System.out.println(Singleton6Error.getInstance().i);
				}
			}).start();
		}
	}
}