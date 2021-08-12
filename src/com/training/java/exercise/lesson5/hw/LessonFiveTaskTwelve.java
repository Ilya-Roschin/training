package com.training.java.exercise.lesson5.hw;

import java.util.Scanner;

public class LessonFiveTaskTwelve {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        String[] result = new String[3];

        if (number >= 100 && number <= 999) {
            int i = 0;
            while (number > 0) {
                int element;
                element = number % 10;
                number /= 10;

                switch (i) {
                    case (0):
                        switch (element) {
                            case (0):
                                result[i] = " ";
                                break;
                            case (1):
                                result[i] = "один ";
                                break;
                            case (2):
                                result[i] = "два ";
                                break;
                            case (3):
                                result[i] = "три ";
                                break;
                            case (4):
                                result[i] = "четыре ";
                                break;
                            case (5):
                                result[i] = "пять ";
                                break;
                            case (6):
                                result[i] = "шесть ";
                                break;
                            case (7):
                                result[i] = "семь ";
                                break;
                            case (8):
                                result[i] = "восемь ";
                                break;
                            case (9):
                                result[i] = "девять ";
                                break;
                            default:
                                break;
                        }
                        break;
                    case (1):
                        switch (element) {
                            case (0):
                                result[i] = " ";
                                break;
                            case (1):
                                result[i] = "десять ";
                                break;
                            case (2):
                                result[i] = "двадцать ";
                                break;
                            case (3):
                                result[i] = "тридцать ";
                                break;
                            case (4):
                                result[i] = "сорок ";
                                break;
                            case (5):
                                result[i] = "пятьдесят ";
                                break;
                            case (6):
                                result[i] = "шестьдесят ";
                                break;
                            case (7):
                                result[i] = "семьдесят ";
                                break;
                            case (8):
                                result[i] = "восемьдесят ";
                                break;
                            case (9):
                                result[i] = "девяносто ";
                                break;
                            default:
                                break;
                        }
                        break;
                    case (2):
                        switch (element) {
                            case (1):
                                result[i] = "сто ";
                                break;
                            case (2):
                                result[i] = "двести ";
                                break;
                            case (3):
                                result[i] = "триста ";
                                break;
                            case (4):
                                result[i] = "четыреста ";
                                break;
                            case (5):
                                result[i] = "пятьсот ";
                                break;
                            case (6):
                                result[i] = "шестьсот ";
                                break;
                            case (7):
                                result[i] = "семьсот ";
                                break;
                            case (8):
                                result[i] = "восемьсот ";
                                break;
                            case (9):
                                result[i] = "девятьсот ";
                                break;
                            default:
                                break;
                        }
                        break;
                    default:
                        break;
                }
                i++;
            }

            for (int j = result.length - 1; j >= 0; j--) {
                System.out.print(result[j]);
            }

        } else {
            System.out.println("incorrect input");
        }
    }
}
