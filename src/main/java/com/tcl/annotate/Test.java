package com.tcl.annotate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void TestService(){
        //不要记，以后不写  1.获取spring核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("Anno.xml");
        //2.从spring容器获取对象
        UserService userService=(UserService)ac.getBean("ServiceId");
        userService.addUser();
    }
    @org.junit.Test
    public void TestAction(){
        //不要记，以后不写  1.获取spring核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("Anno.xml");
        //2.从spring容器获取对象
        Action action=(Action)ac.getBean("action1");
        action.Action();
    }
}
