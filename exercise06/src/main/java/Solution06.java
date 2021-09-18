 /*
  *  UCF COP3330 Fall 2021 Assignment 2 Solution
  *  Copyright 2021 Adrian Chew
  */

    /*
    print "What is your current age?"
    'in' = get input from user
    'currAge' = parseInt('in')
    print "At what age would you like to retire?"
    'in' = get input from user
    'retireAge' = parseInt('in')
    'yearsTillRetirement' = 'retireAge' - 'currAge'
    'currYear' = Year.now().getValue()
    'retirementYear' = 'currYear' + 'yearsTillRetirement'
    print "It's 'currYear', so you can retire in 'retirementYear'."
     */

import java.time.Year;
import java.util.Scanner;

public class Solution06 {

    private static final Scanner in = new Scanner(System.in);

    public int getInputFromUser(String prompt) {
        System.out.println(prompt);
        return Integer.parseInt(in.nextLine());
    }

    public int getCurrentYear() {
        return Year.now().getValue();
    }

    public int calcYearsTillRetirement(int currentAge, int retirementAge) {
        return retirementAge - currentAge;
    }

    public int calcRetirementYear(int currentYear, int yearsTillRetirement) {
        return currentYear + yearsTillRetirement;
    }

    public void printWhenCanRetire(int currYear, int retirementYear) {
        System.out.println("It's " + currYear + ", so you can retire in " + retirementYear + ".");
    }

    public static void main(String[] args) {
        Solution06 app = new Solution06();

        int currAge = app.getInputFromUser("What is your current age?");
        int retireAge = app.getInputFromUser("At what age would you like to retire?");
        int currYear = app.getCurrentYear();
        int yearsTillRetirement = app.calcYearsTillRetirement(currAge, retireAge);
        int retireYear = app.calcRetirementYear(currYear, yearsTillRetirement);

        app.printWhenCanRetire(currYear, retireYear);
    }
}
