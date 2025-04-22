package com.pluralsight;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Vehicle {

    // create the data members to the Vehicle class to determine how the object Vehicle works
    private long vehicleID;
    private String makeModel;
    private String color;
    private int odometerReading;
    private float price;

    public Vehicle(long vehicleID, String makeModel, String color, int odometerReading, float price){
        // creating a constructor method to make a new Vehicle object
        this.vehicleID = vehicleID; // takes the variable and saves the value given within the object
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }

    // create a method that prints each element of a vehicle within the garage array
    public static void listAllVehicles(Vehicle[] garage){
        System.out.println("These are the vehicles available: \n"); // print statement with \n escape to ensure following prints are on new line

        for (Vehicle vehicle : garage) {
            if (vehicle != null) { // checks if the value within an element of garage will be null
                System.out.println(vehicle); // print statement that displays each stored element

            }
        }
    }

    public static void searchMakeModel(Vehicle[] garage, String makeModel){
        // loop through list to check User input and array list
        boolean found = false; // boolean that will track whether something is found
        for (Vehicle car : garage)  // for each instance of object Vehicle within the garage array
            // it is temp stored in the car variable
            if (car != null && car.getMakeModel().equalsIgnoreCase(makeModel)) {
                // checks for null case and searches through vehicle method getMakeModel()
                // while ignoring case sensitivity to see if userInput is a match
                if (!found) { // prints a header message for the first time a match is found
                    System.out.println("This is what we found: " + car);
                }
                found = true; // when if statement returns true, the boolean is now true
            }
        if (!found) { // will only run if no matches were found and the boolean is still false
            System.out.println("No match under " + makeModel + " was found.");
        }
    }


    public static void searchPriceRange(Vehicle[] garage, Scanner scanner) {
        try { // try-catch statement to catch unexpected input
            System.out.print("Enter min price: ");
            float minPrice = scanner.nextFloat();

            System.out.print("Enter max price: ");
            float maxPrice = scanner.nextFloat();
            scanner.nextLine(); // eats line feed

            if (minPrice > maxPrice){ // validates whether minPrice is greater than maxPrice
                // and exits the method if true
                System.out.println("Invalid range. min price must be less than max price");
                return;
            }

            boolean found = false;
            for (Vehicle car : garage) {
                if (car != null) {
                    float price = car.getPrice();
                    if (price >= minPrice && price <= maxPrice) {
                        if (!found) {
                            System.out.println("This is what we found: ");
                            found = true;
                        }
                    System.out.println(car);
                    }
                }
            }
            if (!found) {
                System.out.println("No vehicles within that price range found");
                }
        } catch (InputMismatchException e){
            System.out.println("Invalid input. Input numeric value for price");
            scanner.nextLine(); // clears invalid input
        }
    }

    public static void inputCarColor(Vehicle[] garage, String carColor) {
            boolean found = false;
            for (Vehicle car : garage) {
                if (car != null && car.getColor().equalsIgnoreCase(carColor)) {
                    if (!found) {
                        System.out.println("This is what we found: ");
                    }
                    System.out.println(car);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No vehicles with that color found");
            }
    }

    public static int addVehicle(Vehicle[] garage, int counter, Scanner scanner){
        // this method returns as an int because addVehicle meant to change the counter
        // for the # of cars in the garage array
        if (counter >= garage.length){ // checks if there is space within the array
            System.out.println("Garage is at max capacity.");
            return counter;
        }

        try { // try-catch statement to catch unexpected input
            System.out.println("Input the following information: ");
            System.out.print("Add vehicle ID: ");
            long vehicleID = scanner.nextLong();
            scanner.nextLine();

            System.out.print("Add make and model: ");
            String makeModel = scanner.nextLine();

            System.out.print("Add car color: ");
            String color = scanner.nextLine();

            System.out.print("Add odometer reading: ");
            int odometerReading = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Add price of vehicle: ");
            float price = scanner.nextFloat();

            Vehicle newVehicle = new Vehicle(vehicleID, makeModel, color, odometerReading, price);

            // adding new Vehicle instance to array
            garage[counter] = newVehicle;
            counter++;

            System.out.println("New car added successfully!");

            // confirming new car data
            Vehicle.listAllVehicles(garage);
            return counter + 1;
        } catch (InputMismatchException e){
            System.out.println("Invalid entry. Vehicle not added");
            scanner.nextLine(); // clears invalid input
            return counter;
        }
    }

    // each following getter/setter is a property that can be called on the object instance of Vehicle
    public long getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(long vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String toString(){
        return String.format("%d, %s, %s, %d, %f", vehicleID, makeModel, color, odometerReading, price);
    }
}


