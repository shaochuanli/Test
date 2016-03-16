package com.chuan.factoryabstract;

public class FactoryB implements Factory {

	@Override
	public ProductA createA() {
		return new ProductA2();
	}

	@Override
	public ProductB createB() {
		return new ProductB2();
	}

}
