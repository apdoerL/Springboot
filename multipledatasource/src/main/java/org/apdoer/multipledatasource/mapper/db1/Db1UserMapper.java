package org.apdoer.multipledatasource.mapper.db1;

import org.apache.ibatis.annotations.Select;

/**
 * @author apdoer
 * @version 1.0
 * @date 2019/10/11 12:25
 */
public interface Db1UserMapper {

    /**
     * 查一个
     * @return username
     */
    @Select("select username from web_user where id = 1")
    String queryUser();

}
