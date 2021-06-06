package com.tcl.MyFactory;

/**
 * 实例工厂类
 */
public class MyFactory {
    /**
     * 所有方法都不是静态方法
     */
    public UserService CreatedUserService(){
        return new UserServiceImpl();
    }
}
