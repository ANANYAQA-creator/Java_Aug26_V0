package com.rawteananya.OOPs.Polymorphism_compile_runtime_demo;

public class FirefoxChildII extends BrowserParent{
    @Override
    public void launch(){
        System.out.println("Launching Firefox");
    }

    public static void main (String[] args){

        // Overriding
        BrowserParent browser1 = new ChromeChild();
        BrowserParent browser2 = new FirefoxChildII();
        browser1.launch();
        browser2.launch();

        // Overloading
        BrowserParent latest = new BrowserParent();
        latest.launch("12.0.1");

   }
}
/*O/p : Launching Chrome
Launching Firefox
Latest version launched : 12.0.1*/