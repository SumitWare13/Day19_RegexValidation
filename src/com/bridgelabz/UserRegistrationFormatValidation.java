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
}
