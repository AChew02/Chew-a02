/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Adrian Chew
 */

    /*
    print "What is the principal amount?"
    'in' = get input from user
    'principal' = parseDouble('in')
    print "What is the rate?"
    'in' = get input from user
    'interestRate' = parseDouble('in')
    print "What is the number of years?"
    'in' = get input from user
    'numYears' = parseDouble('in')
    print "What is the number of times the interest is compounded per year?"
    'in' = get input from user
    'compoundsPerYear' = parseDouble('in')
    'interestRateActual' = 'interestRate' / 100
    'investmentValue' = 'principle' * Math.pow((1 + 'interestRateActual' / 'compoundsPerYear'), ('compoundsPerYear' * 'numYears'))
    print "$'principle' invested at 'interestRate'% for 'numYears' years compounded 'compoundsPerYear' times per year is $'investmentValue'."
    */

import java.util.Scanner;

public class Solution13 {

    private static final Scanner in = new Scanner(System.in);

    public double getInputFromUser(String prompt) {
        System.out.println(prompt);
        return Double.parseDouble(in.nextLine());
    }

    public double convertPercentage(double percent) {
        return percent/100;
    }

    public double calcInvestmentValue(double principle, double interestRate, double numYears, double compoundsPerYear) {
        return principle * Math.pow(1 + interestRate / compoundsPerYear, compoundsPerYear * numYears);
    }

    public double roundUpCents(double dollars) {
        return Math.ceil(dollars * 100)/100;
    }

    public void printInvestmentValue(double principle, double interestRate, double numYears, double compoundsPerYear , double investmentValue) {
        System.out.printf("$%.2f invested at %.1f%% for %.0f years compounded %.0f times per year is $%.2f.", principle, interestRate, numYears, compoundsPerYear, investmentValue);
    }

    public static void main(String[] args) {
        Solution13 app = new Solution13();

        double principle = app.getInputFromUser("What is the principal amount?");
        double interestRate = app.getInputFromUser("What is the rate?");
        double numYears = app.getInputFromUser("What is the number of years?");
        double compoundsPerYear = app.getInputFromUser("What is the number of times the interest is compounded per year?");

        double interestRateActual = app.convertPercentage(interestRate);
        double investmentValue = app.calcInvestmentValue(principle, interestRateActual, numYears, compoundsPerYear);
        investmentValue = app.roundUpCents(investmentValue);

        app.printInvestmentValue(principle, interestRate, numYears, compoundsPerYear, investmentValue);
    }
}
