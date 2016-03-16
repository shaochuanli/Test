package com.chuan.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Demo {
	
	String s;

	public Demo() {
		s = "default";
	}
	
	public Demo(String str) {
		s = str;
	}

	public String getStr(Integer a, String str) {
		return s + "--" + a + "--" + str;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws Exception {
		Class cls = Demo.class;
		Method method = cls.getMethod("getStr", new Class[] { Integer.class, String.class });
		Object t = method.invoke(cls.newInstance(), new Object[] {1111, "aaaa"});
		System.out.println(t);
		
		t = method.invoke(new Demo(), new Object[] { 2222, "bbbb" });
		System.out.println(t);
		
		
		Constructor cons = cls.getConstructor();
		t = method.invoke(cons.newInstance(), new Object[]{3333, "cccc"});
		System.out.println(t);
		
		
		Constructor cons2 = cls.getConstructor(String.class);
		t = method.invoke(cons2.newInstance("cons2"), new Object[]{4444, "dddd"});
		System.out.println(t);
	}
}
