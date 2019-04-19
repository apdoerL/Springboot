package com.apdoer.springbootmybatis.com.apdoer.controller;

import com.apdoer.springbootmybatis.com.apdoer.pojo.User;
import com.apdoer.springbootmybatis.com.apdoer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description userController
 * @Author apdoer
 * @Date 2019/4/18 20:40
 * @Version 1.0
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public User getUser(){
        User user = userService.getUsers();
        return user;
    }

    /**
     * 为了省事就不适用postmapping了,直接请求
     * @return
     */
    @RequestMapping("/insert")
    public String insert(){
        userService.insertUser();
        return "insert";
    }

}
