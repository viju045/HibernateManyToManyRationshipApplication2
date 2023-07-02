package org.mahagan.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;
//This is my Second ManyToMany mapping relationship application.
@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId;
    private String courseName;
    private String courseDomain;
    @ManyToMany(mappedBy = "course",cascade = CascadeType.ALL)
    Set<Student>student = new HashSet<>();

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDomain() {
        return courseDomain;
    }

    public void setCourseDomain(String courseDomain) {
        this.courseDomain = courseDomain;
    }

    public Set<Student> getStudent() {
        return student;
    }

    public void setStudent(Set<Student> student) {
        this.student = student;
    }
}
