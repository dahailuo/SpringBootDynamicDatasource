package com.doart.datasource;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DynamicDataSourceConfig {

    @Bean
    @ConfigurationProperties("spring.datasource.druid.cj")
    public DataSource firstDataSource(){

        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.druid.uls")
    public DataSource secondDataSource(){

        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    @Primary
    public DynamicRoutingDataSource dataSource(DataSource firstDataSource, DataSource secondDataSource) {

        Map<Object, Object> targetDataSources = new HashMap<>();
        targetDataSources.put(DynamicDataSourceNames.CJ, firstDataSource);
        targetDataSources.put(DynamicDataSourceNames.ULS, secondDataSource);
        return new DynamicRoutingDataSource(firstDataSource, targetDataSources);
    }
}
