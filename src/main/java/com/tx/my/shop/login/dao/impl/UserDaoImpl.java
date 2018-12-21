package com.tx.my.shop.login.dao.impl;

import com.tx.my.shop.login.dao.UserDao;
import com.tx.my.shop.login.entity.User;

public class UserDaoImpl implements UserDao {
    public User getUserByEmailAndPassword(String email, String password) {
        User user = null;
        if ("admin@qq.com".equals(email)){
            if("admin".equals(password)){
                user = new User();
                user.setEmail(email);
                user.setUsername("admin");
            }
        }
        return user;
    }
}
