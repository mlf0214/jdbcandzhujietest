package com.zjandfs.test;/*
  @Classname Test02
  @Description TODO 使用返反射给属性赋值
  @Date 2022/4/21 16:03
  @Created by mlf02
 */

import com.zjandfs.bean.UserBean;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Test02 {
    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("com.zjandfs.bean.UserBean");
            //有参函数
            Constructor<?> constructor = aClass.getConstructor();
            UserBean bean = (UserBean) constructor.newInstance();
            Field name = aClass.getDeclaredField("name");
            //给属性赋值
            name.setAccessible(true);//设置权限，可以访问设置私有属性
            name.set(bean,"马龙非");

            Field age = aClass.getDeclaredField("age");
            age.setAccessible(true);//设置权限，可以访问设置私有属性
            age.set(bean,12);
            Field id = aClass.getDeclaredField("id");
            id.setAccessible(true);
            id.set(bean,2);
            System.out.println(bean);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
