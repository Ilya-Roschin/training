package com.training.java.exercise.lesson13.task1.models;

public class Horse extends Animal {

    public static final String ANIMAL_NAME = "Horse";

    public Horse(int food, int location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("eeeehoo");
    }

    @Override
    public void eat() {
        food += 60;
    }

    @Override
    public String getAnimalName() {
        return ANIMAL_NAME;
    }
}
