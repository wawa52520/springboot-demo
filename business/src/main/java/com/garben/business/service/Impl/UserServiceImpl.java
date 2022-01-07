package com.garben.business.service.Impl;

import com.garben.business.entity.User;
import com.garben.business.mapper.UserMapper;
import com.garben.business.service.UserService;
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

    @Override
    public String findPasswordByUserName(String userName) {
        return userMapper.findpasswordByUserName(userName);
    }
}
