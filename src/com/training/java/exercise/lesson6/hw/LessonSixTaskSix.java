package com.training.java.exercise.lesson6.hw;

public class LessonSixTaskSix {

    public static void main(String[] args) {

        double[] array = {5, 6, 7, 6, 5.1, 2343, 535.3, 24, 434, 434, 343, 353};

        for (int i = 0; i < array.length; i++) {
            if (i > 1) {
                boolean check = i == 2;
                for (int j = 2; j < i; j++) {
                     if (i % j == 0) {
                        check = false;// TODO: 18.08.2021 remove for (add while)
                        break;
                    } else {
                        check = true;
                    }
                }
                if (check) {
                    System.out.print(array[i] + ", ");
                }
            }
        }
    }
}
