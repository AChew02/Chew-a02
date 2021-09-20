/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Adrian Chew
 */

    /*
    print "How many euros are you exchanging?"
    'in' = get input from user
    'euros' = parseDouble('in')
    print "What is the exchange rate?"
    'in' = get input from user
    'exchangeRate' = parseDouble('in')
    'dollars' = 'euros' * 'exchangeRate'
    print "'euros' euros at an exchange rate of 'exchangeRate' is\n'dollars' U.S. dollars."
    */

import java.util.Scanner;

public class Solution11 {

    private static final Scanner in = new Scanner(System.in);

    public double getInputFromUser(String prompt) {
        System.out.println(prompt);
        return Double.parseDouble(in.nextLine());
    }

    public double convertEurosToDollars(double euros, double exchangeRate) {
        return euros * exchangeRate;
    }

    public double roundUpCents(double dollars) {
        return Math.ceil(dollars * 100)/100;
    }

    public void printDollars(double euros, double exchangeRate, double dollars) {
        System.out.printf("%.0f euros at an exchange rate of %.4f is%n%.2f U.S. dollars.", euros, exchangeRate, dollars);
    }

    public static void main(String[] args) {
        Solution11 app = new Solution11();

        double euros = app.getInputFromUser("How many euros are you exchanging?");
        double exchangeRate = app.getInputFromUser("What is the exchange rate?");
        double dollars = app.convertEurosToDollars(euros, exchangeRate);
        dollars = app.roundUpCents(dollars);

        app.printDollars(euros, exchangeRate, dollars);
    }
}
