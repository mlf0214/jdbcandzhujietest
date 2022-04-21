package com.codewen.pojo;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Hellotest {
    @Test
    public void say(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("main/resources/beans.xml");
        Hello hello = (Hello) context.getBean("hello");
        hello.say();
    }
}
