package com.rawteananya.ExceptionHandling;

public class Validation_Main{

    public static void main (String[] args){


        ValidationDemo validationDemo = new ValidationDemo();

        try {
            validationDemo.validateAmount(100000.58);
            validationDemo.validateAmount(-11353.23);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());

        }
    }
}
