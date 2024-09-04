package com.Icwd.withoutboot.beans;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    public void createOrder(){
        System.out.println("one order is created");
    }
}
