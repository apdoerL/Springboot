package com.apdoer.springbootmybatis.com.apdoer.service;

import com.apdoer.springbootmybatis.com.apdoer.mapper.UserMapper;
import com.apdoer.springbootmybatis.com.apdoer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description userService
 * @Author apdoer
 * @Date 2019/4/1820:32
 * @Version 1.0
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUsers(){
        return userMapper.getUser();
    }

    /**
     * 事务
     */
    @Transactional
    public void insertUser() {
        userMapper.insertUser("张三","测试");
        //模拟出错
        int i = 5 / 0;
        userMapper .insertUser("李四","测试事务");
    }
}
