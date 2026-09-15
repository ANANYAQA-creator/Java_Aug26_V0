package com.rawteananya.Methods_java;

public class Method_Overloading_demo {

    public void search(){
        System.out.println("Search Happens");
    }

    public void search(String username){
        System.out.println("Search with username : " + username);
    }

    public void search(String name, int age){
        System.out.println("Name :"+ name +" "+ "Age: " + age);
    }
    public static void main(String[] args){

        Method_Overloading_demo mo = new Method_Overloading_demo();

       mo.search();
       mo.search("Ananya");
       mo.search("Rahul", 28);

    }
}
