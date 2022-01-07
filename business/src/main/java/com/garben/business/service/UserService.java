package com.garben.business.service;

import com.garben.business.entity.User;

public interface UserService {
    User findUserById(int id);

    String findPasswordByUserName(String userName);
}
