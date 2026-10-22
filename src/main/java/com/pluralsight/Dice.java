package com.pluralsight;

public class Dice {
    public int roll() {

        // Minimum value of 1
        int minValue = 1;

        // Maximum value of 6
        int maxValue = 6;

        // Generate a random number between 1 and 6
        int randomNumber = (int)(Math.random() * (maxValue - minValue + 1)) + minValue;

        // Return randomNumber
        return randomNumber;
    }
}
