package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Program an application that will roll a pair of dice 100 times
        // Display the value of the two dice each time they are rolled
        // Count how many times the sum of the dice is 2, 4, 6, or 7 are rolled and display result
        // Make a Dice class
        // Add a method named roll() that generates a random number between 1 and 6

        // Create a Dice object
        Dice dice = new Dice();

        // 2, 4, 6, and 7 counters
        int counterTwo = 0;
        int counterFour = 0;
        int counterSix = 0;
        int counterSeven = 0;

        // For loop that roll a pair of dice 100 times
        for (int i = 1; i <= 100; i++) {
            // Roll the dice twice
            int roll1 = dice.roll();
            int roll2 = dice.roll();

            // Display the value of the two dice each time they are rolled
            System.out.println("Roll: " + i);
            System.out.println("Dice 1: " + roll1);
            System.out.println("Dice 2: " + roll2);

            System.out.println();

            int rollTotalSum = roll1 + roll2;

            // Calculate how many times the sum of the dice is 2, 4, 6, or 7
            if (rollTotalSum == 2) {
                counterTwo += 1;
            }
            else if (rollTotalSum == 4) {
                counterFour += 1;
            }
            else if (rollTotalSum == 6) {
                counterSix += 1;
            }
            else if (rollTotalSum == 7) {
                counterSeven += 1;
            }
        }

        // Add the total times their sum were one of those 4 combinations
        int allRollTotalSum = counterTwo + counterFour + counterSix + counterSeven;
        System.out.println("The sum of all of the roll dies that totaled 2, 4, 6, and 7 together is: " + allRollTotalSum);
    }
}