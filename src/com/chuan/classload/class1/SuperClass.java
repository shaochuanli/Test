package com.chuan.classload.class1;

public class SuperClass extends SSClass {
	static {
		System.out.println("SuperClass init!");
	}
	public static int value = 123;

	public SuperClass() {
		System.out.println("init SuperClass");
	}
}
