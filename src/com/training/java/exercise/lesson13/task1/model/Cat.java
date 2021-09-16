package com.training.java.exercise.lesson13.task1.model;

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

    @Override
    public void showInfo() {
        System.out.println(ANIMAL_NAME + "\n" + "food: " + food + "\n" + "location: " + location);
    }
}
