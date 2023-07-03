package com.hl.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.hl.controller","com.hl.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
