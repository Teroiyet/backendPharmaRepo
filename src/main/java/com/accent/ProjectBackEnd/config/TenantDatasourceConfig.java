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
@EnableJpaRepositories(basePackages = "com.accent.ProjectBackEnd.security.repository",
        entityManagerFactoryRef = "TenantEntityManagerFactory",
        transactionManagerRef= "TenantTransactionManager"
)
public class TenantDatasourceConfig {
	@Bean
    @ConfigurationProperties("app.datasource.tenant")
    public DataSourceProperties tenantDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @ConfigurationProperties("app.datasource.tenant.config")
    public DataSource tenantDataSource() {
        return tenantDataSourceProperties().initializeDataSourceBuilder()
                .type(HikariDataSource.class).build();
    }

    
    @Bean(name = "TenantEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean TenantEntityManagerFactory(EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(tenantDataSource())
               // .packages(UserEntity.class) 
               // .packages("com.accent.ProjectBackEnd.security.entity") 
                .packages(new String[] { "com.accent.ProjectBackEnd.security.entity" }) 
                .build();
    }

    
    @Bean
    public PlatformTransactionManager TenantTransactionManager (
            final @Qualifier("TenantEntityManagerFactory") LocalContainerEntityManagerFactoryBean TenantEntityManagerFactory) {
        return new JpaTransactionManager(TenantEntityManagerFactory.getObject());
    }

}


