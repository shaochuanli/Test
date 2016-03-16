package com.chuan.sigleton;

/**
 * （懒汉，线程不安全） 这种写法lazy loading很明显，但是致命的是在多线程不能正常工作。
 * 
 * @author chuan
 *
 */
public class Singleton1 {
	private Singleton1() {
	}

	private static Singleton1 instance = null;

	public static Singleton1 getInstance() {
		if (instance == null) {
			instance = new Singleton1();
		}
		return instance;
	}
}
