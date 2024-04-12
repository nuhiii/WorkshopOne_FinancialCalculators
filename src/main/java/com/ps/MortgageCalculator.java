package com.ps;

import java.util.Scanner;

public class MortgageCalculator {
    float principalAmount;
    float interestRate;
    int loanLength;
    MortgageCalculator(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the principal amount for the mortgage: $");
        this.principalAmount = scanner.nextFloat();
        System.out.print("Now please enter the interest rate: %");
        this.interestRate = scanner.nextFloat();
        System.out.print("Finally, please enter the length of the loan in years: ");
        this.loanLength = scanner.nextInt();
        scanner.close();
    }
}
