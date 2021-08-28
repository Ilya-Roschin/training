package com.training.java.exercise.lesson9.hw;

/**
 * https://www.codewars.com/kata/55c45be3b2079eccff00010f/train/java
 */
public class LessonNineTaskTwo {

    private static final char SPACE = ' ';
    private static final int LOWER_BOUND_NUMBERS = 48;
    private static final int UPPER_BOUND_NUMBERS = 57;

    public static void main(String[] args) {
        String words = "effewfw5f abc3fw";
        System.out.println(order(words));

    }

    public static String order(String words) {
        StringBuilder answer = new StringBuilder();
        boolean check = false;
        for (int i = LOWER_BOUND_NUMBERS + 1; i <= UPPER_BOUND_NUMBERS; i++) {
            char symbol = (char) i;
            int indexOfNumber = words.indexOf(symbol);
            if (indexOfNumber != -1) {
                check = true;
                int indexFirstSymbolOfWord = findIndexFirstSymbolOfWord(words, indexOfNumber);
                while (indexFirstSymbolOfWord < words.length()) {
                    if (words.charAt(indexFirstSymbolOfWord) == SPACE) {
                        break;
                    }
                    answer.append(words.charAt(indexFirstSymbolOfWord));
                    indexFirstSymbolOfWord++;
                }
             answer.append(SPACE);
            }
        }
        if (check) {
            answer.deleteCharAt(answer.length() - 1);
        }
        return answer.toString();
    }

    public static int findIndexFirstSymbolOfWord (String words, int indexOfNumber) {
        int i = indexOfNumber;
        int indexFirstSymbolOfWord = 0;
        while (words.charAt(i) != SPACE && i > 0) {
            indexFirstSymbolOfWord = i;
            i--;
        }
        if (indexFirstSymbolOfWord == 1 && words.charAt(0) != SPACE) {
            indexFirstSymbolOfWord = 0;
        }
        return indexFirstSymbolOfWord;
    }

}
