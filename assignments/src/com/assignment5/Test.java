package com.assignment5;

public class Test {

}
 class StudentManagementSystem {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Alice");
        Student student2 = new Student(102, "Bob");

        System.out.println("Total Students: " + Student.getTotalStudents()); // Initial total students count

        Student student3 = new Student(103, "Carol");
        System.out.println("Total Students: " + Student.getTotalStudents()); // Updated total students count

        student2.dropStudent();
        System.out.println("Total Students after dropping: " + Student.getTotalStudents()); // Updated total students count
    }
}