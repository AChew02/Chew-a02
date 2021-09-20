/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Adrian Chew
 */

    /*
    print "What is the order amount?"
    'in' = get input from user
    'orderAmount' = parseDouble('in')
    print "What is the state?"
    'state' = get input from user
    'taxRate' = .055
    'tax' = 'orderAmount' * 'taxRate'
    'taxTotal' = 'orderAmount' + 'tax'
    'output' = "The total is 'orderAmount'"
    if('state'.equals('WI')) {
        'output' = "The subtotal is $'orderAmount'.%nThe tax is $'tax'.%nThe total is $'taxTotal'."
    }
    print "'output'"
    */

import java.util.Scanner;

public class Solution14 {

    private static final Scanner in = new Scanner(System.in);

    public double getDoubleFromUser(String prompt) {
        System.out.println(prompt);
        return Double.parseDouble(in.nextLine());
    }

    public String getStringFromUser(String prompt) {
        System.out.println(prompt);
        return in.nextLine();
    }

    public double calcTax(double taxRate, double orderAmount) {
        return orderAmount * taxRate;
    }

    public double calcTaxTotal(double orderAmount, double tax) {
        return orderAmount + tax;
    }

    public double roundUpCents(double dollars) {
        return Math.ceil(dollars * 100)/100;
    }

    public void printOutput(double orderAmount, double tax, double taxTotal, String output) {
        System.out.printf(output, orderAmount, tax, taxTotal);
    }

    public static void main(String[] args) {
        Solution14 app = new Solution14();

        final double WI_TAX_RATE = .055;

        double orderAmount = app.getDoubleFromUser("What is the order amount?");
        String state = app.getStringFromUser("What is the state?");

        double tax = app.calcTax(orderAmount, WI_TAX_RATE);
        double taxTotal = app.calcTaxTotal(orderAmount, tax);
        taxTotal = app.roundUpCents(taxTotal);

        String output = "The total is %.2f";

        if(state.equals("WI")){
            output = "The subtotal is $%.2f.%nThe tax is $%.2f.%nThe total is $%.2f.";
        }

        app.printOutput(orderAmount, tax, taxTotal, output);
    }
}
