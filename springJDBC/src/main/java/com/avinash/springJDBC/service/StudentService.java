package com.avinash.springJDBC.service;

import com.avinash.springJDBC.model.Student;
import com.avinash.springJDBC.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    //instance variable
    @Autowired
    private StudentRepo repo;
    //methods

    //addStudent
    public void addStudent(Student s){
        repo.save(s);
    }

    //setStudents
    public List<Student> getStudents(){
        return repo.findAll();
    }
}
