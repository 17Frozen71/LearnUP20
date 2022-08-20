package ru.learnup.spring.boot.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import services.Logger;
import services.MyService;

@Configuration
public class AppConfig {

    @Bean
    public Logger logger(){ //name = <bean id "logger"/>
        return new Logger();
    }

    @Bean
    public MyService myService(Logger logger) {
        return new MyService(logger);
    }
}
