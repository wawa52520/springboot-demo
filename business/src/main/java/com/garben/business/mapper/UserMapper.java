package com.garben.business.mapper;
import com.garben.business.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User findUserById(int id);

    String findpasswordByUserName(String userName);
}
