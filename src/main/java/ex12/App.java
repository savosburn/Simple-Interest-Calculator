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
        int numYears = myApp.readYears();

        String investment = myApp.calculateInvestment(principal, rate, numYears);

        String outputString = myApp.generateString(numYears, rate, investment);
        myApp.output(outputString);
    }

    public double readPrincipal() {
        System.out.print("Enter the principal: ");
        return in.nextDouble();
    }

    public double readRate() {
        System.out.print("Enter the rate of interest: ");
        return in.nextDouble() / 100;
    }

    public int readYears() {
        System.out.print("Enter the number of years: ");
        return in.nextInt();
    }

    public String calculateInvestment(double principal, double rate, double time) {
        DecimalFormat df = new DecimalFormat("'$'#.##");
        return df.format(principal * (1 + rate * time));
    }

    public String generateString(int numYears, double rate, String investment) {
        return String.format("After %d years at %.1f%%, the investment will be worth %s.", numYears, rate * 100, investment);
    }

    public void output(String outputString) {
        System.out.println(outputString);
    }
}
