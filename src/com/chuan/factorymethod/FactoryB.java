package com.chuan.factorymethod;

public class FactoryB implements Factory {

	@Override
	public Product create() {
		return new ProductB();
	}

}
