package com.example.demoProject.model;

import jakarta.persistence.*;

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToOne
    @JoinColumn(name="course_id")
    private Course course;
    public int getId(){return id;}
    public void setId(int id){this.id=id;}
    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    public Course getCourse(){return course;}
    public void setCourse(Course course){this.course=course;}
}
