package com.tcl.Day02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
@Controller
public class Action {
    /**
     * 之前控制层,需要调用业务层
     *  private UserService userService=new UserServiceImpl();
     *  现在使用spring,不需要new对象,将new对象的过程交给spring容器或工厂去管理
     *  1.第二种方法,使用注解
     */
        //依赖注入注解
            @Autowired
    private UserService userService;
    public void Action(){
        userService.addUser();
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
