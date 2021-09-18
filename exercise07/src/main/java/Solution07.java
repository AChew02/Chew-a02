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
    'conversionFactor' = 0.09290304
    'sqFeet' = 'length' * 'width'
    'sqMeters' = 'sqFeet' * 'conversionFactor'
    print "The area is\n 'sqFeet' square feet\n 'sqMeters' square meters"
     */

import java.util.Scanner;

public class Solution07 {

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

    public double convertSqFeetToSqMeters(int sqFeet, double conversionFactor) {
        return sqFeet * conversionFactor;
    }

    public void printArea(int sqFeet, double sqMeters) {
        System.out.printf("The area is%n%d square feet%n%.3f square meters", sqFeet, sqMeters);
    }

    public static void main(String[] args) {
        Solution07 app = new Solution07();

        final double SQFEET_IN_SQMETER = 0.09290304;

        int length = app.getInputFromUser("What is the length of the room in feet?");
        int width = app.getInputFromUser("What is the width of the room in feet?");
        app.printRoomDimensions(length, width);

        int sqFeet = app.calcSqFeet(length, width);
        double sqMeters = app.convertSqFeetToSqMeters(sqFeet, SQFEET_IN_SQMETER);
        app.printArea(sqFeet, sqMeters);
    }
}
