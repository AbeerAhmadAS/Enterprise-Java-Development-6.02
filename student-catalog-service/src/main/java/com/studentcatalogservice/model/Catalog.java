package com.studentcatalogservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Catalog {
    private String courseName;
    private List<StudentGrade> studentGrades;

    public void setStudentGrades(List<StudentGrade> studentGrades) {
        this.studentGrades = studentGrades;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
