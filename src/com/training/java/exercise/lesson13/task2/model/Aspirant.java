package com.training.java.exercise.lesson13.task2.model;

public class Aspirant extends Student {

    private static final String TYPE_STUDENT = "Aspirant";
    private final String scienceProject;

    public Aspirant(String firstName, String lastName, int group, double averageMark, String scienceProject) {
        super(firstName, lastName, group, averageMark);
        this.scienceProject = scienceProject;
    }

    public String getScienceProject() {
        return scienceProject;
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
