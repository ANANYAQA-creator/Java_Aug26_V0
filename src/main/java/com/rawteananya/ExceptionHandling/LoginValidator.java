package com.rawteananya.ExceptionHandling;

public class LoginValidator {

    public void validatorLogin(String username, String password) throws InvalidLoginException {
        if (username == null || password == null || username.isBlank() || password.isBlank()){
            throw new InvalidLoginException("Invalid credentials");
        } else {
            System.out.println("Login Successfull");
        }
    }

    public static void main (String [] args) {

        LoginValidator loginValidator = new LoginValidator();
        try {
            loginValidator.validatorLogin("Ananya", null);
        } catch (InvalidLoginException e){
            System.out.println(e.getMessage());
        }
    }
}