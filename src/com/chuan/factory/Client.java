package com.chuan.factory;

public class Client {
	
	public static void main(String[] args) {
		Factory faA = new FactoryA();
		Product proA = faA.create();
		proA.operate();
		
		
		Factory faB = new FactoryB();
		Product proB = faB.create();
		proB.operate();
	}
}
