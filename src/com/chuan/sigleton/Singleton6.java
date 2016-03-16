package com.chuan.sigleton;

/**
 * （双重校验锁） 这个是第二种方式的升级版，俗称双重检查锁定
 * 这种方式有漏洞，代码在执行到第1个判断为null，代码读取到的instance不为null时，instance引用的对象有可能还没有完成初始化
 * 详见Singleton6Error
 * @author chuan
 *
 */
public class Singleton6 {
	private Singleton6() {
	}

	private static Singleton6 instance = null;

	public static Singleton6 getInstance() {
		if (instance == null) {
			synchronized (Singleton6.class) {
				if (instance == null) {
					instance = new Singleton6();
				}
			}
		}
		return instance;
	}
}
