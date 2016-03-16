package com.chuan.string;

public class TestString3 {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}

	public static void test1() {
		String a = "hello2";
		String b = "hello" + 2;
		System.out.println((a == b));
	}

	public static void test2() {
		String a = "hello2";
		String b = "hello";
		String c = b + 2;
		System.out.println((a == c));
	}

	public static void test3() {
		String a = "hello2";
		final String b = "hello";
		String c = b + 2;
		System.out.println((a == c));

	}
}
