package com.svm.survey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class Application extends SpringBootServletInitializer {
 
    public static void main(String[] args) 
    {
        SpringApplication.run(Application.class, args);
    }
 
}
