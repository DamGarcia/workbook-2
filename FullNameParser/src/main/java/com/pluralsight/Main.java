package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // establish known values
        System.out.print("What is your full name?: ");
        String name = scanner.nextLine().trim();

        // calculate the unknown

        int firstSpaceIndex = name.indexOf(" "); // initialize int variable to hold the index of the first space found

        String firstName = name.substring(0, firstSpaceIndex); // substring (int start, int end)

        int secondSpaceIndex = name.indexOf(" ", firstSpaceIndex + 1);
        // initialize variable to hold the index of the second space found
        // the + 1 starts the index one space after the end of firstSpaceIndex

        String middleName;
        String lastName;


        // conditional statements to check if middle name is empty
        if(secondSpaceIndex >= 0){
            // we have middle and last name

            middleName = name.substring(firstSpaceIndex + 1, secondSpaceIndex);
            // substring returns the value held within the start and ending index provided
            // firstSpaceIndex would be the space after the first name

            lastName = name.substring(secondSpaceIndex + 1);
            // secondSpaceIndex would be the space after the middle name

        }
        else {
            // we only have a last name
            middleName = "(none)";
            lastName = name.substring(firstSpaceIndex + 1);
        }




        // display the results
        System.out.println();
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);


    }
}