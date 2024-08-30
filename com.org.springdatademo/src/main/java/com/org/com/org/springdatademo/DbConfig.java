package com.org.com.org.springdatademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;


@Configuration
@EnableJpaRepositories(basePackages = "com.org.DAO")
@EnableTransactionManagement
public class DbConfig {

	@Bean
	DriverManagerDataSource datasource()

	{DriverManagerDataSource datasource=new DriverManagerDataSource();
	datasource.setDriverClassName("com.mysql.jdbc.Driver");
	datasource.setUrl("jdbc:mysql://localhost:3306/jpa");
	datasource.setUsername("root");
	datasource.setPassword("venkatesh@99");
	
	return datasource;
		
	}
	@Bean(name = "entityManagerFactory")
	LocalContainerEntityManagerFactoryBean entityManagerFactoryBean()
	{
		LocalContainerEntityManagerFactoryBean emf=new LocalContainerEntityManagerFactoryBean();
		emf.setDataSource(datasource());
		emf.setPackagesToScan("com.org.entity");
		//emf.setPersistenceUnitName("notDefaultDb");
		
		emf.setPersistenceUnitName("sqldb");
		emf.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		return emf;
		
	}

	
//	@Bean
//	EntityManager entityManager(@Autowired EntityManagerFactory entityMangerFactory)
//	{
//		System.out.println("In the em(0");
//		EntityManager entityManager=entityMangerFactory.createEntityManager();
//		
//		return entityManager;
//	}
//	
	@Bean(name="transactionManager")
	PlatformTransactionManager tm(EntityManagerFactory emf)
	{
		JpaTransactionManager jpa=new JpaTransactionManager(emf);
		return jpa;
	}
	 
}
