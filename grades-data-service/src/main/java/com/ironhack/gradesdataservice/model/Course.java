package com.ironhack.gradesdataservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor

public class Course {
    @Id
    private String courseCode;
    private String courseName;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "courses_grades",
            joinColumns = { @JoinColumn(name = "course_code")},
            inverseJoinColumns = { @JoinColumn(name = "grade_id")}
    )
    private List<Grade> grades;

    public Course(String courseCode, String courseName, List<Grade> grades) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.grades = grades;
    }
}
