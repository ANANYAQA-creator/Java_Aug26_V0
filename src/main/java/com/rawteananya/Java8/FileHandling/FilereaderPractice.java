package com.rawteananya.Java8.FileHandling;

import java.io.*;

public class FilereaderPractice {
    public static void main(String[] args) {

        try {
            File file = new File("testdata_Filereader.txt");

            if (file.createNewFile()) {
                System.out.println("testdata_Filereader Created");
            } else {
                System.out.println("File already exist");
            }

        } catch(IOException e){
            e.printStackTrace();
        }
        try
                ( FileWriter writer = new FileWriter("testdata_Filereader.txt")){
            writer.write("Username=ananya");
            writer.write("\nPassword=Test@123");
            writer.write("\nBrowser=Chrome");
            writer.write("\nEnvironment=QA");
            writer.write("\nProject=BFS");
            writer.close();

        } catch(IOException e){
            e.printStackTrace();
        }

// Task 1 ⭐⭐⭐
//
//Use FileReader and read() to print the complete file content.

        try
            (FileReader fileReader = new FileReader("testdata_Filereader.txt")) {
            int data;
            while((data = fileReader.read())!=-1){
                System.out.print((char) data);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        //Task 2 ⭐⭐⭐⭐
        //Use BufferedReader and readLine() to print the same file line by line.

        try
                ( BufferedReader bufferedReader = new BufferedReader(new FileReader("testdata_Filereader.txt"))){
            String fileContent;
            while ((fileContent = bufferedReader.readLine()) != null) {
                System.out.println(fileContent);
            }
        } catch(IOException e){
            e.printStackTrace();
        }

        //Task 3 ⭐⭐⭐⭐
        //Using BufferedReader, print only the lines containing: Browser

        try
                ( BufferedReader bufferedReader = new BufferedReader(new FileReader("testdata_Filereader.txt"))){
            String fileContent;
            while ((fileContent = bufferedReader.readLine()) != null) {
                if (fileContent.contains("Browser")) {
                    System.out.println(fileContent);
                }}

        } catch(IOException e){
            e.printStackTrace();
        }
    }
}