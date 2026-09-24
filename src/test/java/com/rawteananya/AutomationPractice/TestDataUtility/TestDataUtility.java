package com.rawteananya.AutomationPractice.TestDataUtility;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestDataUtility {

    public Map<String,String> loadTestData(String filePath) {

        Map<String,String> testData = new HashMap<>();

        try {

            Path path = Path.of(filePath);
            //Read file using Files.readAllLines()
            List<String> line = Files.readAllLines(path);

            for (String lines : line) {
                // Ignore blank lines
                if (lines.isBlank()) {
                    continue;
                }

                // Split key and value
                String[] parts = lines.split("=", 2);

                // Make sure key=value format exists
                if (parts.length == 2) {
                    // Use.trim()
                    String key = parts[0].trim();
                    String value = parts[1].trim();
                testData.put(key, value);
            }
        }

        }catch (IOException e){
            throw new RuntimeException("Unable to read test data file : "+ filePath,e) ;
        }

        return testData;
    }
}

