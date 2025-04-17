package com.pluralsight;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // prompt User for full name
        System.out.println("Welcome to Theater Reservations");
        System.out.println("Please enter your full name");
        String name = scanner.nextLine().trim();

        // split first and last name
        String[] fullName = name.split(Pattern.quote(" "));
        String firstName = fullName[0];
        String lastName = fullName[fullName.length - 1];


        // prompt User for date of show
        System.out.println("Please enter the date of show: MM/dd/yyyy");
        String date = scanner.nextLine().trim();


        // defines input and output formatters for the date
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // initialize variable to use outside the try-catch block
        String outputDate;

        try {
            // parse the input date
            LocalDate inputDate = LocalDate.parse(date, inputFormatter);

            // format and print the output date
            outputDate = inputDate.format(outputFormatter);
        } catch(DateTimeParseException exception) { // the catch block needs an exception parameter to pass
            System.out.println("Invalid date format. Please use MM/dd/yyyy");
            return;
        }



        // prompt User for the number of tickets
        System.out.print("Please enter the number of tickets needed: ");
        int numTickets = scanner.nextInt();

        // ticket confirmation singular or plural
        String tickets = (numTickets < 1) ? "ticket" : "tickets";


        // display confirmation message to User - #ticket(s) reserved for (date) under (LastName, FirstName)
        System.out.printf("%d %s reserved for %s under %s, %s",
                numTickets,
                tickets,
                outputDate,
                lastName,
                firstName
        );
    }
}