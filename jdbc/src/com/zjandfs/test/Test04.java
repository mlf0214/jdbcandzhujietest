package com.zjandfs.test;/*
  @Classname Test04
  @Description TODO 实现自定义注解
  @Date 2022/4/21 16:37
  @Created by mlf02
 */

import com.zjandfs.bean.UserBean;
import com.zjandfs.zj.MyExTransactional;

import java.lang.reflect.Method;

public class Test04 {

    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("com.zjandfs.bean.UserBean");
            UserBean userBean = (UserBean) aClass.newInstance();
            Method meite = aClass.getDeclaredMethod("meite", int.class);
            MyExTransactional declaredAnnotation = meite.getDeclaredAnnotation(MyExTransactional.class);
            System.out.println(declaredAnnotation);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
