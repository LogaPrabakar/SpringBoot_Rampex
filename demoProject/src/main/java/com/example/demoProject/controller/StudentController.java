package com.example.demoProject.controller;

import com.example.demoProject.model.Student;
import com.example.demoProject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentService service;
    @PostMapping("/{courseId}")
    public Student addStudent(@RequestBody Student s,@PathVariable int courseId){
        return service.addStudent(s,courseId);
    }
    @GetMapping
    public List<Student> getStudents(){return service.getAllStudents();}
}
