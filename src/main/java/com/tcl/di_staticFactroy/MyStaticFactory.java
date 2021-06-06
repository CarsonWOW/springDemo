package com.tcl.di_staticFactroy;

public  class MyStaticFactory {
    /**
     * 静态工厂,创建一个以接口为对象的方法,返回实现类
     * 静态工厂,用于生成实例对象,所有方法都必须是静态方法
     * @return
     */
    private static UserService CreateUserService(){
        return new UserServiceImpl();
    }
}
