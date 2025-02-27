package com.studentms.sms;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private String courseCode;
    private int creditHours;
    private List<Student> students = new ArrayList<>();

     // SETTERS & GETTERS
    public void setCourseName(String newCourseName) { this.courseName = newCourseName; }
    public String getCourseName() { return this.courseName; }

    public void setCourseCode(String newCourseCode) { this.courseCode = newCourseCode; }
    public String getCourseCode() { return this.courseCode; }

    public void setCreditHours(int newCreditHours) { this.creditHours = newCreditHours; }
    public int getCreditHours() { return this.creditHours; }

    public void setStudents(List<Student> newStudents) { this.students = newStudents; }
    public List<Student> getStudents() { return this.students; }


    // METHOD 1 : ENROLL STUDENT
    public void enrollStudent(Student student) {
        students.add(student);
    }


    // METHOD 2 : GET ENROLLED STUDENTS
    public List<Student> getEnrolledStudents() {
        return List<Student>;
        // ??
    }

}
