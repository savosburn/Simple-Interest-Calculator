/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */

package ex12;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        double principal = myApp.readPrincipal();
        double rate = myApp.readRate();
        double numYears = myApp.readYears();

        String investment = myApp.calculateInvestment(principal, rate, numYears);

        String outputString = myApp.generateString(numYears, rate, investment);
        myApp.output(outputString);
    }

    public double readPrincipal() {
        System.out.print("Enter the principal: ");

        // User can only enter number
        while (!in.hasNextDouble()) {
            System.out.print("Invalid amount. Enter again: ");
            in.next();
        }

        return in.nextDouble();
    }

    public double readRate() {
        System.out.print("Enter the rate of interest: ");

        // User can only enter number
        while (!in.hasNextDouble()) {
            System.out.print("Invalid rate. Enter again: ");
            in.next();
        }

        return in.nextDouble() / 100;
    }

    public double readYears() {
        System.out.print("Enter the number of years: ");

        // User can only enter number
        while (!in.hasNextDouble()) {
            System.out.print("Invalid number. Enter again: ");
            in.next();
        }

        return in.nextDouble();
    }

    public String calculateInvestment(double principal, double rate, double time) {
        DecimalFormat df = new DecimalFormat("'$'#.##");
        return df.format(principal * (1 + rate * time));
    }

    public String generateString(double numYears, double rate, String investment) {
        int newYears;
        String years = Double.toString(numYears);

        if (numYears % 1 == 0) {
            newYears = (int) numYears;
            years = String.format("%d", newYears);
        }

        return String.format("After %s years at %.1f%%, the investment will be worth %s.", years, rate * 100, investment);
    }

    public void output(String outputString) {
        System.out.println(outputString);
    }
}
