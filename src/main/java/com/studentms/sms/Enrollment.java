package com.studentms.sms;

public class Enrollment {
    String Student;
    String Course;

    public void seStudent(String newStudent) { this.Student = newStudent; }
    public String getStudent() { return this.Student; }

    public void setCourse(String newCourse) { this.Course = newCourse; }
    public String getCourse() { return this.Course; }

    public void Register() {
        this.Student = Student;
        this.Course = Course;
        Course.enrollStudent(Student);
    } 
}
