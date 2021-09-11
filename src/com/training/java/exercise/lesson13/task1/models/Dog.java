package com.training.java.exercise.lesson13.task1.models;

public class Dog extends Animal {

    private static final String ANIMAL_NAME = "Dog";

    public Dog(int food, int location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Gav");
    }

    @Override
    public void eat() {
        food += 30;
    }

    @Override
    public String getAnimalName() {
        return ANIMAL_NAME;
    }
}
