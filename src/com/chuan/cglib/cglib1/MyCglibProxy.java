package com.chuan.cglib.cglib1;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import net.sf.cglib.proxy.NoOp;

public class MyCglibProxy implements MethodInterceptor {

	public Enhancer enhancer = new Enhancer();
	private String name;

	public MyCglibProxy(String name) {
		this.name = name;
	}

	/**
	 * 根据class对象创建该对象的代理对象 1、设置父类；2、设置回调 本质：动态创建了一个class对象的子类
	 * 如果你想用CGLIB来创建有参数的实例，用Enhancer.create(Class[],
	 * Object[])方法替代Enhancer.create()就可以了。方法中第一个参数定义了参数的类型，第
	 * 二个是参数的值。在参数中，基本类型应被转化成类的类型。
	 * 
	 * @param cls
	 * @return
	 */
	public Object getDaoBean(Class<?> cls) {
		// 进行代理
		enhancer.setSuperclass(cls);
		enhancer.setCallback(this);
		// 生成代理实例
		return enhancer.create();
	}

	public Object getDaoBeanByFilter(Class<?> cls) {
		enhancer.setSuperclass(cls);
		enhancer.setCallbacks(new Callback[] { this, NoOp.INSTANCE });
		enhancer.setCallbackFilter(new MyProxyFilter());
		return enhancer.create();
	}

	@Override
	public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		System.out.print("调用的方法是：" + method.getName() + "---");
		// 用户进行判断
		if (!"boss".equals(name)) {
			System.out.println(name + "你没有权限！");
			return null;
		}
		Object result = methodProxy.invokeSuper(object, args);

		return result;
	}

}
