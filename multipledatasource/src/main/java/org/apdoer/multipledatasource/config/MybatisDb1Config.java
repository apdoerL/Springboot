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
@MapperScan(basePackages = {"org.apdoer.multipledatasource.mapper.db1"},sqlSessionFactoryRef = "sqlSessionFactory1")
public class MybatisDb1Config {
    private DataSource dataSource1;


    @Autowired
    @Qualifier("db1")
    public void setDataSource1(DataSource dataSource1) {
        this.dataSource1 = dataSource1;
    }

    @Bean("sqlSessionFactory1")
    public SqlSessionFactory sqlSessionFactory1() throws Exception {
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource1);
        return sqlSessionFactory.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate1() throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactory1());
        return template;
    }
}
