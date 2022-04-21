package com.zhujie;/*
  @Classname Test01
  @Description TODO
  @Date 2022/4/21 14:59
  @Created by mlf02
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Test01 {
    @MyAnnot01(age = 12,name = "hhhh",aihao = {"跑步","跑步","跑步","跑步"})
    public void test(){

    }

}
@Target(value={ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnot01{
    String name() default "aaa";
    int age();
    String[] aihao();
}
