package com.ps;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Greet the User
        System.out.println("Welcome to the Financial Calculator System!");
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.print("Enter 1 for Mortgage calculator, 2 for Future Value, 3 for Present Value, or any other key to quit: ");
            choice = scanner.nextLine();
            switch (choice){
                case "1":
                    // Calculator One
                    MortgageCalculator mortgageCalculator = new MortgageCalculator();
                    System.out.println(mortgageCalculator.monthlyPayment());
                    System.out.println(mortgageCalculator.totalInterest());
                    break;
                case "2":
                    // Calculator Two
                    FutureValue futureValue = new FutureValue();
                    System.out.println(futureValue.futureValAmount());
                    System.out.println(futureValue.totalInterest());
                    break;
                case "3":
                    // Calculator Three
                    PresentValue presentValue = new PresentValue();
                    System.out.println(presentValue.presentValAnnuity());
                    break;
            }
        } while (choice.equals("1") || choice.equals("2") || choice.equals("3"));
        System.out.println("Thank you for using the Financial Calculator System!");
    }
}