package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Dice dice = new Dice(); // creating instance of Dice class created

        int roll1;
        int roll2;
        int numOf2 = 0;
        int numOf4 = 0;
        int numOf6 = 0;
        int numOf7 = 0;

        for(int rollNumber = 1; rollNumber < 101; rollNumber++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            int rollTotal = roll1 + roll2;
            System.out.printf("Roll #%d: %d - %d   Sum: %d \n", rollNumber, roll1, roll2, rollTotal);

            if(rollTotal == 2){numOf2++; }
            if(rollTotal == 4){numOf4++; }
            if(rollTotal == 6){numOf6++; }
            if(rollTotal == 7){numOf7++; }

        }

        System.out.println("Total number of 2s: " + numOf2);
        System.out.println("Total number of 4s: " + numOf4);
        System.out.println("Total number of 6s: " + numOf6);
        System.out.println("Total number of 7s: " + numOf7);
    }
}