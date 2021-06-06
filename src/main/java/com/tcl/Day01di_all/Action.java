package com.tcl.Day01di_all;

public class Action {
    /**
     * 之前控制层,需要调用业务层
     *  private UserService userService=new UserServiceImpl();
     *  现在使用spring,不需要new对象,将new对象的过程交给spring容器或工厂去管理
     *  1.第一种方法,在spring.xml文件中配置bean容器,但必须给属性生成set方法
     */
    private UserService userService;

    public void Action(){
        userService.addUser();
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
