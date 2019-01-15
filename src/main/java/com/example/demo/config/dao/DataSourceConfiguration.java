package com.example.demo.config.dao;

import org.springframework.context.annotation.Bean;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DataSourceConfiguration {

	@Bean(name="dataSource")
	public ComboPooledDataSource createDataSource() {
		ComboPooledDataSource dataSource =new ComboPooledDataSource();
		return dataSource;
	}
}
