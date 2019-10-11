package org.apdoer.multipledatasource.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author apdoer
 * @version 1.0
 * @date 2019/10/11 12:05
 */
@Configuration
@MapperScan(basePackages = {"org.apdoer.multipledatasource.mapper.db2"},sqlSessionFactoryRef = "sqlSessionFactory2")
public class MybatisDb2Config {
    private DataSource dataSource2;


    @Autowired
    @Qualifier("db2")
    public void setDataSource1(DataSource dataSource2) {
        this.dataSource2 = dataSource2;
    }

    @Bean("sqlSessionFactory2")
    public SqlSessionFactory sqlSessionFactory2() throws Exception {
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource2);
        return sqlSessionFactory.getObject();
    }

    @Bean("sqlSessionTemplate2")
    public SqlSessionTemplate sqlSessionTemplate2() throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactory2());
        return template;
    }
}
