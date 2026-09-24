package com.rawteananya.AutomationPractice.StringUtility;

public class StringUtilityPracticeII {

    public static void main (String[] args){

        StringUtility stringUtility = new StringUtility();

        System.out.println("Null : " + stringUtility.isBlank(null));
        System.out.println("isBlank : " + stringUtility.isBlank("  "));
        System.out.println(stringUtility.cleanText("     Login     Successfull"));
        System.out.println(stringUtility.containsIgnoreCase("Payment Successful","payment"));
        System.out.println(stringUtility.isNumeric("123ABC"));

    }
}
