package com.rawteananya.AutomationPractice.StringUtility;

public class StringUtility {

    // isBlank()
    public boolean isBlank(String value){
       return value == null || value.isBlank();
    }

    // clean text Utility
    public String cleanText(String value){
        if(value == null){
            return "";
        }
       return  value.trim();
    }

    // containsIgnoreCase
    public boolean containsIgnoreCase(String actual,String expected){
        if(actual == null || expected == null){
            return false;
        }
        return actual.toLowerCase().contains(expected.toLowerCase());
    }

    // is Numeric()
    public boolean isNumeric(String value){
        if (value == null || value.isBlank()){
            return false;
        }
        return value.chars().allMatch(Character::isDigit);
    }
}
