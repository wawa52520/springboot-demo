package com.graben.springbootdemo.service.Impl;

import com.graben.springbootdemo.entity.User;
import com.graben.springbootdemo.mapper.UserMapper;
import com.graben.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserById(int id) {
        return userMapper.findUserById(id);
    }
}
