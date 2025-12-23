package com.example.demoProject.service;


import com.example.demoProject.model.Course;
import com.example.demoProject.model.Student;
import com.example.demoProject.repository.CourseRepository;
import com.example.demoProject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepo;
    @Autowired
    CourseRepository courseRepo;
    public Student addStudent(Student s,int courseId){
        Course c=courseRepo.findById(courseId).orElseThrow();
        s.setCourse(c);
        return studentRepo.save(s);
    }
    public List<Student> getAllStudents(){return studentRepo.findAll();}
}
