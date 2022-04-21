package com.infice.test2;/*
  @Classname Test
  @Description TODO
  @Date 2022/4/21 14:15
  @Created by mlf02
 */

public class Test {
    public static void main(String[] args) {
        XiaoHong xiaoHong=new XiaoHong();
        Xiaoming xiaoming=new Xiaoming();
        xiaoHong.setHelper(xiaoming);
        int add = xiaoHong.add(1, 3);
        System.out.println(add);
    }

}
