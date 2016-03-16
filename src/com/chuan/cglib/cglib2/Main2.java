package com.chuan.cglib.cglib2;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.CallbackFilter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import net.sf.cglib.proxy.NoOp;

public class Main2 {
	public static void main(String[] args) {
		Callback[] callbacks = new Callback[] { new MethodInterceptorImpl(), NoOp.INSTANCE };

		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(MyClass.class);
		enhancer.setCallbacks(callbacks);
		enhancer.setCallbackFilter(new CallbackFilterImpl());
		MyClass my = (MyClass) enhancer.create();

		my.method();
		my.method2();
	}

	private static class CallbackFilterImpl implements CallbackFilter {
		public int accept(Method method) {
			if (method.getName().equals("method2")) {
				return 1; //符合filter条件，则不走intercept拦截
			} else {
				return 0;
			}
		}
	}

	private static class MethodInterceptorImpl implements MethodInterceptor {
		public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
			System.out.println("拦截："+method);
			return proxy.invokeSuper(obj, args);
		}
	}
}
