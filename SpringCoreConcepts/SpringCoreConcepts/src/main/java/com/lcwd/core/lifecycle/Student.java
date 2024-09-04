package com.lcwd.core.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component("student5")
public class Student {
    public Student(){
        System.out.println("##.Creating student");
    }

    @PostConstruct
    //some initialization
    public void postConstruct(){
        System.out.println("##.Student bean is created: created()");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("#: bye bye student: Destroy");
    }
}
