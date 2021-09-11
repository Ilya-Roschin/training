package com.training.java.exercise.lesson13.task1.models;

public class Veterinarian {

    public void run() {
        Animal animal[] = new Animal[3];
        animal[0] = new Cat(50, 1);
        animal[1] = new Dog(70, 2);
        animal[2] = new Horse(120, 3);

        animal[0].eat();

        for (int i = 0; i < animal.length; i++) {
            treatAnimal(animal[i]);
        }
    }

    private void treatAnimal(Animal animal) {
        System.out.println("Animal name: " + animal.getAnimalName());
        System.out.println("Food: " + animal.getFood());
        System.out.println("Location:" + animal.getLocation());
        animal.makeNoise();
    }
}
