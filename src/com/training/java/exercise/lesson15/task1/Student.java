package com.training.java.exercise.lesson15.task1;

public class Student {

    Storage storage = new Storage();
    private final String lastName;
    private final String firstName;
    private final int numberGroup;
    private final double mark;

    public Student(String lastName, String firstName, int numberGroup, double mark) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.numberGroup = numberGroup;
        this.mark = mark;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    public double getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "storage=" + storage +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", numberGroup=" + numberGroup +
                ", mark=" + mark +
                '}';
    }


}
