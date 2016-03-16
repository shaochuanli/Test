package com.chuan.cglib.cglib1;

public class BookServiceFactory {

	public static BookServiceBean getProxyInstance(MyCglibProxy myProxy) {
		return (BookServiceBean) myProxy.getDaoBean(BookServiceBean.class);
	}

	public static BookServiceBean getAuthInstanceByFilter(MyCglibProxy myProxy) {
		return (BookServiceBean) myProxy.getDaoBeanByFilter(BookServiceBean.class);
	}
}
