package com.tcl.Day01di_all;

public class UserServiceImpl implements UserService {
    //之前必须,创建dao层对象
    //private UserDao userDao=new UserDaoImpl();
    //现在使用,Spring,将创建对象的过程,交给Spring去管理,第一种方法,在beans里面配置
    //业务层依赖Dao层
    private UserDao userDao;
    @Override
    public void addUser() {
        userDao.addUser();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
