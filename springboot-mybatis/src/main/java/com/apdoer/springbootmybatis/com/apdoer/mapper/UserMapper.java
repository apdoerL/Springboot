package com.apdoer.springbootmybatis.com.apdoer.mapper;

import com.apdoer.springbootmybatis.com.apdoer.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface UserMapper {

    User getUser();

    int insertUser(@Param("username")String username,@Param("password") String password);
}
