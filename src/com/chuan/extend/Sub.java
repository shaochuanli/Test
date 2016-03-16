package com.chuan.extend;

public class Sub extends Parent {
	
	@Override
	protected void SubMethod() {
		System.out.println("sub");
	}

	public static void main(String[] args) {
		Sub s = new Sub();
		s.parent();
	}
}
