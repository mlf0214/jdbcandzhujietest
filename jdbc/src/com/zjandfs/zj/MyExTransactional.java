package com.zjandfs.zj;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//第一个自定义注解
@Target({ElementType.METHOD, ElementType.TYPE,ElementType.FIELD})//设置使用范围，方法上，类上，属性上
@Retention(RetentionPolicy.RUNTIME)
public @interface MyExTransactional {
    String name();
}
