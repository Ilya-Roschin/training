package com.training.java.exercise.lesson11.codeWarsHw;


/**
 * https://www.codewars.com/kata/5544c7a5cb454edb3c000047/train/java
 */
public class LessonElevenTaskThree {

    public static int bouncingBall(double h, double bounce, double window) {
        int ball = 0;
        if (h <= 0 || (bounce <= 0 || bounce >= 1) || window >= h) {
            return -1;
        }

        while(h > window) {
            ball++;
            h *= bounce;
            if (h > window) {
                ball++;
            }
        }
        return ball;
    }
}
