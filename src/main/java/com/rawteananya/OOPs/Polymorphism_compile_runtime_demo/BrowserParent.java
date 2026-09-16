package com.rawteananya.OOPs.Polymorphism_compile_runtime_demo;

public class BrowserParent {

    public void launch(){
        System.out.println("Launching Browser");
    }

    public void launch(String version){
        System.out.println("Latest version launched : " + version);
    }
}

/*You have two methods with the same name:
launch()
launch(String version)

Different parameter lists → method overloading.*/