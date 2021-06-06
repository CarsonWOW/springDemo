package com.tcl.Day02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Beans001Test {
    @Test
    public void TestService(){
        //不要记，以后不写  1.获取spring核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("Beans002.xml");
        //2.从spring容器获取对象
        UserService userService =(UserService) ac.getBean("userServiceImpl");
        userService.addUser();
    }
    @Test
    public void TestAction(){
        //不要记，以后不写  1.获取spring核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("Beans002.xml");
        //2.从spring容器获取对象
        Action action =(Action) ac.getBean("action");
        action.Action();
    }
}
