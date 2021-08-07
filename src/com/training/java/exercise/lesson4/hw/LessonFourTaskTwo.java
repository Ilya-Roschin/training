package com.training.java.exercise.lesson4.hw;

public class LessonFourTaskTwo {

    public static void main(String[] args) {

        int[] array = {1, 5, 6, 7, 8, 7, 3, 4, 5};
        array = removeDuplicates(array);

        for (int i : array) {
            System.out.println(i + ", ");
        }
    }

    private static int[] removeDuplicates(int[] arr) {

        int[] resultArr = new int[arr.length];
        int j = 0;
        resultArr[j] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            boolean check = false;
            for (int k = 0; k < j + 1; k++) {
                if (resultArr[k] != arr[i]) {
                    check = true;
                } else {
                    check = false;
                    break;
                }
            }
            if (check) {
                resultArr[++j] = arr[i];
            }
        }
        return resultArr;
    }
}


