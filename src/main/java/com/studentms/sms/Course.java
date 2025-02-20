package com.studentms.sms;

import java.util.ArrayList;
import java.util.List;

public class Course {
    String courseName;
    String courseCode;
    int creditHours;
    List<Student> students = new ArrayList<>();


    // Establish getters and setters to access private attributes -> encapsulation

    public void setCourseName(String newCourseName) { this.courseName = newCourseName; }
    public String getCourseName() { return this.courseName; }

    public void setCourseCode(String newCourseCode) { this.courseCode = newCourseCode; }
    public String getCourseCode() { return this.courseCode; }

    public void setCreditHours(int newCreditHours) { this.creditHours = newCreditHours; }
    public int getCreditHours() { return this.creditHours; }

    public void setStudents(List<Student> newStudents) { this.students = newStudents; }
    public List<Student> getStudents() { return this.students; }

    // 

}
