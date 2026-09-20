package com.rawteananya.OOPs.Overloading_OverRidingDemo;

public class OverloadingOverridingTest {
    public static void main(String[] args){

        //overloading:

        Browser browser = new Browser();
        browser.launch();
        browser.launch("140");

        //Overriding
        Browser chromeBrowser = new ChromeBrowser();
        chromeBrowser.launch();

    }
}
