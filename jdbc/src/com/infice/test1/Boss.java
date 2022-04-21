package com.infice.test1;/*
  @Classname Boss
  @Description TODO
  @Date 2022/4/21 13:44
  @Created by mlf02
 */

public class Boss implements Callback{
    private Employee employee;

    public Boss(Employee employee) {
        this.employee = employee;
    }
    //告诉员工要做什么事情
    public void doEvent(String event){
        System.out.println("BOSS"+event);
        //当前对象传递给员工，员工才可以回调
        employee.doSomething(null,event);
    }

    @Override
    public void yes(String s) {
        s="hhhhhhhhhh";
//        System.out.println(s);
    }

    @Override
    public void no(String s) {
        s="6666666666666";
//        System.out.println(s);
    }

}
