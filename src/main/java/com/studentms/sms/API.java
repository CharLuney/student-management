package com.studentms.sms;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class API {

    // Initialisation
    public API() {
        InitData();
    }

    private static List<Student> studentList;
    private static List<Course> courseList;
    
    public static void InitData() {
        studentList = new ArrayList<>();
        courseList = new ArrayList<>();
        // ??
    }

    // GET list of students
    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentList;
    }

    // POST student to student list
    @PostMapping("/students")
    public Student addStudent(@RequestBody Student newStudent) {
        studentList.add(newStudent);
        System.out.println(newStudent.getName() + " is now enrolled.");
        return newStudent;
    }

    // GET list of courses
    @GetMapping("/courses")
    public List<Course> getCourses() {
        return courseList;
    }

    // POST course to course list
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course newCourse) {
        courseList.add(newCourse);
        System.out.println(newCourse.getCourseName() + " has been added.");
        return newCourse;
    }

    // POST student enrolled in course
    @PostMapping("/enrollment")
    public Enrollment register(@RequestBody Enrollment newEnrollment) {
        return newEnrollment;
    }
}


// https://codecrunch.org/creating-a-post-and-get-request-springboot-ff6e82a5d46b