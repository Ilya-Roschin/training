package com.training.java.exercise.lesson15;

public interface Validator {

    void validate();
    default void validateByDefault() {
        System.out.println("Validation by default validator");
    }
    static void useStaticMethod() {

    }

    private void privateMethod() {

    }

    private static void privateStaticMethod() {

    }
}
