package com.chuan.annotation;

import java.lang.reflect.Method;

/**
 * 使用注解和解析注解
 * 
 * @creator xiaoyu.wang
 * @create-time 2011-8-12 下午03:49:17
 * @revision $Id
 */
public class Test {
	/**
	 * 被注释的三个方法
	 */
	@AnnotationTest(id = 1, description = "hello method1")
	public void method1() {
	}

	@AnnotationTest(id = 2)
	public void method2() {
	}

	@AnnotationTest(id = 3, description = "last method3")
	/**
	 * 解析注释，将Test_1类所有被注解方法的信息打印出来
	 * @param args
	 */
	public static void main(String[] args) {
		Method[] methods = Test.class.getDeclaredMethods();
		for (Method method : methods) {
			// 判断方法中是否有指定注解类型的注解
			boolean hasAnnotation = method.isAnnotationPresent(AnnotationTest.class);
			if (hasAnnotation) {
				// 根据注解类型返回方法的指定类型注解
				AnnotationTest annotation = method.getAnnotation(AnnotationTest.class);
				System.out.println("Test(method=" + method.getName() + ",id=" + annotation.id() + ",description=" + annotation.description() + ")");
			}
		}
	}
}