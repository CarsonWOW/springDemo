package com.tcl.Aop;

/**
 * 切面类
 */
public class MyAspect {
    public void before(){
        System.out.println("执行前");
    }
    public void after(){
        System.out.println("执行后");
    }
}
