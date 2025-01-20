package com.url;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Write a program Extract a URL from String
public class Url {

    public static void main(String[] args) {

        String string = "The website for google is www.google.com\nThe website for wikipedia is www.wikipedia.com";
        Pattern pattern = Pattern.compile("www.[a-zA-Z_.]+");
        Matcher matcher = pattern.matcher(string);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
