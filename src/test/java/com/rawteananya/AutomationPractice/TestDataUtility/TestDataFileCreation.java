package com.rawteananya.AutomationPractice.TestDataUtility;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestDataFileCreation {
    public static void main(String[] args){

        try {
            Path path = Path.of("testDataUtility.txt");

            if(!Files.exists(path)){
                Files.createFile(path);
            }else{
                System.out.println("File already exists");
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        try{
            Path path = Path.of("testDataUtility.txt");

            Files.writeString(path,"username=ananya\npassword=Test@123\nbrowser=chrome\nenvironment=QA\nproject=BFS");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
