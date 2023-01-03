package com.testProj.Test.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class CalculatorController {

    @GetMapping("/add/{n1}/{n2}")
    public double Add(@PathVariable("n1") double num1, @PathVariable("n2") double num2){
        return num1 + num2;
    }

    @GetMapping("/sub/{n1}/{n2}")
    public double Subtract(@PathVariable("n1") double num1, @PathVariable("n2") double num2){
        return num1 - num2;
    }

    @GetMapping("/mul/{n1}/{n2}")
    public double Multiply(@PathVariable("n1") double num1, @PathVariable("n2") double num2){
        return num1 * num2;
    }

    @GetMapping("/div/{n1}/{n2}")
    public double Divide(@PathVariable("n1") double num1, @PathVariable("n2") double num2){
        return num1 / num2;
    }
}
