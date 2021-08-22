package com.training.java.exercise.lesson6;

import java.util.Random;
import java.util.Scanner;

public class TrainingTable {

    public static void main(String[] args) {

        run();
    }

    private static int initialisationRandomNumber() {
        Random random = new Random();
        int number = 1 + random.nextInt(9);
        return number;
    }

    private static boolean functionMistakes(int mistake, int repeat) {
        return mistake < 5 && repeat < 2;
    }

    private static void run() {
        System.out.println("Привет давай научимся считать ");
        int mistake = 0;
        int repeats = 0;
        Scanner scan = new Scanner(System.in);

        do {
            int randomNumber1 = initialisationRandomNumber();
            int randomNumber2 = initialisationRandomNumber();

            System.out.print(randomNumber1 + " * " + randomNumber2 + " = ");
            int result = scan.nextInt();
            if (result == randomNumber1 * randomNumber2) {
                System.out.println("Верно");
                functionMistakes(mistake, 0);
            } else {
                functionMistakes(mistake++, repeats++);
                System.out.println("Неверно");
            }
        } while (functionMistakes(mistake, repeats));
        scan.close();
    }

}

