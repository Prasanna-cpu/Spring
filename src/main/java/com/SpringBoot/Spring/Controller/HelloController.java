package com.SpringBoot.Spring.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @RequestMapping(value="/",method = RequestMethod.GET)
    public String helloWorld(){
        return "Welcome! to Springboot";
    }
    @RequestMapping(value ="/about",method = RequestMethod.GET)
    public String about(){
        return "I am Prasanna ";
    }
    
}
