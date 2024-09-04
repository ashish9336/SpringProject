package com.lcwd.mvc.SpringMvcProject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SuperMan {


    @RequestMapping("/about")
    public String aboutRequestHandler() {
        System.out.println("Processing about request");
        return "about";
    }

}
