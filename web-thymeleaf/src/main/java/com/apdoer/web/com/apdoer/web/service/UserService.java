package com.apdoer.web.com.apdoer.web.service;

import com.apdoer.web.com.apdoer.web.pojo.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author apdoer
 * @Description TODO
 * @CreateDate 2019/4/5-21:29
 * @Version 1.0
 * ===============================
 **/
@Service
public class UserService {
    public List<User> selAllUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "张三", "123", "男"));
        users.add(new User(2, "李四", "321", "女"));
        users.add(new User(3, "王五", "213", "男"));
        return users;
    }
}
