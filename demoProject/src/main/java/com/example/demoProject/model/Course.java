package com.example.demoProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String courseName;
    private String duration;
    public int getId(){return id;}
    public void setId(int id){this.id=id;}
    public String getCourseName(){return courseName;}
    public void setCourseName(String courseName){this.courseName=courseName;}
    public String getDuration(){return duration;}
    public void setDuration(String duration){this.duration=duration;}
}
