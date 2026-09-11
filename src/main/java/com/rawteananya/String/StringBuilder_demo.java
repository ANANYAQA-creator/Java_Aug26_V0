package com.rawteananya.String;

public class StringBuilder_demo {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        // Part 1 Append " Selenium".
        sb.append(" Selenium");
        System.out.println(sb);

        //Part 2 :Append " Automation".
        sb.append(" Automation");
        System.out.println(sb);

        // Part 3 Insert Test at the begining
        sb.insert(0,"Test ");
        System.out.println(sb);

        // Part 4 reverse
        sb.reverse();
        System.out.println(sb);

        // Part 5
        StringBuilder result = new StringBuilder("PASS");
        result.append(" - Login Test");
        System.out.println(result);

    }
}