package com.training.java.exercise.lesson15;

public class Main {

    public static void main(String[] args) {
        validate(new PasswordValidator());
        validate(new LoginValidator());

    }

    public static void validate(Validator validate) {
        validate.validate();
        validate.validateByDefault();
    }

    public static  void validate(Validator validate1, Validator validate2) {
        validate1.validate();
        validate2.validate();
    }

//    public static void validate(PasswordValidator passwordValidator) {
//        passwordValidator.byPasswordValidate();
//    }
//
//    public static void validate(LoginValidator loginValidator) {
//        loginValidator.validationByLogin();
//    }
//
//    public static void validate(PasswordValidator passwordValidator, LoginValidator loginValidator) {
//        passwordValidator.byPasswordValidate();
//        loginValidator.validationByLogin();
//    }
//
//    public static void validate(LoginValidator loginValidator, PasswordValidator passwordValidator) {
//        loginValidator.validationByLogin();
//        passwordValidator.byPasswordValidate();
//    }
}
