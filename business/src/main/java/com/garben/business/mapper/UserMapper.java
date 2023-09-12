package com.garben.business.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.garben.business.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<SysUser> {
    SysUser findUserById(int id);

    String findpasswordByUserName(String userName);
}
