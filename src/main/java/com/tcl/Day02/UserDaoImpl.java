package com.tcl.Day02;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser() {
        System.out.println("di_all");
    }
}
