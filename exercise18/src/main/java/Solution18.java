/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Adrian Chew
 */

    /*
    print "Press C to convert from Fahrenheit to Celsius."
    print "Press F to convert from Celsius to Fahrenheit."
    print "Your choice:"
    'tempSystem' = get input from user
    if('tempSystem' == "C")
        'input' = "Please enter the temperature in Fahrenheit:"
        'output' = "The temperature in Celsius is %.1f"
        'formula' = 1
    else
        'input' = "Please enter the temperature in Celsius:"
        'output' = "The temperature in Fahrenheit is %.1f"
        'formula' = 2
    print "'input'"
    'originalTemp' = parseDouble(get input from user)
    if('formula' == 1)
        'convertedTemp' = ('originalTemp' - 32) * 5 / 9
    else 
        'convertedTemp' = ('originalTemp' * 9 / 5) + 32
    print "output", 'convertedTemp'
    */

import java.util.Scanner;

public class Solution18 {

    private static final Scanner in = new Scanner(System.in);

    public double getDoubleFromUser(String prompt) {
        System.out.println(prompt);
        return Double.parseDouble(in.nextLine());
    }

    public boolean checkIfCelsius(String tempSystem) {
        return (tempSystem.equals("C") || tempSystem.equals("c"));
    }

    public void printStatement(String prompt, double temp) {
        System.out.printf(prompt, temp);
    }

    public double convertTemp(int formula, double originalTemp) {
        if(formula == 1) {
            return (originalTemp - 32) * 5 / 9;
        } else {
            return (originalTemp * 9 / 5) + 32;
        }
    }

    public static void main(String[] args) {
        Solution18 app = new Solution18();

        app.printStatement("Press C to convert from Fahrenheit to Celsius.%nPress F to convert from Celsius to Fahrenheit.%nYour choice: ", 1);
        String tempSystem = in.nextLine();

        String input;
        String output;
        int formula;

        if(app.checkIfCelsius(tempSystem)) {
            input = "Please enter the temperature in Fahrenheit:";
            output = "The temperature in Celsius is %.1f";
            formula = 1;
        } else {
            input = "Please enter the temperature in Celsius:";
            output = "The temperature in Fahrenheit is %.1f";
            formula = 2;
        }

        double originalTemp = app.getDoubleFromUser(input);
        double convertedTemp = app.convertTemp(formula, originalTemp);

        System.out.printf(output, convertedTemp);
    }
}
