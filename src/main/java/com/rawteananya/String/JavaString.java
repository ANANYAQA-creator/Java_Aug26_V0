package com.rawteananya.String;

public class JavaString {
    public static void main (String[] args){

      //  Part 1

        String browser = "Chrome";

        System.out.println("Browser :" + browser);
        System.out.println(browser.length());
        System.out.println(browser.toUpperCase());
        System.out.println(browser.toLowerCase());

        //Part 2

        String message = "   Login Successful  ";
        System.out.println(message.trim());

        // Part3

        if (message.trim().contains("Successful")){
            System.out.println("Present");
        }else{
            System.out.println("Not Present");
        }

        // Part4

        String expected = "Login Successful";
        String actual = "Login Successful";

        if(expected.equals(actual)){
            System.out.println("Text Matched");
        } else{
            System.out.println("Not Matched");
        }

        // Part 5
        String b1 = "Chrome";
        String b2 = "chrome";

        if (b1.equalsIgnoreCase(b2)){
            System.out.println("Case ignore and matched");
        }else{
            System.out.println("Case ignore but not matched");
        }

        // Part 6

        String text = "Selenium";
        System.out.println(text.substring(0,4));

        // PArt7
        String change = "Java Selenium";
        System.out.println(change.replace("Selenium","Automation"));

        //Part8
        String actualMessage = "Login successful for user";

        if (actualMessage.contains("Login successful")){
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        // Part 9 startsWith() and endsWith()

        String url = "https://www.google.com";

        System.out.println(url.startsWith("https"));
        System.out.println(url.endsWith(".com"));

        if( url.startsWith("https") && url.endsWith(".com")){
            System.out.println("Valid URl");
        } else {
            System.out.println("Invalid URL");
        }

        //Part 10 — isEmpty() and isBlank()

        String username ="";
        String password = " ";

        System.out.println(username.isEmpty());
        System.out.println(password.isBlank());

        if(username.isEmpty()){
            System.out.println("Username is Empty");
        }
        if (password.isBlank()){
            System.out.println("Password is blank");
        }

        /*Key difference
isEmpty()
Checks whether the string has 0 characters.

isBlank()
Checks whether the string is empty or contains only whitespace.*/

        //Next → Part 11: charAt() and indexOf()

        String textNew = "Selenium";

        System.out.println(textNew.charAt(0));
        System.out.println(textNew.indexOf("m"));

        if (textNew.contains("m")){
            System.out.println("Contain");
        }else {
            System.out.println("Not contain");
        }

        //using indexOf():

        if (textNew.indexOf("m") != -1){
            System.out.println("Contains");
        } else {
            System.out.println("Not Contains");
        }
//Important: indexOf() returns -1 when the character/text is not found.

      //  Next → Part 12: split()

        String browserss = "Chrome,Firefox,Edge";

        String[] browserlist = browserss.split(",");
        for (String browserz : browserlist){
            System.out.println(browserz);
        }

        // Next → Part 13: concat() and +

        String firstName = "Ananya";
        String lastName = " Rawte";

        System.out.println(firstName + lastName);
        System.out.println(firstName.concat(lastName));
        //Interview point ⭐
        // concat() returns a new String because Strings are immutable.

        // Next → Part 14: compareTo()
//compareTo() compares two Strings lexicographically. It returns 0 if they are equal,
// a negative value if the first String comes before the second,
// and a positive value if it comes after.

        String s1 ="Cat";
        String s2 = "Dog";
        String s3 = "Apple";
        System.out.println(s1.compareTo(s2)); // -1
        System.out.println(s1.compareTo(s3)); // 2


    }
}
