package com.garben.web.controller;

import com.garben.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUser/{id}")
    @ResponseBody
    public String GetUser(@PathVariable int id){
        return userService.findUserById(id).toString();
    }
}
