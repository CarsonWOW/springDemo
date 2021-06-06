package com.tcl.Aop_Anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //不要记，以后不写  1.获取spring核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("AopAnno.xml");
        UserService userService=(UserService)ac.getBean("userSerivceImpl");
        userService.addUser();
        userService.deleteUser();
        userService.updateUser();
        //2.从spring容器获取对象


    }
}
