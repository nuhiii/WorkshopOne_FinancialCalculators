package com.ps;

public class Main {
    public static void main(String[] args) {
        // Greet the User
        System.out.println("Welcome to the Financial Calculator System!");
        // Calculator One
        //MortgageCalculator mortgageCalculator = new MortgageCalculator();
        //System.out.println(mortgageCalculator.monthlyPayment());
        //System.out.println(mortgageCalculator.totalInterest());
        // Calculator Two
        FutureValue futureValue = new FutureValue();
        System.out.println(futureValue.futureValAmount());
//        // Calculator Three
//        PresentValue presentValue = new PresentValue();
        System.out.println("No Errors! Successful Execution!");
    }
}