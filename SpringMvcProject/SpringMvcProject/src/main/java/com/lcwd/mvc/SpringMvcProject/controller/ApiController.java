package com.lcwd.mvc.SpringMvcProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/api",method = RequestMethod.GET)
public class ApiController {
      @RequestMapping("/hello")
      @ResponseBody
    public String helloApi(){
        return "Hello, how are you, whats going these days";
    }
    @RequestMapping(value = "/users",method = RequestMethod.GET)
   
    public List<String> getUserData(){
          return Arrays.asList("Ram","shayam","chikku");
    }
    @RequestMapping(value = "/create-user",method=RequestMethod.POST)
    public String createUser(){
        System.out.println();
        return "user created !!";
    }

}
