package com.chuan.jd.jd3;

public class Test {
	public static Integer NUM = 1;
	public static Integer executor = 1;
	public static Object sychoner = new Object();

	public static void main(String[] args) {
		new Thread3().start();
		new Thread2().start();
		new Thread1().start();
	}
}
