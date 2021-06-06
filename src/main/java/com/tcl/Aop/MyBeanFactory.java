package com.tcl.Aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 静态工厂
 */
public class MyBeanFactory {
    public static UserService CreatedUserService(){
        //目标类
        final UserService userService=new UserServiceImpl();
        //切面类
        final MyAspect myAspect=new MyAspect();
        //代理 1.目标类+2.切面类形成结合,Aop切面
        /**
         * 参数1:loder,类加载器,动态代理类运行时创建
         * 参数2:interfaces代理类需要实现的所有接口
         * 参数3:InvocationHandler 处理类，接口，必须进行实现
         */

        UserService userServicePoxy=(UserService)Proxy.newProxyInstance(MyBeanFactory.class.getClassLoader(),
                userService.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //执行前
                        myAspect.before();
                        //执行方法
                        Object obj= method.invoke(userService,args);
                        //执行后
                        myAspect.after();
                        return obj;
                    }

                });

        return userServicePoxy;
    }
}
