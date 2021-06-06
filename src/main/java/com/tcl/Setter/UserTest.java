package com.tcl.Setter;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void UserSetterTest(){
        //不要记，以后不写  1.获取spring核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("Setter.xml");
        //2.从spring容器获取对象
        User user=(User)ac.getBean("UserId");
        System.out.println(user);
    }
}
