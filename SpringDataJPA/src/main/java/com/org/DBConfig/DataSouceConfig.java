package com.org.DBConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.jta.JtaTransactionManager;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@Configuration
@EnableTransactionManagement
//@EnableJpaRepositories(basePackages = "com.org.DAO")
public class DataSouceConfig {

//	@Bean
//	DriverManagerDataSource dataSource()
//	{
//		DriverManagerDataSource ds=new DriverManagerDataSource();
//		ds.setUrl("jdbc:h2:mem:test");
//		ds.setUsername("sa");
//		ds.setPassword("");
//		ds.setDriverClassName("org.h2.Driver");
//		return ds;
//	}
	@Bean
	EntityManagerFactory entityManagerFactory() {
//	LocalContainerEntityManagerFactoryBean emf=new LocalContainerEntityManagerFactoryBean();
//	emf.setJpaProperties(null);
//	 emf.setDataSource(dataSource());
//	 emf.setPackagesToScan("com.org.Entity");
//	 emf.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
//	 emf.setPersistenceUnitName("H2DB");
//	 return emf;
		EntityManagerFactory emf = Persistence
				   .createEntityManagerFactory("BooksPU");
		return emf;
	
	}
	
	@Bean
	PlatformTransactionManager getTransactionManager(EntityManagerFactory emf)
	{
		JpaTransactionManager jpaTM=new JpaTransactionManager(emf);
		return jpaTM;
	
	}
	
}
