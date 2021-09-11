package com.training.java.exercise.lesson13.task2.models;

public class Aspirant extends Student {

    private static final String TYPE_STUDENT = "Aspirant";

    public Aspirant(String firstName, String lastName, int group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    @Override
    public int getScholarship() {
        return getAverageMark() == 10 ? 200 : 180;
    }

    @Override
    public String getTypeStudent() {
        return TYPE_STUDENT;
    }
}
