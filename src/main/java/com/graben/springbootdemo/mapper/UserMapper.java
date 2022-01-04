package com.graben.springbootdemo.mapper;

import com.graben.springbootdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User findUserById(int id);
}
