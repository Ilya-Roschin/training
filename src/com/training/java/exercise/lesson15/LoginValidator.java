package com.training.java.exercise.lesson15;

public class LoginValidator implements Validator {

    public void validationByLogin() {
        System.out.println("validation by login");
    }

    @Override
    public void validate() {
        System.out.println("validation by login");
    }

}
