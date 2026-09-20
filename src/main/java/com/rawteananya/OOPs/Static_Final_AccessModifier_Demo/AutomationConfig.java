package com.rawteananya.OOPs.Static_Final_AccessModifier_Demo;

public class AutomationConfig {

    static String browser = "Chrome";

    static final int MAX_RETRY =3;
//    ✅ Correct.
//MAX_RETRY is static final, so class-level access is appropriate.
    private String environment = "QA" ;

    public static void displayConfig(){
        //✅ Correct.
        //displayConfig() is static, so you call it using the class name, without creating an object.
        System.out.println("Browser : " + browser);
        System.out.println("Max Retry : " + MAX_RETRY);
    }

    public String getEnvironment(){
        return environment;
    }
}
