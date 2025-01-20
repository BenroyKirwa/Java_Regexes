package com.inputregex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputRegex {
    private String name, email;
    private String mobile;

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name : ");
        name = scanner.nextLine();
        name();
        System.out.println("Enter the email : ");
        email = scanner.nextLine();
        email();
        System.out.println("Enter the mobile number : ");
        mobile = scanner.nextLine();
        mobileNumber();
    }
    public void name(){
        Pattern pattern = Pattern.compile("[a-z]{3,20}|[A-Z]{3,20}|\\s");
        Matcher matcher = pattern.matcher(name);
        boolean found = matcher.find();
        if(found){
            System.out.println("Name accepted.");
        }else {
            System.out.println("Name not accepted. Must be letters or spaces only!! ");
        }
    }
    public void email(){
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]*@gmail\\.com$");
        Matcher matcher = pattern.matcher(email);
        boolean found = matcher.find();
        if(found){
            System.out.println("email accepted.");
        }else {
            System.out.println("Name not accepted. Must be valid email address !! ");
        }
    }
    public void mobileNumber(){
        Pattern pattern = Pattern.compile("^(254|\\\\+254|07|01)[0-9]{8,13}$");
        Matcher matcher = pattern.matcher(mobile);
        boolean found = matcher.find();
        if(found){
            System.out.println("Number accepted.");
        }else {
            System.out.println("Number not accepted. Must start with 254,07,01 or +254 !! ");
        }
    }
    public static void main(String[] args) {
        InputRegex inputRegex = new InputRegex();
        inputRegex.input();
    }
}