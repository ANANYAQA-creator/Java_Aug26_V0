package com.rawteananya.AutomationPractice.FileUtility;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileUtility {


    //fileExists()
    public boolean fileExists(String filePath){
        return Files.exists(Path.of(filePath));
    }

    // readFile()
    public String readFile(String filePath) throws IOException {
        return Files.readString(Path.of(filePath));
    }

    // readLines()

    public List<String> readLines(String filePath) throws  IOException{
        return  Files.readAllLines(Path.of(filePath));
    }

    //writeFile()
    public void writeFile(String filePath, String content) throws IOException{
        Files.writeString(Path.of(filePath),content);
    }

    //appendToFile()
    public void appendToFile(String filePath,String content) throws IOException{
        Files.writeString(Path.of(filePath),
                content,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);
        //CREATE creates the file if it doesn't exist;
        //APPEND adds content to the end instead of replacing existing content.
    }
}


