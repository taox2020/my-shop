package com.tx.my.shop.login.dao;

import com.tx.my.shop.login.entity.User;

public interface UserDao {
    public User getUserByEmailAndPassword(String email, String password);
}
