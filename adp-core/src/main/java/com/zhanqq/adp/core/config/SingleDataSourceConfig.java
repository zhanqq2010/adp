package com.zhanqq.adp.core.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName SingleDataSourceConfig
 * @Description TODO
 * @Author zhanqq
 * @Date 2018/8/3116:01
 * @Version 1.0
 **/

@Configuration
//@ConditionalOnProperty
@EnableTransactionManagement
@MapperScan(basePackages = {"com.zhanqq.adp.modular.system.dao"})
public class SingleDataSourceConfig {
}
