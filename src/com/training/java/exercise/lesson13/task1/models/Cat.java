package com.training.java.exercise.lesson13.task1.models;

public class Cat extends Animal {

    private static final String ANIMAL_NAME = "Cat";

    public Cat(int food, int location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        food += 20;
    }

    @Override
    public String getAnimalName() {
        return ANIMAL_NAME;
    }
}
