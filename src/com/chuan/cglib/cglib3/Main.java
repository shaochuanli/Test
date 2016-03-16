package com.chuan.cglib.cglib3;

import net.sf.cglib.proxy.Mixin;

public class Main {
	public static void main(String[] args) {
		Class<?>[] interfaces = new Class[] { MyInterfaceA.class, MyInterfaceB.class };
		Object[] delegates = new Object[] { new MyInterfaceAImpl(), new MyInterfaceBImpl() };
		Object obj = Mixin.create(interfaces, delegates);
		MyInterfaceA myA = (MyInterfaceA) obj;
		myA.methodA();
		MyInterfaceB myB = (MyInterfaceB) obj;
		myB.methodB();
	}
}
