package com.boxregex;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Box {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Administrator\\Downloads\\workflow-approval.html";
        try{

            String file = Files.readString(Paths.get(filePath));

            Pattern pattern = Pattern.compile("\\[[A-Z_]+]");
            Matcher matcher = pattern.matcher(file);
           // boolean found = matcher.find();

            while(matcher.find()){
                System.out.println(matcher.group());
            }
        }
        catch(Exception e){
            System.out.println("Error : " + e.getMessage());
        }
    }
}
