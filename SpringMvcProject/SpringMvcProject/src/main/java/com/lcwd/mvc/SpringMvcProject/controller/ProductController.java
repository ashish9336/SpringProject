package com.lcwd.mvc.SpringMvcProject.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    Logger logger = LoggerFactory.getLogger(ProductController.class);
    @GetMapping("/getProduct")
    public String getProduct(@RequestParam("productName")String productName,
                             @RequestParam("productRating") int rating,
                             @RequestParam("productId")int id){
        System.out.println("productName: "+productName);
        System.out.println("productId: "+id);
        System.out.println("ProductRating:"+rating);
        logger.error("ProductName {}",productName);
        logger.warn("productId: {}",id);
        logger.info("Product Rating {} ",rating);
        return "This is testing product url";
    }
    @RequestMapping("/checkProduct/{productId}/{productName}/{ProductRating}")
    public String checkProduct(
            @PathVariable("productId") int id,
            @PathVariable String productName,
            @PathVariable int ProductRating
    ){
        System.out.println("ProductName "+productName);
        System.out.println("product Id" +id);
        System.out.println("ProductRating"+ProductRating);
        return "this is checking the concept of path variable";

    }
}
