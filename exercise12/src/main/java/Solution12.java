/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Adrian Chew
 */

    /*
    print "Enter the principal:"
    'in' = get input from user
    'principal' = parseDouble('in')
    print "Enter the rate of interest:"
    'in' = get input from user
    'interestRate' = parseDouble('in')
    print "Enter the number of years:"
    'in' = get input from user
    'numYears' = parseDouble('in')
    'interestRateActual' = 'interestRate' / 100
    'investmentValue' = 'principle'(1 + 'interestRateActual' * 'numYears')
    print "After 'numYears' years at 'interestRate'%, the investment will be worth $'investmentValue'."
    */

import java.util.Scanner;

public class Solution12 {

    private static final Scanner in = new Scanner(System.in);

    public double getInputFromUser(String prompt) {
        System.out.println(prompt);
        return Double.parseDouble(in.nextLine());
    }

    public double convertPercentage(double percent) {
        return percent/100;
    }

    public double calcInvestmentValue(double principle, double interestRate, double numYears) {
        return principle * (1 + interestRate * numYears);
    }

    public double roundUpCents(double dollars) {
        return Math.ceil(dollars * 100)/100;
    }

    public void printInvestmentValue(double numYears, double interestRate, double investmentValue) {
        System.out.printf("After %.0f years at %.1f%%, the investment will be worth $%.2f.", numYears, interestRate, investmentValue);
    }

    public static void main(String[] args) {
        Solution12 app = new Solution12();

        double principle = app.getInputFromUser("Enter the principal:");
        double interestRate = app.getInputFromUser("Enter the rate of interest:");
        double numYears = app.getInputFromUser("Enter the number of years:");

        double interestRateActual = app.convertPercentage(interestRate);
        double investmentValue = app.calcInvestmentValue(principle, interestRateActual, numYears);
        investmentValue = app.roundUpCents(investmentValue);

        app.printInvestmentValue(numYears, interestRate, investmentValue);
    }
}
