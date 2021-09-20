/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Adrian Chew
 */

    /*
    print "How many people?"
    'in' = get input from user
    'numPeople' = parseInt('in')
    print "How many pizzas do you have?"
    'in' = get input from user
    'numPizzas' = parseInt('in')
    print "How many slices per pizza?"
    'in' = get input from user
    'slicesPerPizza' = parseInt('in')
    'numSlices' = 'numPizzas' * 'slicesPerPizza'
    print "'numPeople' people with 'numPizzas' pizzas ('numSlices' slices)"
    'extraSlices' = 'numSlices' % 'numPeople'
    'slicesPerPerson' = 'numSlices' / 'numPeople'
    print "Each person gets 'slicesPerPerson' pieces of pizza.\nThere are 'extraSlices' leftover pieces."
     */

import java.util.Scanner;

public class Solution08 {

    private static final Scanner in = new Scanner(System.in);

    public int getInputFromUser(String prompt) {
        System.out.println(prompt);
        return Integer.parseInt(in.nextLine());
    }

    public int calcNumSlices(int numPizzas, int slicesPerPizza) {
        return numPizzas * slicesPerPizza;
    }

    public void printSlices(int numPeople, int numPizzas, int numSlices) {
        System.out.println(numPeople + " people with " + numPizzas + " pizzas (" + numSlices + " slices)");
    }

    public int calcExtraSlices(int numSlices, int numPeople) {
        return numSlices % numPeople;
    }

    public int calcSlicesPerPerson(int numSlices, int numPeople) {
        return numSlices / numPeople;
    }

    public void printSlicesPerPersonAndExtra(int slicesPerPerson, int extraSlices) {
        System.out.println("Each person gets " + slicesPerPerson + " pieces of pizza.\nThere are " + extraSlices + " leftover pieces.");
    }

    public static void main(String[] args) {
        Solution08 app = new Solution08();

        int numPeople = app.getInputFromUser("How many people?");
        int numPizzas = app.getInputFromUser("How many pizzas do you have?");
        int slicesPerPizza = app.getInputFromUser("How many slices per pizza?");

        int numSlices = app.calcNumSlices(numPizzas, slicesPerPizza);
        app.printSlices(numPeople, numPizzas, numSlices);

        int extraSlices = app.calcExtraSlices(numSlices, numPeople);
        int slicesPerPerson = app.calcSlicesPerPerson(numSlices, numPeople);

        app.printSlicesPerPersonAndExtra(slicesPerPerson, extraSlices);
    }
}
