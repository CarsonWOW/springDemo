package com.tcl.Day02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    //之前必须,创建dao层对象
    //private UserDao userDao=new UserDaoImpl();
    //现在使用,Spring,将创建对象的过程,交给Spring去管理,第二方法,使用注解
    //业务层依赖Dao层
    @Autowired
    private UserDao userDao;
    @Override
    public void addUser() {
        userDao.addUser();
    }

}
