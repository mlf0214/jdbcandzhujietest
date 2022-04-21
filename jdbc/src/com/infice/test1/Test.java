package com.infice.test1;/*
  @Classname Test
  @Description TODO
  @Date 2022/4/21 13:57
  @Created by mlf02
 */

public class Test {
    public static void main(String[] args) {
        Employee employee=new Employee();
//        Boss boss=new Boss(employee);
//        boss.doEvent("吃饭");
        employee.doSomething(new Callback() {
            @Override
            public void yes(String s) {
                System.out.println(s);
            }

            @Override
            public void no(String s) {
                System.out.println(s);
            }
        }, "睡觉");
    }

}
