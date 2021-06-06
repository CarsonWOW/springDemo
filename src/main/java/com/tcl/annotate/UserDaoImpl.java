package com.tcl.annotate;


import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser() {
        System.out.println("注解依赖注入");
    }
}
