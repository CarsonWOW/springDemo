package com.tcl.Aop_Anno;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 切面类
 */
@Component
@Aspect
public class MyAspect {
    /**
     * 前置通知
     */
    @Before("execution(* com.tcl.Aop_Anno.UserSerivceImpl.*(..))")
    public void Before(JoinPoint joinPoint){
        System.out.println("前置通知");
    }

    /**
     * 声明一个公共切入点
     */
    @Pointcut("execution(* com.tcl.Aop_Anno.*.*(..))")
    public void All(){
    }
    //后置通知
    @AfterReturning(value = "All()",returning ="obj" )
    public void AfterReturning(JoinPoint joinPoint,Object obj){
        System.out.println("后置通知:方法名为"+joinPoint.getSignature().getName()+"返回值是"+obj);
    }
    //环绕通知
    @Around(value = "All()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("执行前");
        Object obj= joinPoint.proceed();
        System.out.println("执行后");
        return obj;
    }
    //异常通知
    @AfterThrowing(value = "All()",throwing = "e")
    public void AfterThrowing(JoinPoint joinPoint,Throwable e){
        System.out.println("异常通知名为"+e.getMessage());
    }
    //最终通知,不管什么情况都会执行的通知
    @After(value = "All()")
    public void After(){
        System.out.println("最终通知");
    }
}
