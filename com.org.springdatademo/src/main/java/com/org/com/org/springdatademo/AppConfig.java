package com.org.com.org.springdatademo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.org.com.org.springdatademo","com.org.DAO","com.org.entity"})
public class AppConfig {
	
}
