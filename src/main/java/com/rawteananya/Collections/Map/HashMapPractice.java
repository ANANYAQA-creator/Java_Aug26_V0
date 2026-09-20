package com.rawteananya.Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args){

        Map<String,String> testData = new HashMap<>();

        testData.put("username","ananya");
        testData.put("password","Test@123");
        testData.put("browser","Chrome");
        testData.put("environment","QA");

        System.out.println("Username : " + testData.get("username"));

        System.out.println(testData.containsKey("browser"));
        System.out.println(testData.containsValue("Chrome"));
        // Chrome → Firefox
        testData.put("browser","Firefox");

        testData.remove("environment");
        System.out.println("Total number of testData : " + testData.size());

        for (Map.Entry<String,String> entry : testData.entrySet()){
            System.out.println(entry);
        }

    }
}
