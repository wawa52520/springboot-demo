package com.garben.web.controller;

import com.garben.web.entity.User;
import com.garben.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUser/{id}")
    @ResponseBody
    public ModelAndView GetUser(@PathVariable int id){
        User user = userService.findUserById(id);
        ModelAndView mv = new ModelAndView();
        mv.addObject("user",user);
        mv.setViewName("/user/show.html");
        return mv;
    }
}
