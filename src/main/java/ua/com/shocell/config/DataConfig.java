package ua.com.shocell.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import ua.com.shocell.controller.GeneralDAO;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
@PropertySource("classpath:app.properties")
public class DataConfig {
    @Resource
    private Environment environment;

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getRequiredProperty("db.driver"));
        dataSource.setUrl(environment.getRequiredProperty("db.url"));
        dataSource.setUsername(environment.getRequiredProperty("db.username"));
        dataSource.setPassword(environment.getRequiredProperty("db.password"));
        return dataSource;
    }

    private Properties getHibernateProperties(){
        Properties properties = new Properties();
        properties.put("hibernate.dialect", environment.getRequiredProperty("db.hibernate.dialect"));
        properties.put("hibernate.show_sql", environment.getRequiredProperty("db.hibernate.show_sql"));
        properties.put("hibernate.hbm2ddl.auto", environment.getRequiredProperty("db.hibernate.hbm2ddl.auto"));
        properties.put("hibernate.connection.CharSet", environment.getRequiredProperty("db.hibernate.connection.CharSet"));
        properties.put("hibernate.connection.characterEncoding",
                environment.getRequiredProperty("db.hibernate.connection.characterEncoding"));
        properties.put("hibernate.connection.useUnicode",
                environment.getRequiredProperty("db.hibernate.connection.useUnicode"));

        return properties;
    }

    @Bean
    public GeneralDAO getGeneralDAO(){
        return new GeneralDAO();
    }
}