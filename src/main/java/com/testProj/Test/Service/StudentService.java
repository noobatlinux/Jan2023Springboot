package com.testProj.Test.Service;

import com.testProj.Test.Model.student;
import com.testProj.Test.Respository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository repo;

    public List<student> getAllStudents(){
        return repo.findAll();
    }
}
