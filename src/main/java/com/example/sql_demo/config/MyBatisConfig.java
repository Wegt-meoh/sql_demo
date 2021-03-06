package com.example.sql_demo.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;


/**
 * @Date: 2018-12-26 12:05
 * @version: v1.0
 * @Description: mybatis stater从某个版本后去掉了自动配置，需要用config配置
 */
@Configuration
public class MyBatisConfig {

    @Autowired
    private Environment env;

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource myDataSource) throws Exception {

//        String typeAliasesPackage = env.getProperty("mybatis.typeAliasesPackage");
        String mapperLocations = env.getProperty("mybatis.mapper-locations");
        if(mapperLocations==null){
            throw  new Exception("mybatis.mapper-locations is null");
        }
//        String configLocation = env.getProperty("mybatis.configLocation");

        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(myDataSource);
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(mapperLocations));
        return sqlSessionFactoryBean.getObject();
    }
}
