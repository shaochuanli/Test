package com.chuan.jd.jd3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
	public static int num = 1;
	public static Integer status = 1;

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.submit(new Task1());
		executor.submit(new Task2());
		executor.shutdown();
	}
}
