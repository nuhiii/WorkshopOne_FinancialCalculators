package com.ps;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FutureValue {
    float deposit;
    float interestPercent;
    float interestDecimal;
    int numYears;
    final double daysInYear = 365;
    FutureValue() {
        // Receive user input data
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Please enter the value of your one time deposit: $");
            this.deposit = scanner.nextFloat();
        }
        catch(Exception e){
            System.out.println("Please enter a valid number!");
        }
        try {
            System.out.print("Now, please enter the interest rate on this deposit: %");
            this.interestPercent = scanner.nextFloat();
            this.interestDecimal = this.interestPercent / 100;
        }
        catch(Exception e){
            System.out.println("Please enter a valid number!");
        }
        try {
            System.out.print("Finally, please enter the number of years of accrual: ");
            this.numYears = scanner.nextInt();
        }
        catch(Exception e){
            System.out.println("Please enter a valid integer!");
        }
    }
    // Calculate future value given initial deposit
    public double futureValAmount() {
        return deposit * Math.pow((1 + (interestDecimal / daysInYear)), (daysInYear * numYears));
    }
    // Calculate total interest earned over given time period
    public double totalInterest() {
        return futureValAmount() - deposit;
    }
    // Print the results in a formatted manner
    public String printMessage(){
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        return String.format("If you deposit $" + formatter.format(deposit) + " in a CD that earns " + interestPercent + "%% interest and matures in " + numYears + " years, " +
                "your CD's ending balance will be $" + formatter.format(futureValAmount()) + " and you would have earned $" + formatter.format(totalInterest()) + " in interest.");
    }
}
