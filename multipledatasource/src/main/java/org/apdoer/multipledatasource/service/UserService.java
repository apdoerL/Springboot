package org.apdoer.multipledatasource.service;

import org.apdoer.multipledatasource.mapper.db1.Db1UserMapper;
import org.apdoer.multipledatasource.mapper.db2.Db2UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author apdoer
 * @version 1.0
 * @date 2019/10/11 12:22
 */
@Service
public class UserService {
    private Db1UserMapper db1UserMapper;
    private Db2UserMapper db2UserMapper;


    @Autowired
    @SuppressWarnings("all")
    public void setDb1UserMapper(Db1UserMapper db1UserMapper) {
        this.db1UserMapper = db1UserMapper;
    }

    @Autowired
    @SuppressWarnings("all")
    public void setDb2UserMapper(Db2UserMapper db2UserMapper) {
        this.db2UserMapper = db2UserMapper;
    }


    public String getUserFromDb1() {
        return db1UserMapper.queryUser();
    }

    public String getUserFromDb2() {
        return db2UserMapper.queryUser();
    }
}
