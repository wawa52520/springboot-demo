package com.garben.business.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.garben.business.entity.SysUser;

public interface UserService extends IService<SysUser> {
    SysUser findUserById(int id);

    String findPasswordByUserName(String userName);
}
