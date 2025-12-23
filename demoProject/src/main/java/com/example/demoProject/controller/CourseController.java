package com.example.demoProject.controller;

import com.example.demoProject.model.Course;
import com.example.demoProject.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    CourseService service;
    @PostMapping
    public Course addCourse(@RequestBody Course c){return service.addCourse(c);}
    @GetMapping
    public List<Course> getCourses(){return service.getAllCourses();}

}