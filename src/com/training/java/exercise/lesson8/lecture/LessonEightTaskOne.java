package com.training.java.exercise.lesson8.lecture;

public class LessonEightTaskOne {

    private static final String[] input = new String[]{"firstNumber", "secondNumber", "thirdNumber"};

    public static void main(String[] args) {

        String[] array = input;
        String sr = "efEfef";
        char[] charArray = sr.toCharArray();

        int i = 0;
        int temp = 0;
        while (i < array.length) {
            int indexChar = (int) charArray[i];
            if (indexChar >= 65 && indexChar <= 95) {
                break;
            }
            i++;
            temp = i;
        }

        for (i = 0; i <= temp; i++) {
            System.out.print(charArray[i]);
        }
        System.out.println();
        for (i = temp + 1; i < array.length; i++) {
            System.out.print(charArray[i]);
        }

    }
}
