package com.pluralsight;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // --- creating new instance of CellPhone
        CellPhone phone = new CellPhone();


        // --- prompting User to provide cell phone information
        System.out.println("Serial Number: ");
        // --- after User input, following code sets
        // --- User input is set within the variable (phone.set...)
        phone.setSerialNumber(Integer.parseInt(scanner.nextLine()));

        System.out.println("Model: ");
        String model = scanner.nextLine();
        phone.setModel(model);


        System.out.println("Carrier: ");
        String carrier = scanner.nextLine();
        phone.setCarrier(carrier);

        System.out.println("Phone Number: ");
        String phoneNumber = scanner.nextLine();
        phone.setPhoneNumber(phoneNumber);

        System.out.println("Owner: ");
        String owner = scanner.nextLine();
        phone.setOwner(owner);



        // --- retrieves the values provided (phone.get...) and displays
        System.out.println(phone.getSerialNumber());
        System.out.println(phone.getModel());
        System.out.println(phone.getCarrier());
        System.out.println(phone.getPhoneNumber());
        System.out.println(phone.getOwner());


        phone.dial("222-2cute-4u");
        phone.dial("888-2cake-fake");

    }
}