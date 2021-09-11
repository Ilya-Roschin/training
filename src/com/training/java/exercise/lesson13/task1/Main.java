package com.training.java.exercise.lesson13.task1;

import com.training.java.exercise.lesson13.task1.model.Animal;
import com.training.java.exercise.lesson13.task1.model.Cat;
import com.training.java.exercise.lesson13.task1.model.Dog;
import com.training.java.exercise.lesson13.task1.model.Horse;
import com.training.java.exercise.lesson13.task1.model.Veterinarian;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = init();
        Veterinarian veterinarian = new Veterinarian();

       //Arrays.stream(animals).forEach(veterinarian::treatAnimal);
        for (Animal element : animals) {
            veterinarian.treatAnimal(element);
        }
    }

    public static Animal[] init() {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat(50, 1);
        animals[1] = new Dog(70, 2);
        animals[2] = new Horse(120, 3);
        return animals;
    }

}
