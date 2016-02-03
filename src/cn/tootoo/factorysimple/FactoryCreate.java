package cn.tootoo.factorysimple;

public class FactoryCreate {
	public static Product po = null;
	public static Product create(int flag) {
		switch (flag) {
		case 1:
			po = new ProductA();
			break;
		case 2:
			po = new ProductB();
			break;
		default:
			break;
		}
		return po;
	}
}
