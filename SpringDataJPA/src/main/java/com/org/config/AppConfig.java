package com.org.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages ={"com"})
//@EnableJpaRepositories(basePackages = {"com"})
public class AppConfig {

	
}
