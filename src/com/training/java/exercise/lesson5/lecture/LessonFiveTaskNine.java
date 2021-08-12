package com.training.java.exercise.lesson5.lecture;

import java.sql.SQLOutput;

public class LessonFiveTaskNine {

    public static void main(String[] args) {

        int[] arrX = {1, 5, 7, 8, 9};
        int[] arrY = {-5, 8, 3, 6, 7};
        int[] result = new int[]{-1,-1};
        double maxRange = 0;

        for (int i = 0; i < arrX.length; i++) {
            double range;
            for(int j = 0; j < arrX.length; j++) {
                range = Math.sqrt((arrX[j] - arrX[i]) + (arrY[j] - arrY[i]));
                if (range >= maxRange) {
                    maxRange = range;
                    result = new int[]{i, j};
                }
            }
        }


        System.out.println("X1 = " + arrX[ result[0]] + ", " + "Y1 = " + arrY[result[0]]);
        System.out.println("X2 = " + arrX[ result[1]] + ", " + "Y2 = " + arrY[result[1]]);
        System.out.println(result[0] + ", "+ result[1]);


    }
}
