package com.example.demoProject.service;

import com.example.demoProject.model.Course;
import com.example.demoProject.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepository repo;
    public Course addCourse(Course c){return repo.save(c);}
    public List<Course> getAllCourses(){return repo.findAll();}
}
