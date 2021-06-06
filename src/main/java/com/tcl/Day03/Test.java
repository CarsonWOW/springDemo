package com.tcl.Day03;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void TestService(){
        //不要记，以后不写  1.获取spring核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("Beans003.xml");
        //2.从spring容器获取对象
        UserService userService=(UserService)ac.getBean("ServiceId");
        userService.addUser();
        userService.deleteUser();

    }
}
