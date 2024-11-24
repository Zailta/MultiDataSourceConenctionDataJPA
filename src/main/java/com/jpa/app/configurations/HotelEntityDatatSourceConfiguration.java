package com.jpa.app.configurations;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.zaxxer.hikari.util.DriverDataSource;

@Configuration
public class HotelEntityDatatSourceConfiguration {
	
	@ConfigurationProperties(prefix = "spring.datasource.hotel")
	@Bean
	public DataSourceProperties HotelEntityDatatSourceProperties() {
		return new  DataSourceProperties();
	}
	@Bean
	public DataSource HotelEntityDatatSource() {
		return HotelEntityDatatSourceProperties().initializeDataSourceBuilder().build();
	}
}
