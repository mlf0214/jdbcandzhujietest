package com.zjandfs.bean;/*
  @Classname UserBean
  @Description TODO
  @Date 2022/4/21 15:45
  @Created by mlf02
 */

import com.zjandfs.zj.MyExTransactional;

public class UserBean {
   private String name;
   private int age;
   private int id;

    @Override
    public String toString() {
        return "name:"+name+";age:"+age+";id:"+id;
    }

    public UserBean(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public UserBean() {
    }
    @MyExTransactional(name = "mlf")
    public String meite(int a){
        System.out.println("meite:"+a);
        return "meite66";
    }

}
