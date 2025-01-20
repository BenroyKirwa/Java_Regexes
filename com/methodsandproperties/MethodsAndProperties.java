package com.methodsandproperties;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MethodsAndProperties {

    public static void main(String[] args) {

        // Add your java file here
        String filepath = "Book.java";

        try {
            String file = Files.readString(Paths.get(filepath));
            Pattern pattern = Pattern.compile("private\\s[a-zA-Z]{1,}");
            Matcher matcher = pattern.matcher(file);

            while(matcher.find()){
                System.out.println(matcher.group());
            }

        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
