package com.ps;

import java.util.Scanner;

public class FutureValue {
    float deposit;
    float interestPercent;
    float interestDecimal;
    float numYears;
    final double daysInYear = 365;

    FutureValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the value of your one time deposit: $");
        this.deposit = scanner.nextFloat();
        System.out.print("Now, please enter the interest rate on this deposit: %");
        this.interestPercent = scanner.nextFloat();
        this.interestDecimal = this.interestPercent / 100;
        System.out.print("Finally, please enter the number of years of accrual: ");
        this.numYears = scanner.nextInt();
        //scanner.close();
    }

    public double futureValAmount() {
        return deposit * Math.pow((1 + (interestDecimal / daysInYear)), (daysInYear * numYears));
    }

    public double totalInterest() {
        return futureValAmount() - deposit;
    }
}
