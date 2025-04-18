package com.pluralsight;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CellPhone phone = new CellPhone();

        System.out.println("Serial Number: ");
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




        System.out.println(phone.getSerialNumber());
        System.out.println(phone.getModel());
        System.out.println(phone.getCarrier());
        System.out.println(phone.getPhoneNumber());
        System.out.println(phone.getOwner());




    }
}