package com.ps;

import java.util.Scanner;

public class FutureValue {
    float deposit;
    float interestPercent;
    float interestDecimal;
    float numYears;
    FutureValue(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the value of your one time deposit: $");
        this.deposit = scanner.nextFloat();
        System.out.print("Now, please enter the interest rate on this deposit: %");
        this.interestPercent = scanner.nextFloat();
        this.interestDecimal = this.interestPercent/100;
        System.out.print("Finally, please enter the number of years of accrual: ");
        this.numYears = scanner.nextInt();
        scanner.close();
    }

}
