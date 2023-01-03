package com.testProj.Test.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/greet")
    public String sayHello(){
        return "Hello! This is a test";
    }

    @GetMapping("/greet/{name}")
    public  String ErrorInWeb(@PathVariable("name") String inputName){
        return "Hi "+inputName+". Welcome to the Webpage";
    }
}
