package com.sevilinma.fsms.server;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.io.IOException;

/**
 * Created by SevilinMa on 2017/3/24.
 */
@Configuration
@Component
@MapperScan("com.sevilinma.fsms.dao.*")
public class SessionFactoryConfig {
    /**
     * mybatis 配置路径
     */
    private static String MYBATIS_CONFIG = "/mybatis-config.xml";
    /**
     * mybatis mapper resource 路径
     */
    private static String MAPPER_PATH = "/mapper/**/**.xml";

    @Resource(name = "dataSource")
    private DataSource dataSource;

    private String typeAliasPackage = "com.sevilinma.fsms.model";

    /**
     * 创建sqlSessionFactoryBean 实例
     * 并且设置configtion 如驼峰命名.等等
     * 设置mapper 映射路径
     * 设置datasource数据源
     *
     * @return
     */
    @Bean
    public SqlSessionFactoryBean createSqlSessionFactoryBean() throws IOException {
        /** 设置mybatis configuration 扫描路径 */
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        PathMatchingResourcePatternResolver pathMatchingResourcePatternResolver = new PathMatchingResourcePatternResolver();
        org.springframework.core.io.Resource config[] = pathMatchingResourcePatternResolver.getResources(ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX+MYBATIS_CONFIG);
        sqlSessionFactoryBean.setConfigLocation(config[0]);
        /** 添加mapper 扫描路径 */
        String packageSearchPath = ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX + MAPPER_PATH;
        sqlSessionFactoryBean.setMapperLocations(pathMatchingResourcePatternResolver.getResources(packageSearchPath));
        /** 设置datasource */
        sqlSessionFactoryBean.setDataSource(dataSource);
        /** 设置typeAlias 包扫描路径 */
        sqlSessionFactoryBean.setTypeAliasesPackage(typeAliasPackage);
        return sqlSessionFactoryBean;
    }
}
