package com.accent.ProjectBackEnd.config;

import com.accent.ProjectBackEnd.entity.*; 

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.accent.ProjectBackEnd.repository",
        entityManagerFactoryRef = "TricityEntityManagerFactory",
        transactionManagerRef= "TricityTransactionManager"
)
public class TricityDatasourceConfig {
		@Bean
	    @Primary
	    @ConfigurationProperties("app.datasource.tricity")
	    public DataSourceProperties tricityDataSourceProperties() {
	        return new DataSourceProperties();
	    }

	    @Bean
	    @Primary
	    @ConfigurationProperties("app.datasource.tricity.config")
	    public DataSource tricityDataSource() {
	        return tricityDataSourceProperties().initializeDataSourceBuilder()
	                .type(HikariDataSource.class).build();
	    }

	    @Primary
	    @Bean(name = "TricityEntityManagerFactory")
	    public LocalContainerEntityManagerFactoryBean TricityEntityManagerFactory(EntityManagerFactoryBuilder builder) {
	        return builder
	                .dataSource(tricityDataSource())
	               // .packages(ZonesEntity.class) 
	               // .packages("com.accent.ProjectBackEnd.entity") 
	                .packages(new String[] { "com.accent.ProjectBackEnd.entity" }) 
	                .build();
	    }

	    @Primary
	    @Bean
	    public PlatformTransactionManager TricityTransactionManager(
	            final @Qualifier("TricityEntityManagerFactory") LocalContainerEntityManagerFactoryBean TricityEntityManagerFactory) {
	        return new JpaTransactionManager(TricityEntityManagerFactory.getObject());
	    }

	}

