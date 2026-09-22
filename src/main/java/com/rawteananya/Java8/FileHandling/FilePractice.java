package com.rawteananya.Java8.FileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilePractice {
    public static void main(String[] args){

        //Task 1 ⭐⭐⭐
        try{
        Path path = Path.of("config.txt");
            if (!Files.exists(path)) {
                Files.createFile(path);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        //Task 2 ⭐⭐⭐
        try{
            Path path = Path.of("config.txt");
            Files.writeString(path,"Browser=Chrome\nEnvironment=QA\nProject=BFS");
        }catch (IOException e){
            e.printStackTrace();
        }

        //Task 3 ⭐⭐⭐⭐
        try{
            Path path = Path.of("config.txt");
           String fileContent = Files.readString(path);
            System.out.println(fileContent);

        }catch (IOException e){
            e.printStackTrace();
        }

        // Task 4 ⭐⭐⭐⭐
        try{
            Path path = Path.of("config.txt");
            List<String> lines = Files.readAllLines(path);

            for(String line : lines){
                System.out.println(line);
            }

        }catch (IOException e){
            e.printStackTrace();
        }

        //Task 5
        try{
            Path path = Path.of("testcase_filePractice.txt");
            if (!Files.exists(path)) {
                Files.createFile(path);
            }else {
                System.out.println("File Created already");
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        try {
            Path path = Path.of("testcase_filePractice.txt");
            List<String> testCases = Arrays.asList(
                    "Login Test",
                    "Payment Test",
                    "Logout Test",
                    "Transfer Test"
            );
            Files.write(path,testCases
            );
        }catch (IOException e){
            e.printStackTrace();
        }

        try{
            Path path = Path.of("testcase_filePractice.txt");
            List<String> testCases = Files.readAllLines(path);

            List<String> result = testCases.stream()
                    .filter(test -> !test.isBlank())
                    .map( String::toUpperCase)
                    .sorted()
                    .collect(Collectors.toList());
            System.out.println(result);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
