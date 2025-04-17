package com.pluralsight;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in) ;

    public static void main(String[] args) {

        System.out.println("Welcome to the Full Name Generator");

        // prompt User to input parts of their full name
        System.out.print("Please enter your first name: ");
        String firstName = scanner.nextLine().trim();

        System.out.print("Please enter your middle name: ");
        String middleName = scanner.nextLine().trim();

        System.out.print("What is your last name?: ");
        String lastName = scanner.nextLine().trim();

        System.out.print("Please add a suffix (if applicable): ");
        String suffix = scanner.nextLine().trim();

        // create variable to hold the full name
        String fullName;

        // create conditions to check for User input / only checking if middle name or suffix is empty
        if (middleName.isBlank()) { // the .isBlank() method works better than .isEmpty() for what is being asked
            fullName = firstName + " " + lastName;
        } else {
//            fullName = String.format("%s %s %s", firstName, middleName, lastName); // this format doesn't necessarily add to readability
            fullName = firstName + " " + middleName + " " + lastName;
        }

        if(!suffix.isBlank()){
            fullName += ", " + suffix;
        }

        // print the full name User provided
        System.out.println("You have entered the name: " + fullName);
    }
}