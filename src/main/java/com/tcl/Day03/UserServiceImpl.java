package com.tcl.Day03;
public class UserServiceImpl implements UserService {

    @Override
    public void addUser() {
        System.out.println("添加用户a_ioc");
    }

    @Override
    public void deleteUser() {
        System.out.println("删除用户a_ioc");
    }
}
