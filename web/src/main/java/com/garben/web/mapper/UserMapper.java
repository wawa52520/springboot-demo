package com.garben.web.mapper;

import com.garben.web.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User findUserById(int id);
}
