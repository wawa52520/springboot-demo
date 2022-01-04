package com.graben.springbootdemo.service;

import com.graben.springbootdemo.entity.User;

public interface UserService {
    User findUserById(int id);
}
