package com.chuan.factorysimple;

public class Client {
	public static void main(String[] args) {
		Product poA = FactoryCreate.create(1);
		poA.operate();
		Product poB = FactoryCreate.create(2);
		poB.operate();
	}
}
