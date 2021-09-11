package com.training.java.exercise.lesson13.task1.model;

public class Animal {

    protected int food;
    private final int location;
    private static final String DEFAULT_NAME = "Animal";

    public Animal(int food, int location) {
        this.food = food;
        this.location = location;
    }

    public int getFood() {
        return food;
    }

    public int getLocation() {
        return location;
    }

    public String getAnimalName() {
        return DEFAULT_NAME;
    }

    public void makeNoise() {
        System.out.println("Base voice");
    }

    public void eat() {
        food += 50;
    }

    public void sleep() {
        System.out.println("This animal sleep");
    }
}
