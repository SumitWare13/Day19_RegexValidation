package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationFormatValidationMain {
    public static void main(String[] args) {
        System.out.println("Welcome To User Registration Format Validation Using Regex Program");
        Scanner Sc = new Scanner(System.in);

        UserRegistrationFormatValidation Validate = new UserRegistrationFormatValidation();

        System.out.println("Enter 1 : to Validate First Name ");
        System.out.println("Enter 2 : to Validate Last Name ");

        int choice = 0;
        while (choice == 0) {
            switch (Sc.nextInt()) {
                case 1:
                    Validate.firstNameValidation();
                    break;
                case 2:
                    Validate.lastNameValidation();
                    break;
                default:
                    System.out.println("Enter Valid Choice");
                    choice = 1;
                    break;
            }
        }
    }
}
