package com.Icwd.withoutboot.config;

import com.Icwd.withoutboot.web.HomeController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {
    //declare the homeController bean
    @Bean
    public HomeController homeController(){
        return new  HomeController();
    }
}
