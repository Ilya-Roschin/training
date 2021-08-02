package com.training.java.exercise.lesson2.hw;

public class LessonTwoTaskThree {

    public static void main(String[] args) {

        int x1 = -1;
        int y1 = -3;

        int x2 = 1;
        int y2 = -1;

        int x3 = 2;
        int y3 = 0;

        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
