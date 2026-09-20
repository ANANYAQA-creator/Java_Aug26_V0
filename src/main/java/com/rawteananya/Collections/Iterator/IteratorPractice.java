package com.rawteananya.Collections.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorPractice {
    public static void  main(String [] args){

        List<String> testCases = new ArrayList<>();

       testCases.add("TC001 - Login");
       testCases.add("TC002 - Payment");
       testCases.add("TC003 - Logout");
       testCases.add("TC004 - Transfer");

       Iterator<String> iterator = testCases.iterator();

       while( iterator.hasNext()){
           String testcase = iterator.next();
           System.out.println(testcase);
       }

       Iterator<String> iterator2 = testCases.iterator();
       while(iterator2.hasNext()){
           String testCaseRemove = iterator2.next();
           if (testCaseRemove.equals("TC003 - Logout")){
               iterator2.remove();
           }
       }
        System.out.println(testCases);
    }
}
