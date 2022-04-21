package com.zjandfs.test;/*
  @Classname Test
  @Description TODO 使用反射获取有参/无参构造函数
  @Date 2022/4/21 15:47
  @Created by mlf02
 */

import com.zjandfs.bean.UserBean;

import java.lang.reflect.Constructor;

public class Test {


    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("com.zjandfs.bean.UserBean");
            Constructor<?> constructor =  aClass.getConstructor(String.class, int.class,int.class);
            UserBean userbean = (UserBean) constructor.newInstance("zs", 20, 20);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
