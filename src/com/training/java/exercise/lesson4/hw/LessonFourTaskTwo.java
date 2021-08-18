package com.training.java.exercise.lesson4.hw;

import java.sql.Array;
import java.util.Arrays;

public class LessonFourTaskTwo {

    public static void main(String[] args) {

        int[] array = {2, 1, 5, 6, 7, 5, 8, 8, 8};
        int[] resultArray = removeDuplicates(array);

        for (int i : resultArray) {
            System.out.println(i + ", ");
        }
    }

    private static int[] removeDuplicates(int[] arr) {

        int m = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j && arr[i] != 0) {

                    for (int k = j + 1; k < arr.length; k++) {
                        arr[k - 1] = arr[k];
                    }

                    arr[arr.length - m - 1] = 0;
                    m++;
                }
            }
        }

        int[] newArray = new int[arr.length - m];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }
}


