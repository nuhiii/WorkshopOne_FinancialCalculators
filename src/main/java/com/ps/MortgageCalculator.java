package com.ps;

import java.util.Scanner;

public class MortgageCalculator {
    float principalAmount;
    float interestPercent;
    float interestDecimal;
    float loanLength;
    final double monthInYear = 12;
    MortgageCalculator(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the principal amount for the mortgage: $");
        this.principalAmount = scanner.nextFloat();
        System.out.print("Now, please enter the interest rate: %");
        this.interestPercent = scanner.nextFloat();
        this.interestDecimal = this.interestPercent/100;
        System.out.print("Finally, please enter the length of the loan in years: ");
        this.loanLength = scanner.nextInt();
        //scanner.close();
    }
    public double monthlyPayment(){
        double monthlyPayNumerator = principalAmount * (interestDecimal/monthInYear);
        //System.out.println(monthlyPayNumerator);
        double monthlyPayDenominator = 1 - (Math.pow((1 + (interestDecimal/monthInYear)), ((monthInYear*-1) * loanLength)));
        //System.out.println(monthlyPayDenominator);
        return monthlyPayNumerator/monthlyPayDenominator;
    }
    public double totalInterest(){
        //double totalPayments = monthlyPayment() * (monthInYear * loanLength);
        return (monthlyPayment() * (monthInYear * loanLength)) - principalAmount;
    }
}
