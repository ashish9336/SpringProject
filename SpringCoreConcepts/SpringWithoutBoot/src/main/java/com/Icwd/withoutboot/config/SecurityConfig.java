package com.Icwd.withoutboot.config;

import com.Icwd.withoutboot.web.AuthController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityConfig {
    @Bean
    public AuthController authController(){
        return  new AuthController();
    }
}
