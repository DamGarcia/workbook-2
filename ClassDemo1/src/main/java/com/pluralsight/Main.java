package com.pluralsight;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        String fullname;
        int age;
        String profession;

        // --- First Person data
        // --- utilizing the blueprint to create the person
        System.out.print("What is the person's full name: ");
        fullname = scanner.nextLine();

        System.out.print("What is the person's age: ");
        age = scanner.nextInt();
        scanner.nextLine(); // clear the CRLF

        System.out.print("What is the person's profession: ");
        profession = scanner.nextLine();

        // --- creates a new instance of the class Person
        // --- calls the constructor method Person | executing the constructor method
        Person thePerson = new Person(fullname, age, profession);


        // --- Second Person data
        System.out.print("What is the person's full name: ");
        fullname = scanner.nextLine();

        System.out.print("What is the person's age: ");
        age = scanner.nextInt();
        scanner.nextLine(); // clear the CRLF

        System.out.print("What is the person's profession: ");
        profession = scanner.nextLine();

        // --- creates another new instance of the class Person
        // --- the 'new' keyword calls the instructor
        Person theOtherPerson = new Person(fullname, age,profession);


        // --- display full name from both people
        System.out.println(thePerson.getFullname());
        System.out.println(theOtherPerson.getFullname());

        // --- calling the methods created within this class
        displayPerson(thePerson);
        displayPerson(theOtherPerson);

    //    savePerson(fullname, age, profession);



    }

    public static void displayPerson(Person person) {
        System.out.printf("Person %s is a %s and is %d years old. \n"
                , person.getFullname()
                , person.getProfession()
                , person.getAge()
        );
    }

    public static void savePerson(String fullname, int age, String profession) {
        //do the work of saving a person to a database



    }
}