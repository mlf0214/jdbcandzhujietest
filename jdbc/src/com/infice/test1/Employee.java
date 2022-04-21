package com.infice.test1;/*
  @Classname Employee
  @Description TODO
  @Date 2022/4/21 13:45
  @Created by mlf02
 */

public class Employee {
    public Employee() {
    }
     public void doSomething(Callback callback,String event){
        String flag=null;
         System.out.println("Employee:正在做:"+event);
         //根据完成情况通知boss，即接口回调
         System.out.println("Employee:完成了任务!");
         flag="完成";
         if (flag.equals("完成")){
             callback.yes("完成");
         }
         System.out.println("Employee:未完成了任务!");
         flag="未完成";
         if (flag.equals("未完成")){
             callback.no("未完成");
         }
     }



}
