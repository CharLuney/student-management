package com.studentms.sms;

// CHILD CLASS 1
class UndergraduateStudent extends Student{
    // ??
    public UndergraduateStudent(String name, int id, int age) {
        super();
    }

    public void addGrade(float) {
        grades.add(grade);
    }

    @Override
    public float getAverageGrade() {
        float sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        return sum / grades.size();
    }
}

// CHILD CLASS 2
class GraduateStudent extends Student{
    // ??
    GraduateStudent(String name, int id, int age) {
        super();
    }

    @Override
    public void addGrade(float) {
        grades.add(grade);
    }

    @Override
    public float getAverageGrade() {
        float sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        return sum / grades.size();
    }
}