package com.ps;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PresentValue {
    float monthlyPayOut;
    float expectedInterestPercent;
    float expectedInterestDecimal;
    int payOutYears;
    final double monthsInYear = 12;
    PresentValue(){
        // Receive user input data
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the monthly pay out for the annuity: $");
        this.monthlyPayOut = scanner.nextFloat();
        System.out.print("Now, please enter the expected interest rate: %");
        this.expectedInterestPercent = scanner.nextFloat();
        this.expectedInterestDecimal = this.expectedInterestPercent / 100;
        System.out.print("Finally, please enter the number of years for pay out: ");
        this.payOutYears = scanner.nextInt();
    }
    // Calculate present value of annuity with monthly basis
    public double presentValAnnuity(){
        double monthlyPayNumerator = (1 - Math.pow((1 + (expectedInterestDecimal/monthsInYear)), ((monthsInYear * -1) * payOutYears)));
        double monthlyPayDenominator = expectedInterestDecimal / monthsInYear;
        return monthlyPayOut * (monthlyPayNumerator/monthlyPayDenominator);
    }
    // Print the results in a formatted manner
    public String printMessage(){
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        return String.format("To fund an annuity that pays $" + formatter.format(monthlyPayOut) + " monthly for " + payOutYears +
                " years and earns an expected " + expectedInterestPercent + "%% interest, you would need to invest $" + formatter.format(presentValAnnuity()) + " today.");
    }
}
