/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Adrian Chew
 */

    /*
    print "Enter new username:"
    'knownUser' = get input from user
    print "Enter new password:"
    'knownPassword' = get input from user
    print "New user created"
    print "What is your username?"
    'attemptedUsername' = get input from user
    print "What is your password?"
    'attemptedPassword' = get input from user
    'output' = "I don't know you."
    if(knownPassword.equals(attemptedPassword))
        'output' = "Welcome!"
    print "'output'"
    */

import java.util.Scanner;

public class Solution15 {

    private static final Scanner in = new Scanner(System.in);

    public String getStringFromUser(String prompt) {
        System.out.println(prompt);
        return in.nextLine();
    }

    public boolean compareString(String s1, String s2) {
        return s1.equals(s2);
    }

    public void printOutput(String output) {
        System.out.println(output);
    }

    public static void main(String[] args) {
        Solution15 app = new Solution15();

        String knownUser = app.getStringFromUser("Enter new username:");
        String knownPassword = app.getStringFromUser("Enter new password:");

        app.printOutput("New user created.");

        String attemptedUsername = app.getStringFromUser("What is the username?");
        String attemptedPassword = app.getStringFromUser("What is the password?");

        String output = "I don't know you.";

        if(app.compareString(knownUser, attemptedUsername) && app.compareString(knownPassword, attemptedPassword)) {
            output = "Welcome!";
        }

        app.printOutput(output);
    }
}
