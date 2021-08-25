package com.training.java.exercise.lesson7.lecture;

import java.util.Random;
import java.util.Scanner;

public class LessonSevenTaskOne {

    public static void main(String[] args) {
        run();
    }

    private static void run() {

        int[] bounds = findBounds();
        int lowerBound = bounds[0];
        int upperBound = bounds[1];
        Random random = new Random();
        int guessNumber = lowerBound + random.nextInt(upperBound - lowerBound);
        System.out.println(" Enter number from interval [" + lowerBound + ", " + upperBound + "] = ");

        //Scanner scanner = new Scanner(System.in);
        while (true) {
            int userNumber = 5;
            if (userNumber == guessNumber) {
                System.out.println("You guessed");
                break;
            }
            if (userNumber >= upperBound || userNumber <= lowerBound) {
                System.out.println("You out of the interval");
            }
            if (userNumber <= upperBound && userNumber >= lowerBound) {
                if (userNumber > guessNumber) {
                    upperBound = userNumber;
                } else {
                    lowerBound = userNumber;
                }
            }
            System.out.println("[" + lowerBound + ", " + upperBound + "]");
        }


    }

    private static int[] findBounds() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter upper bound1 : ");
        int upperBound = scanner.nextInt();
        System.out.println(" Enter lower bound2 : ");
        int lowerBound = scanner.nextInt();
        if (upperBound < lowerBound) {
            int temp = upperBound;
            upperBound = lowerBound;
            lowerBound = temp;
        }
        scanner.close();
        return new int[]{lowerBound, upperBound};
    }

}
