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


        String investment = myApp.calculateInvestment(1500, .043, 4);

        String expectedOutput = "After 4 years at 4.3%, the investment will be worth $1758.";

        String actualOutput = myApp.generateString(4, .043, investment);

        assertEquals(expectedOutput, actualOutput);
    }
}