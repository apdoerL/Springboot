package org.apdoer.multipledatasource.mapper.db2;

import org.apache.ibatis.annotations.Select;

/**
 * @author apdoer
 * @version 1.0
 * @date 2019/10/11 12:26
 */
public interface Db2UserMapper {

    /**
     * 查一个username
     * @return username
     */
    @Select("select username from web_user where id = 1")
    String queryUser();
}
