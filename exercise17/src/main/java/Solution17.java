/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Adrian Chew
 */

    /*
    print "Enter a 1 if you are male or a 2 if you are female:"
    'sex' = get input from user
    print "How many ounces of alcohol did you have?"
    'ozAlcohol' = get input from user
    print "What is your weight, in pounds?"
    'weight' = get input from user
    print "How many hours has it been since your last drink?"
    'hoursSinceLastDrink' = get input from user
    'BAC_LIMIT' = 0.08
    if(sex == 1)
        'alcoholDistributionRatio' = 0.73
    else
        'alcoholDistributionRatio' = 0.66
    'userBAC' = ('ozAlcohol' * 5.14 / 'weight' * 'alcoholDistributionRatio') - .015 * 'hoursSinceLastDrink'
    'output' = "It is not legal for you to drive."
    if('userBAC' < 0.08)
        'output' = "It is legal for you to drive."
    print "\nYour BAC is 'userBAC'\n'output'"
    */

import java.util.Scanner;

public class Solution17 {

    private static final Scanner in = new Scanner(System.in);

    public int getValidIntegerFromUser(String prompt) {
        System.out.println(prompt);

        while(!in.hasNextInt()) {
            System.out.println(in.nextLine() + " is not a valid integer");
            System.out.println(prompt);
        }

        return in.nextInt();
    }

    public double getAlcoholDistributionRatio(int sex) {
        if(sex == 1) {
            return 0.73;
        } else {
            return 0.66;
        }
    }

    public double calcBloodAlcoholContent(int ozAlcohol, int weight, double alcoholDistributionRatio, int hoursSinceLastDrink) {
        return (ozAlcohol * 5.14 / weight * alcoholDistributionRatio) - .015 * hoursSinceLastDrink;
    }

    public boolean checkIfLegalBAC(double userBAC, double legalBAC) {
        return userBAC < legalBAC;
    }

    public void printOutput(String output) {
        System.out.println(output);
    }

    public static void main(String[] args) {
        Solution17 app = new Solution17();

        final double BAC_LIMIT = 0.08;

        int sex = app.getValidIntegerFromUser("Enter a 1 is you are male or a 2 if you are female:");
        int ozAlcohol = app.getValidIntegerFromUser("How many ounces of alcohol did you have?");
        int weight = app.getValidIntegerFromUser("What is your weight, in pounds?");
        int hoursSinceLastDrink = app.getValidIntegerFromUser("How many hours has it been since your last drink?");

        double alcoholDistributionRatio = app.getAlcoholDistributionRatio(sex);
        double userBAC = app.calcBloodAlcoholContent(ozAlcohol, weight, alcoholDistributionRatio, hoursSinceLastDrink);

        String output = "It is not legal for you to drive.";
        if(app.checkIfLegalBAC(userBAC, BAC_LIMIT)) {
            output = "It is legal for you to drive.";
        }

        System.out.printf("%nYour BAC is %.6f%n", userBAC);
        app.printOutput(output);
    }
}
