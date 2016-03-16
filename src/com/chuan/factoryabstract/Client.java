package com.chuan.factoryabstract;

public class Client {

	public static void main(String[] args) {
		Factory faA = new FactoryA();
		ProductA a1 = faA.createA();
		ProductB b1 = faA.createB();
		a1.operate();
		b1.opertate();
		
		Factory faB = new FactoryB();
		ProductA a2 = faB.createA();
		ProductB b2 = faB.createB();
		a2.operate();
		b2.opertate();
	}
}
