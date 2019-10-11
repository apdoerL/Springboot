package org.apdoer.multipledatasource.controller;

import org.apdoer.multipledatasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author apdoer
 * @version 1.0
 * @date 2019/10/11 12:21
 */
@RestController
public class DemoController {
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/db1")
    public String getUserByFromDb1(){
        return userService.getUserFromDb1();
    }

    @GetMapping("/user/db2")
    public String getUserByFromDb2(){
        return userService.getUserFromDb2();
    }
}
