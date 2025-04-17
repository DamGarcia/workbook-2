package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // prompt User for teams and game score
        System.out.println("Welcome to High Score Wins!");
        System.out.println("Please enter in the game score: Home:Visitor|score:score");
        String gameScore = scanner.nextLine().trim();


        // split teams
        int firstColon = gameScore.indexOf(":");

        String homeTeam = gameScore.substring(0, firstColon);

        int splitPipe = gameScore.indexOf("|");

        String visitorTeam = gameScore.substring(firstColon + 1, splitPipe);



        // split scores and convert the strings into a number
        int secondColon = gameScore.indexOf(":", splitPipe + 1);

        int homeScore = Integer.parseInt(gameScore.substring(splitPipe + 1, secondColon));

        int visitorScore = Integer.parseInt(gameScore.substring(secondColon + 1));



        // determine winning team and display results
        if (homeScore > visitorScore){
            System.out.println(homeTeam + " is the winner! Home Team score: " + homeScore);
        } else {
            System.out.println(visitorTeam + " is the winner! Visitor Team score: " + visitorScore);
        }


    }
}