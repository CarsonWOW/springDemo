package com.tcl.MyFactory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryTest {
    @Test
    public void TestFactory() {
        //不要记，以后不写  1.获取spring核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("Factroy.xml");
        //2.从spring容器获取对象
        UserService userService=(UserService)ac.getBean("ServiceId");
        UserService userService1=(UserService)ac.getBean("ServiceId");
        System.out.println(userService);
        System.out.println(userService1);
        userService.addUser();
        userService.deleteUser();
    }
}
