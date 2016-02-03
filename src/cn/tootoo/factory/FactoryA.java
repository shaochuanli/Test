package cn.tootoo.factory;

public class FactoryA implements Factory {

	@Override
	public Product create() {
		return new ProductA();
	}

}
