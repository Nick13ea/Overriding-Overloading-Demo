package com.company.MethodOverloading.Student;

//overloading is using same name as methods but using different no of parameters
public class Student {
    String firstName;
    String lastName;
    String email;
    int rollNo;

    public void registerStudent(String firstName, String lastName) {
        System.out.println("Students are registered with "+firstName+" "+ lastName);
    }

    public void registerStudent(String firstName, String lastName, String email) {
        System.out.println("Students are registered with "+firstName +" "+ lastName +" "+ email);
    }

    public void registerStudent(String firstName, String lastName, String email, int rollNo) {
        System.out.println("Students are registered with "+firstName + " "+lastName +" "+ email +" "+ rollNo);
    }
}
