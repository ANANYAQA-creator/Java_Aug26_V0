package com.rawteananya.Methods_java;

public class Method_Overriding_Demo {

    class Browser {
        public void launch() {
            System.out.println("Launching Browser");
        }
    }

    class Firefox extends Browser {
        @Override
        public void launch() {
            System.out.println("Launching Firefox");
        }
    }

    public static void main(String[] args) {
        Method_Overriding_Demo obj = new Method_Overriding_Demo();
        Firefox firefox = obj.new Firefox();
        firefox.launch();
    }

}


