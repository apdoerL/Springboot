package com.apdoer.web.com.apdoer.web.controller;

import com.apdoer.web.com.apdoer.web.pojo.User;
import com.apdoer.web.com.apdoer.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *@Description TODO
 *@author apdoer
 *@CreateDate 2019/4/5-21:29
 *@Version 1.0
 *===============================
**/
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/show")
    public String showUsers(Model model){
        List<User>users = userService.selAllUsers();
        model.addAttribute("users",users);
        return "index";
    }



    @GetMapping("/map")
    public String map(Model model){
        Map<String,Object> map = new HashMap<>();
        map.put("1",new User(4,"孙行者","123","男"));
        map.put("2",new User(5,"者行孙","123","男"));
        map.put("3",new User(6,"行者孙","123","女"));
        model.addAttribute("map",map);
        return "index";
    }



    @GetMapping("/")
    @ResponseBody
    public String hello(){
        return "hello";
    }
}
