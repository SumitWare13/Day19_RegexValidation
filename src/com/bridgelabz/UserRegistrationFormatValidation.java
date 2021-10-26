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
            one capital letter
            Minimum 3 characters
        */
        String regexFirstName = "^[A-Z]{1}[a-z]{2,}";
        pattern = Pattern.compile(regexFirstName);
        matcher = pattern.matcher(firstName);
        Boolean firstNameIs = matcher.matches();
        System.out.println(firstNameIs);
        if (!firstNameIs){
            System.out.print("Enter Name According To Pattern: [A-Z]{1}+[a-z]{2,}");
        }
    }
}
