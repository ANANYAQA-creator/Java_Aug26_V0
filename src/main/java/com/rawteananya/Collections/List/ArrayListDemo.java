package com.rawteananya.Collections.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args){

        List<String> browsers = new ArrayList<>();

        browsers.add("Chrome");
        browsers.add("Firefox");
        browsers.add("Safari");
        browsers.add("Edge");

        System.out.println(browsers);
        System.out.println(browsers.get(0));

        browsers.set(1,"Brave");
        browsers.remove("Edge");
        System.out.println(browsers.contains("Chrome"));
        System.out.println("Total Browser size : "+ browsers.size());

        for (String browser : browsers){
            System.out.println(browser);
        }
    }
}
