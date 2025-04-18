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

        // --- create new instance of class Person
        // --- call constructor method Person | executing the constructor method
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


//        // --- display full name from both people
//        System.out.println(thePerson.getFullname());
//        System.out.println(theOtherPerson.getFullname());


    //    savePerson(fullname, age, profession);

     // --- the println can compute an overloaded output by calling toString()
     // behind the scenes without physically typing toString()
        System.out.println(thePerson);
        System.out.println(theOtherPerson);

    }

    public static void savePerson(String fullname, int age, String profession) {
        //do the work of saving a person to a database



    }
}