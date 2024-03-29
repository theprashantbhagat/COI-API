package com.sud.coi.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Config {
	
	@Value("${spring.datasource.url}")
    private String dataSourceUrl1;

    @Value("${spring.datasource.username}")
    private String dataSourceUsername1;

    @Value("${spring.datasource.password}")
    private String dataSourcePassword1;

    @Value("${spring.datasource.driver-class-name}")
    private String dataSourceDriverClassName1;
    
    
    @Bean(name = "dataSource1")
    public DataSource dataSource1() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(dataSourceUrl1);
        dataSource.setUsername(dataSourceUsername1);
        dataSource.setPassword(dataSourcePassword1);
        dataSource.setDriverClassName(dataSourceDriverClassName1);
        return dataSource;
    }

    @Bean(name = "jdbcTemplate1")
    public JdbcTemplate jdbcTemplate1(@Qualifier("dataSource1") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

}
