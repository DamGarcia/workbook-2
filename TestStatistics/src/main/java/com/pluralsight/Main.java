package com.pluralsight;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // create array of 10 test scores print: average, highscore, lowscore
        int[] testScores = {88, 73, 92, 65, 84, 58, 100, 71, 84, 66};

        Arrays.sort(testScores); // sort the list in Ascending order for future calculations within the program
        int highScore = testScores[0]; // this variable will hold the highest score from the array
        int lowScore = testScores[0]; // this variable will hold the lowest score from the array
        int avgScore = 0;
        int sum = 0; // this variable will hold the sum of each array element

        for (int score : testScores) { // for-each score within the array testScores, run the for-each loop
            sum += score; // this will add each element and save in sum
            avgScore = sum / testScores.length; // this will calculate and save the avgScore

            if(score > highScore) highScore = score;
            // while running the for loop, if score is ever greater
            // than highScore, that will be the new value saved

            if(score < lowScore) lowScore = score;
            // if score is ever less than lowScore, that will be the new value saved

            }

        // bonus: display median
        int medianScore = 0; // initializing a variable to hold the medianScore
        int median = testScores.length / 2; // initializing a variable to hold the halfway point in the list

        if(testScores.length % 2 == 0){ // if the length of testScore is even
            medianScore = ((testScores[median - 1] + testScores[median]) / 2); // calculates median score
            // an even list requires to find the average of the two middle scores

        } else { // else if the testScores length is odd, the median is the actual middle number
            medianScore = testScores[median];
        }

        System.out.println(Arrays.toString(testScores)); // converts the array elements into a string
        System.out.println("The average score is: " + avgScore);
        System.out.println("The high score is: " + highScore);
        System.out.println("The low score is: " + lowScore);
        System.out.println("The median score is: " + medianScore);

    }
}