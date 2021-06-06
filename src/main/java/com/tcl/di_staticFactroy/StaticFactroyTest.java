package com.tcl.di_staticFactroy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StaticFactroyTest {
    @Test
    public void FactroyTest () {
        //不要记，以后不写  1.获取spring核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("StaticFactory.xml");
        //2.从spring容器获取对象
        //以前的写法
        //UserService userService=MyStaticFactory.方法名
        //userSerivce.addUser();
        //使用了spring,静态工厂
        UserService userService=(UserService)ac.getBean("StaticFactroyId");
        userService.addUser();
        userService.deleteUser();


    }
}
