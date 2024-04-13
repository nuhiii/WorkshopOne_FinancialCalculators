package com.ps;

import java.text.DecimalFormat;
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
    }
    public double monthlyPayment(){
        double monthlyPayNumerator = principalAmount * (interestDecimal/monthInYear);
        double monthlyPayDenominator = 1 - (Math.pow((1 + (interestDecimal/monthInYear)), ((monthInYear*-1) * loanLength)));
        return monthlyPayNumerator/monthlyPayDenominator;
    }
    public double totalInterest(){
        return (monthlyPayment() * (monthInYear * loanLength)) - principalAmount;
    }
    public String printMessage(){
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        return String.format("A $" + formatter.format(principalAmount) + " loan at " + interestPercent + "%% interest for " + loanLength + " years " +
                        "would have a $" + formatter.format(monthlyPayment()) + "/mo payment with a total interest of $" + formatter.format(totalInterest()) + ".");
    }
}
