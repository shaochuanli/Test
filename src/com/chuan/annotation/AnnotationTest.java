package com.chuan.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**   
*  定义注解Test
*  注解中含有两个元素 id 和 description
*  description元素有默认值"no description"  
*   @create-time     2011-8-12   下午02:22:28   
*   @revision          $Id
*/
 
//表示注解可以被使用于方法上
@Target(ElementType.METHOD)
//VM将在运行期也保留注释，因此可以通过反射机制读取注解的信息
@Retention(RetentionPolicy.RUNTIME)
//将此注解包含在javadoc中
@Documented
//允许子类继承父类中的注解
@Inherited
public @interface AnnotationTest { 
    public int id();
    public String description() default "no description"; // 表示我的注解需要一个参数 名为"description" 默认值为"no description"
}