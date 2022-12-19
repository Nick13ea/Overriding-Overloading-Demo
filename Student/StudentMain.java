package com.company.MethodOverloading.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();

        student.registerStudent("Nikhil", "Salaria");
        student.registerStudent("Nikhil", "Salaria","nikhil@gmail.com");
        student.registerStudent("Nick", "Salaria","nick@gmail.com",21);

    }
}
