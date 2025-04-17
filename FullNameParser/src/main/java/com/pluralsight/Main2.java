package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // establish known values
        System.out.print("What is your full name?: ");
        String name = scanner.nextLine().trim();

        String[] names = name.split(Pattern.quote(" "));

        String firstname = names[0];
        String middlename;
        String lastname;

        if (names.length == 2) {
            middlename = "(none)";
            lastname = names[1];
        } else {
            middlename = names[1];
            lastname = names[2];
        }

        lastname = names[names.length - 1];

        System.out.println();
        System.out.println("First Name: " + firstname);
        System.out.println("Middle Name: " + middlename);
        System.out.println("Last Name: " + lastname);

    }
}
