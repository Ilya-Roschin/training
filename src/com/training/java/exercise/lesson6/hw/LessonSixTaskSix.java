package com.training.java.exercise.lesson6.hw;

public class LessonSixTaskSix {

    public static void main(String[] args) {

        double[] array = {5, 6, 7, 6, 5.1, 2343, 535.3, 24, 434, 434, 343, 353};
        double sum;

        for (int i = 0; i < array.length; i++) {
            if (i > 1) {
                boolean check = false;
                if (i == 2) {
                    check = true;
                }
                for (int j = 2; j < i; j++) {
                     if (i % j == 0) {
                        check = false;
                        break;
                    } else {
                        check = true;
                    }
                }
                if (check == true) {
                    System.out.print(array[i] + ", ");
                }
            }
        }
    }
}
