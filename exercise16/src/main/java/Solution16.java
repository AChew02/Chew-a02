/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Adrian Chew
 */

    /*
    print "What is your age?"
    'in' = get input from user
    'userAge' = parseInt('in')
    'legalAge' = 16
    'output' = 'userAge' >= 'legalAge' ? "You are old enough to legally drive." : "You are not old enough to legally drive."
    print "'output'"
    */

import java.util.Scanner;

public class Solution16 {

    private static final Scanner in = new Scanner(System.in);

    public int getIntegerFromUser(String prompt) {
        System.out.println(prompt);
        return Integer.parseInt(in.nextLine());
    }

    public boolean compareAge(int userAge, int legalAge) {
        return userAge >= legalAge;
    }

    public void printOutput(String output) {
        System.out.println(output);
    }

    public static void main(String[] args) {
        Solution16 app = new Solution16();

        final int LEGAL_AGE = 16;

        int userAge = app.getIntegerFromUser("What is your age?");

        String output = app.compareAge(userAge, LEGAL_AGE) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";

        app.printOutput(output);
    }
}
