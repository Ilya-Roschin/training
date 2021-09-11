package com.training.java.exercise.lesson12.hw;

public class Test1 {

    private int number1;
    private int number2;

    public Test1(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

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
        if (test.getNumber1() >= test.getNumber2()) {
            return getNumber1();
        }
        return getNumber2();
    }

    private int getNumber1() {
        return number1;
    }

    private int getNumber2() {
        return number2;
    }
}
