package com.rawteananya.Java8.FileHandling;

import java.io.*;

public class FileAutomationPractice {
    public static void main(String[] args) {

        try {
            File file = new File("testCase.txt");

            if( file.createNewFile()){
                System.out.println("File created");
            }else{
                System.out.println("File already exist");
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        try
                ( FileWriter writer = new FileWriter("testCase.txt")){
            writer.write("Login Test");
            writer.write("\nPayment Test");
            writer.write("\nLogout Test");
            writer.write("\nTransfer Test");
            writer.close();

        }catch (IOException e){
            e.printStackTrace();
        }

        try
                (BufferedReader reader = new BufferedReader(new FileReader("testCase.txt"))){
            String fileContent;
            while ((fileContent = reader.readLine()) != null) {
                System.out.println("Executing : "+ fileContent);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}