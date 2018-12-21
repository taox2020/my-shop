package com.tx.my.shop.login.service.impl;

import com.tx.my.shop.login.commons.utils.SpringContext;
import com.tx.my.shop.login.dao.UserDao;
import com.tx.my.shop.login.entity.User;
import com.tx.my.shop.login.service.UserService;

public class UserServiceImpl implements UserService {
    SpringContext context = new SpringContext();
    UserDao userDao = (UserDao) context.getBean("userDao");

    public User login(String email, String password) {
        return userDao.getUserByEmailAndPassword(email,password);
    }
}
