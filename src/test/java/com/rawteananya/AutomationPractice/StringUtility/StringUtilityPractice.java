package com.rawteananya.AutomationPractice.StringUtility;

public class StringUtilityPractice {

    public static void main(String [] args){

        StringUtility stringUtility = new StringUtility();

        System.out.println(stringUtility.isBlank( "   "));
        System.out.println( stringUtility.cleanText("   Login Successfull "));
        System.out.println(stringUtility.containsIgnoreCase("LoginSuccessfull","login"));
        System.out.println(stringUtility.isNumeric("6537322"));

    }
}
