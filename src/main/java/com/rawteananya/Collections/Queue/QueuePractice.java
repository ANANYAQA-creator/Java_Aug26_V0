package com.rawteananya.Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {
    public static void main(String[] args){

        Queue<String> testQueue = new LinkedList<>();

        testQueue.offer("TC001 - Login");
        testQueue.offer("TC002 - Payment");
        testQueue.offer("TC003 - Logout");
        testQueue.offer("TC004 - Transfer");

        System.out.println(testQueue);

        System.out.println(testQueue.peek());

        System.out.println(testQueue.poll());

        System.out.println(testQueue);

        System.out.println(testQueue.contains("TC003 - Logout"));
        System.out.println(testQueue.size());

        while( !testQueue.isEmpty()){
            String test = testQueue.poll();
            System.out.println(test);
        }

        System.out.println(testQueue.poll());
        //poll() returns null when the Queue is empty instead of throwing an exception.
    }
}
