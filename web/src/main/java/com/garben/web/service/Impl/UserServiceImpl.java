package com.garben.web.service.Impl;

import com.garben.web.entity.User;
import com.garben.web.mapper.UserMapper;

import com.garben.web.service.UserService;
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
