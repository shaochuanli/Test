package com.chuan.factory;

public class FactoryA implements Factory {

	@Override
	public Product create() {
		return new ProductA();
	}

}
