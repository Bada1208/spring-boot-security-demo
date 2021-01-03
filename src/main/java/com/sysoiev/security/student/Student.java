package com.sysoiev.security.student;

public class Student {
    private final Integer studentId;
    private final String firstName;

    public Student(Integer studentId, String firstName) {
        this.studentId = studentId;
        this.firstName = firstName;
    }

    public Integer getId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
