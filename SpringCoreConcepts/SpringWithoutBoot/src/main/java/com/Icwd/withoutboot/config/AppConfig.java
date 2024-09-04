package com.Icwd.withoutboot.config;

import com.Icwd.withoutboot.beans.CartService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.Icwd.withoutboot","another.word"})
public class AppConfig {
    //declare for bean for cartServices
    @Bean("cartService1")
    public CartService cartService(){
        return new CartService();
    }
}
