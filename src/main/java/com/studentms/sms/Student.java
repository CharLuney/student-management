package com.studentms.sms;

import java.util.ArrayList;
import java.util.List;

// PARENT CLASS
abstract class Student {
    String name;
    String studentID;
    int age;
    List<Float> grades = new ArrayList<>();
    
    // SETTERS & GETTERS
    public void setName(String newName) { this.name = newName; }
    public String getName() { return this.name; }

    public void setStudentID(String newStudentID) { this.studentID = newStudentID; }
    public String getSTudentID() { return this.studentID; }

    public void setAge(int newAge) { this.age = newAge; }
    public int getAge() { return this.age; }

    public void setGrades(List<Float> newGrades) { this.grades = newGrades; }
    public List<Float> getGrades() { return this.grades; }


    // ABSTRACT METHOD 1 : ADD GRADES
    public abstract void addGrade(float grade);

    // ABSTRACT METHOD 2 : GET AVERAGE GRADE
    public abstract float getAverageGrade();
}