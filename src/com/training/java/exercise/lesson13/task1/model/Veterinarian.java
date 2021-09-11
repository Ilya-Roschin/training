package com.training.java.exercise.lesson13.task1.model;

public class Veterinarian {
    public void treatAnimal(Animal animal) {
        System.out.println("Animal name: " + animal.getAnimalName());
        System.out.println("Food: " + animal.getFood());
        System.out.println("Location:" + animal.getLocation());
        animal.makeNoise();
    }
}
