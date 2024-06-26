package com.ps;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MortgageCalculator {
    float principalAmount;
    float interestPercent;
    float interestDecimal;
    int loanLength;
    final double monthInYear = 12;
    MortgageCalculator(){
        // Receive user input data
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Please enter the principal amount for the mortgage: $");
            this.principalAmount = scanner.nextFloat();
        }
        catch(Exception e){
            System.out.println("Please enter a valid number!");
        }
        try {
            System.out.print("Now, please enter the interest rate: %");
            this.interestPercent = scanner.nextFloat();
            this.interestDecimal = this.interestPercent / 100;
        }
        catch(Exception e){
            System.out.println("Please enter a valid number!");
        }
        try {
            System.out.print("Finally, please enter the length of the loan in years: ");
            this.loanLength = scanner.nextInt();
        }
        catch(Exception e){
            System.out.println("Please enter a valid integer!");
        }
    }
    // Calculate monthly mortgage payment
    public double monthlyPayment(){
        double monthlyPayNumerator = principalAmount * (interestDecimal/monthInYear);
        double monthlyPayDenominator = 1 - (Math.pow((1 + (interestDecimal/monthInYear)), ((monthInYear*-1) * loanLength)));
        return monthlyPayNumerator/monthlyPayDenominator;
    }
    // Calculate total interest accrued over life of loan
    public double totalInterest(){
        return (monthlyPayment() * (monthInYear * loanLength)) - principalAmount;
    }
    // Print the results in a formatted manner
    public String printMessage(){
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        return String.format("A $" + formatter.format(principalAmount) + " loan at " + interestPercent + "%% interest for " + loanLength + " years " +
                "would have a $" + formatter.format(monthlyPayment()) + "/mo payment with a total interest of $" + formatter.format(totalInterest()) + ".");
    }
}
