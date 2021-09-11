package com.training.java.exercise.lesson10.hw.iteratingOverArrays;

import java.util.Scanner;

/**
 * Write a program that reads an array of lowercase strings and checks whether the array is in alphabetical order or not.
 * <p>
 * There are some rules to compare a pair of strings a and b:
 * <p>
 * First chars of the strings are compared: a[0] and b[0]. If a[0] comes earlier than b[0] in the alphabet,
 * then a comes before b in terms of alphabetical order. If the first chars are the same, then the second chars
 * are compared, and so on.
 * If a position is reached where one string has no more chars to compare while the other does, then the shorter string
 * is deemed to come first in alphabetical order.
 * Finally, identical strings are always in alphabetical order.
 * You can use the compareTo method of the String class to compare 2 strings. If this String object alphabetically
 * precedes the argument string, then the result is a negative integer. The result is a positive integer if this
 * String object alphabetically follows the argument string. The result is zero if the strings are identical.
 * This is exactly what you need to compare 2 strings alphabetically!
 */
//public class TaskEight {
//
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        String string = scanner.nextLine();
//        int [] [] arrayAlphabeticalNumbers = fillStringArray(string);
//
//
//    }
//
//    private static int findArraySize(String string) {
//        int arraySize = 1;
//        for (int i = 0; i < string.length(); i++) {
//           if (string.charAt(i) == ' ') {
//               arraySize++;
//           }
//        }
//        return arraySize;
//    }
//
//    private static String[] fillStringArray(String string) {
//        int arraySize = findArraySize(string);
//        int [] [] arrayAlphabeticalNumbers = new String[arraySize];
//        int j = 0;
//        for (int i = 0; i < arraySize; i++) {
//            if (string.charAt(i) != ' ') {
//                int temp = string.charAt(i);
//                arrayString[j] += temp;
//            } else {
//                j++;
//            }
//        }
//        return arrayString;
//    }
//
//    private static boolean isAlphabeticalOrderInArray(String[] list) {
//        int j = 0;
//      for (int i = 1; i < list.length; i++) {
//          if (list[i].length() )
//      }
//
//
//    }
//
//
//}
