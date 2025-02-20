package com.studentms.sms;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    String studentID;
    int age;
    List<Float> grades = new ArrayList<>();
    
    // Establish getters and setters to access private attributes -> encapsulation

    public void setName(String newName) { this.name = newName; }
    public String getName() { return this.name; }

    public void setStudentID(String newStudentID) { this.studentID = newStudentID; }
    public String getSTudentID() { return this.studentID; }

    public void setAge(int newAge) { this.age = newAge; }
    public int getAge() { return this.age; }

    public void setGrades(List<Float> newGrades) { this.grades = newGrades; }
    public List<Float> getGrades() { return this.grades; }

    // FIRST METHOD : ADD GRADES

    public void addGrade(float grade) {
        grades.add(grade);
    }


    // SECOND METHOD : GET AVERAGE GRADE

    // Obtain sum of listed grades
    public float getGradeSum() {
        float sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        return sum;
    }

    // Divide sum by amount of grades
    public float getAverageGrade() {
         return getGradeSum() / grades.size();
    }
}