package com.assignment5;

public class Letsee {

}
class Student {
    private int studentID;
    private String name;
    private static int totalStudents = 0; // Static variable to track the total number of students

    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        totalStudents++; // Increment totalStudents when a new student is created
    }

    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public static int getTotalStudents() {
        return totalStudents; // Static method to access the totalStudents count
    }

    public void dropStudent() {
        totalStudents--; // Decrement totalStudents when a student is dropped
    }
}

