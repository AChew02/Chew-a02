/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Adrian Chew
 */

    /*
    print "What is the length of the room in feet?"
    'in' = get input from user
    'length' = parseInt('in')
    print "What is the width of the room in feet?"
    'in' = get input from user
    'width' = parseInt('in')
    print "You entered dimensions of 'length' feet by 'width' feet."
    'conversionFactor' = 350
    'sqFeet' = 'length' * 'width'
    'numGallons' = Math.ceil('sqFeet' / 'conversionFactor')
    print "You will need to purchase 'numGallons' gallons of paint to cover 'sqFeet' square feet."
    */

import java.util.Scanner;

public class Solution09 {

    private static final Scanner in = new Scanner(System.in);

    public int getInputFromUser(String prompt) {
        System.out.println(prompt);
        return Integer.parseInt(in.nextLine());
    }

    public void printRoomDimensions(int length, int width) {
        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");
    }

    public int calcSqFeet(int length, int width) {
        return length * width;
    }

    public int calcNumGallons(int sqFeet, double conversionFactor) {
        return (int) Math.ceil(sqFeet / conversionFactor);
    }

    public void printGallonsNeeded(int numGallons, int sqFeet) {
        System.out.println("You will need to purchase " + numGallons + " gallons of paint to cover " + sqFeet + " square feet.");
    }

    public static void main(String[] args) {
        Solution09 app = new Solution09();

        final double SQFEET_PER_GALLON = 350;

        int length = app.getInputFromUser("What is the length of the room in feet?");
        int width = app.getInputFromUser("What is the width of the room in feet?");
        app.printRoomDimensions(length, width);

        int sqFeet = app.calcSqFeet(length, width);
        int numGallons = app.calcNumGallons(sqFeet, SQFEET_PER_GALLON);

        app.printGallonsNeeded(numGallons, sqFeet);
    }
}