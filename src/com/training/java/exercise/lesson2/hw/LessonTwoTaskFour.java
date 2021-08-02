package com.training.java.exercise.lesson2.hw;

public class LessonTwoTaskFour {

    public static void main(String[] args) {

        int a = 30;
        int b = 20;
        int x = 30;
        int y = 35;
        int z = 15;

        if (x <= a && y <= b || y <= a && x <= b ||
            x <= a && z <= b || z <= a && x <= b ||
            z <= a && y <= b || y <= a && z <= b) {
            System.out.println("pass");
        } else {
            System.out.println("not pass");
        }
    }
}
