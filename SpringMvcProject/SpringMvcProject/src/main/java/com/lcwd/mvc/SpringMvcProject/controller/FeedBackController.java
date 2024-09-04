package com.lcwd.mvc.SpringMvcProject.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class FeedBackController {
    //@RequestMapping(value = "/feedbacks",method = RequestMethod.GET)
    @GetMapping("/feedbacks")
    public List<String > getFeedbacks(){
        List<String> feedbacks = Arrays.asList(
                "Good Course",
                "Nice One",
                "Valuable thing"
        );
        return feedbacks;
    }
//    @RequestMapping(value = "/create-feedback",method = RequestMethod.POST)
    @PostMapping("/create-feedback")
    public String createFeedback(){
        System.out.println("Feedback created");
        return "created feedback";
    }
}
