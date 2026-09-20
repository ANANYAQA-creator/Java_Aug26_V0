package com.rawteananya.OOPs.Overloading_OverRidingDemo;

public class Browser {

    public void launch(){
        System.out.println("Launching Browser");
    }

    public void launch(String version){
        System.out.println("Launching Browser Version : " + version);
    }
}
