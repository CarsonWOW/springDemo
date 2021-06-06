package com.tcl.Aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void TestAop(){
        //不要记，以后不写  1.获取spring核心容器对象
        //2.从spring容器获取对象
        UserService userService=MyBeanFactory.CreatedUserService();
        userService.addUser();
        userService.updateUser();

    }
}
