package com.chuan.extend;

public class Parent {
	protected final void parent() {
		System.out.println("parent begin");
		this.SubMethod();
		System.out.println("parent end");
	}

	protected void SubMethod() {

	}
}
