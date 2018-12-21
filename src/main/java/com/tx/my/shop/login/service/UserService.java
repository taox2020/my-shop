package com.tx.my.shop.login.service;

import com.tx.my.shop.login.entity.User;

public interface UserService {
    public User login (String email,String password);
}
