package com.chuan.cglib.cglib1;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.CallbackFilter;

public class MyProxyFilter implements CallbackFilter {

	@Override
	public int accept(Method arg0) {
		if (!"query".equalsIgnoreCase(arg0.getName())){
			return 0; // 如果方法名称匹配，则不进行intercept拦截
		}
		return 1;
	}

}
