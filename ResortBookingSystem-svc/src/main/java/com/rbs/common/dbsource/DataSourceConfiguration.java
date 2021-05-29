package com.rbs.common.dbsource;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class DataSourceConfiguration {


	@Bean
	public DataSource getDataSource() {
		DataSourceBuilder<?> dataSourceBuilder= DataSourceBuilder.create();
		
		/*
		dataSourceBuilder.driverClassName("oracle.jdbc.driver.OracleDriver");
		dataSourceBuilder.url("jdbc:oracle:thin:@localhost:1521:xe");
		dataSourceBuilder.username("system");
		dataSourceBuilder.password("system");
		*/
		dataSourceBuilder.driverClassName("org.h2.Driver");
		dataSourceBuilder.url("jdbc:h2:mem:test");
		dataSourceBuilder.username("sa");
		dataSourceBuilder.password("");
		
		DataSource build = dataSourceBuilder.build();
		return build;
		
	}
	
}

