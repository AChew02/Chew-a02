/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Adrian Chew
 */

    /*
    forLoop counter=1; counter <=3; counter++
        print "Enter the price of item 1:"
        'in' = get input from user
        'price' = parseDouble('in')
        print "Enter the quantity of item 1:"
        'in' = get input from user
        'count' = parseDouble('in')
        'subTotal' += price * count
    'taxRate' = .055
    'tax' = 'subtotal' * 'taxRate'
    'total' = 'subTotal' + 'tax'
    print "Subtotal: 'subTotal'\nTax: 'tax'\nTotal: 'total'"
    */

import java.util.Scanner;

public class Solution10 {

    private static final Scanner in = new Scanner(System.in);

    public double getInputFromUser(String prompt) {
        System.out.println(prompt);
        return Double.parseDouble(in.nextLine());
    }

    public double calcSubTotal(double subTotal, double price, double count) {
        subTotal += price * count;
        return subTotal;
    }

    public double calcTax(double subTotal, double taxRate) {
        return subTotal * taxRate;
    }

    public double calcTotal(double subTotal, double tax){
        return subTotal + tax;
    }

    public void printTotal(double subTotal, double tax, double total) {
        System.out.printf("Subtotal: %.2f%nTax: %.2f%nTotal: %.2f", subTotal, tax, total);
    }

    public static void main(String[] args) {
        Solution10 app = new Solution10();

        final double TAX_RATE = .055;

        double subTotal = 0;
        double price;
        double count;

        for(int counter = 1; counter <=3; counter++) {
            price = app.getInputFromUser("Enter the price of item " + counter + ":");
            count = app.getInputFromUser("Enter the quantity of item " + counter + ":");
            subTotal = app.calcSubTotal(subTotal, price, count);
        }

        double tax = app.calcTax(subTotal, TAX_RATE);
        double total = app.calcTotal(subTotal, tax);

        app.printTotal(subTotal, tax, total);
    }
}
