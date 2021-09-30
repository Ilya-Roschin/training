package com.training.java.exercise.lesson12.hw;

import static java.lang.Math.max;

public class TestService {

    public void printNumbers(Test1 test) {
        int number1 = test.getNumber1();
        int number2 = test.getNumber2();
        System.out.println("Number 1: " + number1 + "\n" + "Number 2: " + number2 + "\n");
    }

    public Test1 removeNumbers(int newNumber1, int newNumber2) {
        return new Test1(newNumber1, newNumber2);
    }

    public int findSum(Test1 test) {
        return test.getNumber1() + test.getNumber2();
    }

    public int findBiggestNumber(Test1 test) {
        return max(test.getNumber1(), test.getNumber2());
    }
}
