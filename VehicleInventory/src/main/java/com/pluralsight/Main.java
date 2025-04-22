package com.pluralsight;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // create an array that will hold 20 vehicles
        Vehicle[] garage = new Vehicle[20];

        // create a counter variable that for how many cars are in the array
        int counter = 6;

        // preload the array with 6 vehicle objects
        garage[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500f);
        garage[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000f);
        garage[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700f);
        garage[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500f);
        garage[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500f);
        garage[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000f);

        // nesting everything under a try-catch loop will cover instances the user inputs something incorrectly
        try {
            // create a loop and prompt User for a command within the loop
            System.out.println("What do you want to do?");
            System.out.println("1 - List all vehicles");
            System.out.println("2 - Search by make/model");
            System.out.println("3 - Search by price range");
            System.out.println("4 - Search by color");
            System.out.println("5 - Add a vehicle");
            System.out.println("6 - Quit");

            System.out.print("Enter your command: ");
            int choice = scanner.nextInt(); // initialize variable that will hold the User input
            scanner.nextLine(); // eats the line feed to prepare for nextLine()


            switch (choice) {
                case 1: // list all vehicles
                    Vehicle.listAllVehicles(garage); // calls the method listAllVehicles from the class Vehicle
                    break;

                case 2: // search by make/model
                    // prompt User to input a make/model to search
                    System.out.print("Input car make/model: ");
                    String makeModel = scanner.nextLine();

                    Vehicle.searchMakeModel(garage, makeModel);
                    break;

                case 3: // search by price range
                    // prompt User to input a price range to search - min/max creates the range
                    Vehicle.searchPriceRange(garage, scanner);
                    break;

                case 4: // search by color
                    System.out.print("Input car color to search: ");
                    String carColor = scanner.nextLine();

                    Vehicle.inputCarColor(garage, carColor);
                    break;

                case 5: // add a vehicle
                    counter = Vehicle.addVehicle(garage, counter, scanner);
                    break;

                default: // quit the program
                    System.out.println("Thank you for using Vehicle Inventory");
                    System.exit(0);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a number from the menu.");
        }
        scanner.close();
    }
}