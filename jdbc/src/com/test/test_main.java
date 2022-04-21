package com.test;/*
  @Classname test_main
  @Description TODO
  @Date 2022/4/20 20:07
  @Created by mlf02
 */

public class test_main {
    public static void main(String[] args) {
        test_infine test_infine=new test_infine();
        test_infine.add();
        test_infine.setadd(new myinfine() {
            @Override
            public void add() {

            }
        });
    }

}
