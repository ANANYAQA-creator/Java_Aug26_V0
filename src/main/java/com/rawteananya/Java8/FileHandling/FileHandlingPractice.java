package com.rawteananya.Java8.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingPractice {
    public static void main(String [] args)  {

        File file = new File("testdata.txt");

        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.exists());

        try{
            if (file.createNewFile()){
                System.out.println("File created");
            }else {
                System.out.println("File already exists");
            }
        }
        catch(IOException e){
         e.printStackTrace();
        }

        try{
        FileWriter write = new FileWriter("testdata.txt");
        write.write("Username=ananya");
        write.write("\nPassword=Test@123");
            write.write("\nBrowser=Chrome");
            write.write("\nEnvironment=QA");
            write.close();
    } catch(IOException e){
            e.printStackTrace();
        }

        //Append
        try {
            FileWriter write = new FileWriter("testdata.txt", true);
            write.write("\nProject=BFS");
            write.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


       // Task 5 ⭐⭐⭐ Automation-oriented

        File file1 = new File("testlog.txt");
        try{
            if (file1.createNewFile()){
                System.out.println("File1 created");
            }else {
                System.out.println("File1 already exists");
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }

        try{
            FileWriter writer = new FileWriter("testlog.txt");
            writer.write("Test Execution Started");
            writer.write("\nLogin Test Passed");
            writer.write("\nPayment Test Passed");
            writer.write("\nTest Execution Completed");
            writer.close();
        } catch(IOException e){
            e.printStackTrace();
        }


}
}