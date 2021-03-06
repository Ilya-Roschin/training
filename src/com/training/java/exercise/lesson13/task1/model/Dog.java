package com.training.java.exercise.lesson13.task1.model;

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

    @Override
    public void showInfo() {
        System.out.println(ANIMAL_NAME + "\n" + "food: " + food + "\n" + "location: " + location);
    }
}
