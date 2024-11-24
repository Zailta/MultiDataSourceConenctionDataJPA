package com.jpa.app.configurations;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
		basePackages = "com.jpa.app.repo.hotel",
		entityManagerFactoryRef ="hotelEntitymanagerBean",
		transactionManagerRef = "hotelEntityTransactionManager"
		)
public class HotelEntityJPAConfiguration {
	
	
	
	@Bean
	LocalContainerEntityManagerFactoryBean hotelEntitymanagerBean(@Qualifier("HotelEntityDatatSource") DataSource dataSource) {
		LocalContainerEntityManagerFactoryBean containerEntityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		containerEntityManagerFactoryBean.setDataSource(dataSource);
		containerEntityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		containerEntityManagerFactoryBean.setPackagesToScan("com.jpa.app.entity.hotel");
		
		return containerEntityManagerFactoryBean;	
	}
	
	@Bean
	PlatformTransactionManager hotelEntityTransactionManager(@Qualifier("hotelEntitymanagerBean") LocalContainerEntityManagerFactoryBean containerEntityManagerFactoryBean) {
		
		return new JpaTransactionManager(containerEntityManagerFactoryBean.getObject());
		
	}
	

}
