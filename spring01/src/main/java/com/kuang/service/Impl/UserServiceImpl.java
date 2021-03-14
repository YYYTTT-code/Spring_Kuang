package com.kuang.service.Impl;

import com.kuang.dao.UserDao;
import com.kuang.service.UserService;

public class UserServiceImpl implements UserService {
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {
    }

    public void getUser() {
        System.out.println(userDao.getUser());
    }
}
