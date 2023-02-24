package com.testProj.Test.Controller;

import com.testProj.Test.Model.student;
import com.testProj.Test.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping("/all")
    public List<student> getAllStudents(){

        return service.getAllStudents();
    }

}
