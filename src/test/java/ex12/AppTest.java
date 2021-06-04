/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */

package ex12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_string_includes_years_rate_and_total() {
        App myApp = new App();

        int numYears = 4;
        double rate = .043;
        double calculation = 1500 * (1 + numYears * rate);
        String investment = String.format("$%.2f", calculation);

        String expectedOutput = "After 4 years at 4.3%, the investment will be worth $1758.";

        String actualOutput = myApp.generateString(numYears, rate, investment);
    }
}