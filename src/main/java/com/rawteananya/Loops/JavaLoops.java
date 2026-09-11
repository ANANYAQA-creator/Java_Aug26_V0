package com.rawteananya.Loops;

import java.util.List;

public class JavaLoops {
    public static void main(String[] args) {

        //Part 1 — for

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        //  Part 2 — while
        int i = 5;      // starting value
        while (i >= 1) { // condition
            System.out.println(i);
            i--;         // decrease
        }

        //Part 3 — do-while

        int number = 10;
        do {
            System.out.println(number);
        } while (number < 5);


        //Part 4 — for-each
        String[] browsers = {"Chrome", "Firefox", "Edge"};
        for (String browser : browsers) {
            System.out.println(browser);
        }

        // Part 5 — break

        for (int k = 1; k <= 5; k++) {
            if (k == 5)
                break;
            System.out.println(k);
        }

        //  Part 6 — continue

        for (int l = 1; l <= 5; l++) {
            if (l == 3) {
                continue;
            }
            System.out.println(l);
        }

        //🔥 Part 7 — Selenium-style scenario

        String[] browserss = {"Chrome", "Firefox", "Edge", "Safari"};

        for (String browser : browserss) {
            if (browser.equals("Edge")) {
                System.out.println("Edge browser found");
                break;
            }

        }
    }
}