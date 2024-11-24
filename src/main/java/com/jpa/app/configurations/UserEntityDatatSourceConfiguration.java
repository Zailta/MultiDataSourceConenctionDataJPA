package com.jpa.app.configurations;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.zaxxer.hikari.util.DriverDataSource;


public class UserEntityDatatSourceConfiguration {
	
	@ConfigurationProperties(prefix = "spring.datasource.user")
	@Bean
	public DataSourceProperties UserEntityDatatSourceProperties() {
		return new  DataSourceProperties();
	}
	
	@Bean
	public DataSource UserEntityDatatSource() {
		return UserEntityDatatSourceProperties().initializeDataSourceBuilder().build();
	}
}
