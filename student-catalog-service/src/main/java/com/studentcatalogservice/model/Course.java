package com.studentcatalogservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    private String courseCode;
    private String courseName;
    private List<Grade> grades;

    public String getCourseName() {
        return courseName;
    }
}
