package com.hl.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan({"com.hl.service","com.hl.mapper"})
@PropertySource("classpath:jdbc.properties")
@Import({MybatisConfig.class,jdbcConfig.class})
@EnableTransactionManagement
public class SpringConfig {
}
