package com.testProj.Test.Respository;

import com.testProj.Test.Model.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<student, Integer> {

}
