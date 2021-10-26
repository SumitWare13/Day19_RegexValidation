package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationFormatValidationMain {
    public static void main(String[] args) {
        System.out.println("Welcome To User Registration Format Validation Using Regex Program");
        UserRegistrationFormatValidation Validate = new UserRegistrationFormatValidation();
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter 1 : to validate First Name ");
        switch (Sc.nextInt()){
            case 1:
                Validate.firstNameValidation();
                break;
        }
    }
}
