package com.tcl.Aop_Anno;

import org.springframework.stereotype.Service;

@Service
public class UserSerivceImpl implements UserService {
    @Override
    public String addUser() {
        System.out.println("addUser_AopAnn");
        return "返回值";
    }

    @Override
    public void deleteUser() {
        System.out.println("deleteUser_AopAnn");
    }

    @Override
    public void updateUser() {
        System.out.println("updateUser_AopAnn");
    }
}
