package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mary Brashear
 */
import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        //declare variables
        double princ, rate, years, times, end;
        Scanner sc = new Scanner(System.in);

        //get user input
        System.out.println("What is the principal amount? ");
        princ = sc.nextDouble();
        System.out.println("What is the rate?");
        rate = sc.nextDouble();
        System.out.println("What is the number of years?");
        years = sc.nextDouble();
        System.out.println("What is the number of times the interest is compounded per year?");
        times = sc.nextDouble();

        //implement power feature for calculations
        double a = ((1 + ((rate / 100) / times))), b = (times * years);
        end = princ * Math.pow(a, b);
        end = Math.round(end*100.0)/100.0;
        princ = Math.round(princ*100.0)/100.0;

        //print out findings
        System.out.println("$" + princ + " invested at " + rate + "% for " + (int) years +  " years compounded " + (int)times  + " times per year is $" + end + ".");

        sc.close();
    }
}