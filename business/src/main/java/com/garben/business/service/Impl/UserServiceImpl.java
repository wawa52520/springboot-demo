package com.garben.business.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.garben.business.entity.SysUser;
import com.garben.business.mapper.UserMapper;
import com.garben.business.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, SysUser> implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public SysUser findUserById(int id) {
        return userMapper.findUserById(id);
    }

    @Override
    public String findPasswordByUserName(String userName) {
        return userMapper.findpasswordByUserName(userName);
    }
}
