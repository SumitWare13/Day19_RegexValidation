package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationFormatValidation {

    public static final Scanner Sc = new Scanner(System.in);
    Pattern pattern;
    Matcher matcher;

    //Created A Method For First Name Validation
    public void firstNameValidation(){
        System.out.print("Enter First Name: " );
        String firstName = Sc.next();

        /* RegexFirstName Pattern have:
            1st letter is mandatory capital letter
            Minimum 3 characters
        */
        String regexFirstName = "^[A-Z]{1}[a-z]{2,}";
        pattern = Pattern.compile(regexFirstName);
        matcher = pattern.matcher(firstName);
        Boolean firstNameIs = matcher.matches();
        System.out.println(firstNameIs);
        if (!firstNameIs){
            System.out.println("Enter First Name According To Pattern: [A-Z]{1}+[a-z]{2,}");
        }
    }

    //Created A Method For Last Name Validation
    public void lastNameValidation(){
        System.out.print("Enter Last Name: " );
        String lastName = Sc.next();

        /* RegexLastName Pattern have:
            1st letter is mandatory capital letter
            Minimum 3 characters
        */
        String regexLastName = "^[A-Z]{1}[a-z]{2,}";
        pattern = Pattern.compile(regexLastName);
        matcher = pattern.matcher(lastName);
        Boolean lastNameIs = matcher.matches();
        System.out.println(lastNameIs);
        if (!lastNameIs){
            System.out.println("Enter Last Name According To Pattern: [A-Z]{1}+[a-z]{2,}");
        }
    }

    //Created A Method For Email ID Validation
    public void emailIdValidation(){
        System.out.print("Enter Email Id: " );
        String emailId = Sc.next();

        /* RegexEmailId Pattern have Total 5 parts: 3 Mandatory & 2 Optional
            Example:- Abc.xyx@gmail.com.in
            "Abc, @gmail, .com" Are mandatory Parts In This Pattern
            ".xyz & .in" Are Optional Part In This Pattern
        */
        String regexEmailId = "^[A-Z a-z 1-9]+([.][A-Z a-z 1-9]+)*@[A-Z a-z]{3,5}+.[a-z]{2,3}+([.][a-z]{2})*$";
        pattern = Pattern.compile(regexEmailId);
        matcher = pattern.matcher(emailId);
        Boolean emailIdIs = matcher.matches();
        System.out.println(emailIdIs);
        if (!emailIdIs){
            System.out.println("Enter Email Id According To Pattern: ^[A-Z a-z 1-9]+([.][A-Z a-z 1-9]+)*@[A-Z a-z]{3,5}+.[a-z]{2,3}+([.][a-z]{2})*$");
        }
    }

    //Created A Method For Phone Number Validation
    public void phoneNumberValidation(){
        System.out.print("Enter Phone Number: ");
        String phoneNumber = Sc.next();
        /*String regexPhoneNumber have 2 parts:
            1st part is for Country Code
            2nd part is for 10-digit number
         */
        String regexPhoneNumber = "^[0-9]{2}[0-9]{10}$";
        pattern = Pattern.compile(regexPhoneNumber);
        matcher = pattern.matcher(phoneNumber);
        Boolean phoneNumberIs = matcher.matches();
        System.out.println(phoneNumberIs);
        if (!phoneNumberIs){
            System.out.println("Enter Email Id According To Pattern: ^[0-9]{2}[0-9]{10}\s$");
        }
    }
    public void passwordValidation(){
        System.out.print("Enter Password: ");
        String password = Sc.next();
        /*String regexPassword have:
            1st part is for Country Code
            2nd part is for 10-digit number
         */
        String regexPassword = "^[A-Z a-z]{8,}$";
        pattern = Pattern.compile(regexPassword);
        matcher = pattern.matcher(password);
        Boolean passwordIs = matcher.matches();
        System.out.println(passwordIs);
        if (!passwordIs){
            System.out.println("Enter Email Id According To Pattern: ^[0-9]{2}[0-9]{10}\s$");
        }
    }
}
