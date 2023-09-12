package com.garben.web.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.garben.business.entity.SysUser;
import com.garben.business.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private UserService userService;

    @RequestMapping("/testUser")
    public String getUser(@RequestParam String userName){
        QueryWrapper<SysUser> wrapper = new QueryWrapper<>();
        Map<String, Object> map = new HashMap<>();
        map.put("user_name", userName);
        wrapper.allEq(map);
        List<SysUser> list = userService.list(wrapper);
        return list.toString();
    }

    @RequestMapping("/testUserForEntity")
    public String getUser(@RequestBody SysUser sysUser){
        QueryWrapper<SysUser> wrapper = new QueryWrapper<>(sysUser);
        List<SysUser> list = userService.list(wrapper);
        return list.toString();
    }


}
