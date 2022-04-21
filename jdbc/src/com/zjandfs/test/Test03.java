package com.zjandfs.test;/*
  @Classname Test03
  @Description TODO 使用反射调用方法
  @Date 2022/4/21 16:26
  @Created by mlf02
 */

import com.zjandfs.bean.UserBean;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Method;

public class Test03 {
    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("com.zjandfs.bean.UserBean");
            Method meite = aClass.getDeclaredMethod("meite",int.class);
            Transactional declaredAnnotation = meite.getDeclaredAnnotation(Transactional.class);
            System.out.println(declaredAnnotation);
            UserBean userbean = (UserBean) aClass.newInstance();
            meite.invoke(userbean,666);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
