package com.ps;

import java.util.Scanner;

public class PresentValue {
    float monthlyPayOut;
    float expectedInterestPercent;
    float expectedInterestDecimal;
    float payOutYears;
    PresentValue(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the monthly pay out for the annuity: $");
        this.monthlyPayOut = scanner.nextFloat();
        System.out.print("Now, please enter the expected interest rate: %");
        this.expectedInterestPercent = scanner.nextFloat();
        this.expectedInterestDecimal = this.expectedInterestPercent / 100;
        System.out.print("Finally, please enter the number of years for pay out: ");
        this.payOutYears = scanner.nextInt();
        scanner.close();
    }
}
