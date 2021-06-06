package com.tcl.Aop;



public class UserServiceImpl implements UserService {


    @Override
    public void addUser() {
        System.out.println("Aop_addUser");
    }

    @Override
    public void updateUser() {
        System.out.println("Aop_updateUser");
    }


}
