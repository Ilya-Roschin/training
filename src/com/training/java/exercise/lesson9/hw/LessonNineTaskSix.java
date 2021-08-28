package com.training.java.exercise.lesson9.hw;

/**
 * https://www.codewars.com/kata/5842df8ccbd22792a4000245/train/java
 */

public class LessonNineTaskSix {

    public static void main(String[] args) {

        String result = expandedForm(70304);
        System.out.println(result);
    }

    public static String expandedForm(int num) {
        StringBuilder result = new StringBuilder();
        int tempNum = num;
        int numLength = findNumberLength(tempNum);
        int[] numberArray =fillArray(num, numLength);
        int tempNumLength = numLength;

        for (int i = numLength - 1; i >= 0; i--) {
            if (numberArray[i] != 0) {
                if (i != numLength - 1) {
                    result.append(" + ");
                }
                result.append(numberArray[i] * (int) Math.pow(10, tempNumLength - 1));
            }
            tempNumLength--;
        }
        return result.toString();
    }

    private static int findNumberLength(int num) {
        int tempNum = num;
        int numLength = 0;
        while (tempNum > 0) {
            tempNum /= 10;
            numLength++;
        }
        return numLength;
    }

    private static int[] fillArray(int num, int arrayLength) {
        int tempNum = num;
        int[] numberArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            numberArray[i] = tempNum % 10;
            tempNum /= 10;
        }
        return numberArray;
    }

}
