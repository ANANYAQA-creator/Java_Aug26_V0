package com.rawteananya.String;

public class StringBufferDemo {
    public static void main(String[] args){

        StringBuffer sb = new StringBuffer("Java");

        // Part 1

        sb.append(" Selenium");
        sb.append(" Automation");

        System.out.println(sb);

        // Part 2

        sb.insert(0, "Test ");
        System.out.println(sb);

        //part3

        StringBuffer text = new StringBuffer("Java Selenium Automation");
         text.delete(5,14);
        System.out.println(text);

        //Part 4 — reverse()

        StringBuffer name = new StringBuffer("Ananya");
        name.reverse();
        System.out.println(name);

        //Part 5 — Thread-safety demonstration ⭐

        StringBuffer sb1 = new StringBuffer();
        Thread t1 = new Thread(() -> {
            sb1.append("Thread 1 ");
        });

        Thread t2 = new Thread(() -> {
            sb1.append("Thread 2 ");
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(sb1);
    }
}
