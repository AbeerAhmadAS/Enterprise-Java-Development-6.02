package com.studentcatalogservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor

public class StudentGrade {
    private String studentName;
    private int studentAge;
    private int grade;

    public StudentGrade(String studentName, int studentAge, int grade) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.grade = grade;
    }
}
