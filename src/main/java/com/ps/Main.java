package com.ps;

public class Main {
    public static void main(String[] args) {
        // Greet the User
        System.out.println("Welcome to the Financial Calculator System!");
        // Calculator One
        MortgageCalculator mortgageCalculator = new MortgageCalculator();
//        // Calculator Two
//        FutureValue futureValue = new FutureValue();
//        // Calculator Three
//        PresentValue presentValue = new PresentValue();
        System.out.println(mortgageCalculator.monthlyPayment());
        System.out.println("No Errors! Successful Execution!");
    }
}