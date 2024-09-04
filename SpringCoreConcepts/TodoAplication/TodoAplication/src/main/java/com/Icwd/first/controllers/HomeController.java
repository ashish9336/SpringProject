package com.Icwd.first.controllers;

import com.Icwd.first.config.LCWDConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.Arrays;




@RestController
public class HomeController {
    @Value("${lcwd.profile.image.path}")
    private String profilePath;
    @Autowired
    private LCWDConfig lcwdconfig;

    @RequestMapping("/todos")
    public List<String> justTest(){
        List<String> todos= Arrays.asList(

                "learn spring Boot",
                "Learn Django",
                "Learn Node Js",
                "Learn Angular",
                "Learn PHP"

        );
        return todos;
    }
    @RequestMapping("/profile-path")
    public String getProfilePath(){
        return this.profilePath;


    }
    @RequestMapping("/lcwd-config")
    public LCWDConfig getLcwdconfig() {
        System.out.println(this.profilePath);
        return lcwdconfig;
    }
}
