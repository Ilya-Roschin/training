package com.training.java.exercise.lesson13.task2.models;

public class Student {

    private static final String TYPE_STUDENT = "Student";
    private final String firstName;
    private final String lastName;
    private final int group;
    private final double averageMark;

    public Student(String firstName, String lastName, int group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public int getScholarship() {
        return averageMark == 10 ? 100 : 80;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGroup() {
        return group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public String getTypeStudent() {
        return TYPE_STUDENT;
    }
}
