package com.lcwd.mvc.SpringMvcProject.controller;

import com.lcwd.mvc.SpringMvcProject.models.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.*;

@RestController
@RequestMapping("/student")
public class StudentController
{
// create student
   /*
   date:requared
    we are receiving data in json format

    */
 @PostMapping("/create")
public Student createStudent(@RequestBody List<Student> student ){

     //save :data : process
     //logic apply
//  System.out.println(data);
//  Object name = data.get("name");
//  Object empId= data.get("empId");
//  System.out.println("Name "+name);
//  System.out.println("Emp Id"+empId);
//  return "created";
     System.out.println("Student list size "+ student.size());
  System.out.println(student);
 // save: data: process

//     List<String> food = Arrays.asList("Pizza","Burger");
     /*Map<String,Object> data = new HashMap<>();
     data.put("content",student);
     data.put("error","no error found");
     data.put("currentdate", new Date()); */
    // data.put("SystemInformation",System.getProperties());
     return student.get(0);
 }
}
