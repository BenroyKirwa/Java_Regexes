package com.replacewhitespace;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceWhiteSpace {

    public static void main(String[] args) {

        String string = "This is a dummy string.";
        try {
            Pattern pattern = Pattern.compile("\\s");
            Matcher matcher = pattern.matcher(string);

            while (matcher.find()) {
                matcher.replaceAll("_");
                System.out.println(matcher.group());
            }
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
