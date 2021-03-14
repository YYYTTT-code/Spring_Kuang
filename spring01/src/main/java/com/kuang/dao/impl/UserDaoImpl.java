package com.kuang.dao.impl;

import com.kuang.dao.UserDao;

public class UserDaoImpl implements UserDao {
    public String getUser() {
        System.out.println("到UserDao");
        return "返回值";
    }
}
