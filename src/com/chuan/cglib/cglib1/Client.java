package com.chuan.cglib.cglib1;

public class Client {
	public static void main(String[] args) {

		BookServiceBean service1 = BookServiceFactory.getProxyInstance(new MyCglibProxy("boss"));
		service1.create();
		BookServiceBean service2 = BookServiceFactory.getProxyInstance(new MyCglibProxy("john"));
		service2.query();

		BookServiceBean service3 = BookServiceFactory.getAuthInstanceByFilter(new MyCglibProxy("john"));
		service3.query();
	}

}
