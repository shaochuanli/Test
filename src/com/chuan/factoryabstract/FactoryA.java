package com.chuan.factoryabstract;

public class FactoryA implements Factory {

	@Override
	public ProductA createA() {
		return new ProductA1();
	}

	@Override
	public ProductB createB() {
		return new ProductB1();
	}

}
