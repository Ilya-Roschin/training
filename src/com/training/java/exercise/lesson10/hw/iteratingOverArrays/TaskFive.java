package com.training.java.exercise.lesson10.hw.iteratingOverArrays;

import java.util.Scanner;

/**
 * The first line of the input contains N which is the number of companies in the country.
 * The second line contains the yearly incomes of each company. All numbers are non-negative integers.
 * The third line contains individual taxes for each company in percent of the company's income.
 * All numbers are integers from 0 to 100 inclusive.
 * <p>
 * You should output the number of the company that pays the most taxes.
 * Keep in mind that the enumeration of the companies starts with number 1.
 * If there are several companies with the same payment sizes, output the number of the company with the lowest number.
 */
public class TaskFive {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] arrayCompanyIncomes = new int[arraySize];
        int[] arrayCompanyTaxes = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            arrayCompanyIncomes[i] = scanner.nextInt();
        }

        for (int i = 0; i < arraySize; i++) {
            arrayCompanyTaxes[i] = scanner.nextInt();
        }

        int indexCompany = findIndexCompanyWithTheMostTaxes(arrayCompanyIncomes, arrayCompanyTaxes);
        System.out.println(indexCompany);
    }

    private static int findIndexCompanyWithTheMostTaxes(int[] arrayCompanyIncomes, int[] arrayCompanyTaxes) {
        int maxTaxes = 0;
        int maxIndex = 0;
        for (int i = 0; i < arrayCompanyIncomes.length; i++) {
            int taxes = arrayCompanyIncomes[i] * arrayCompanyTaxes[i];
            if (taxes > maxTaxes) {
                maxTaxes = taxes;
                maxIndex = i + 1;
            }
        }
        return maxIndex;
    }
}


