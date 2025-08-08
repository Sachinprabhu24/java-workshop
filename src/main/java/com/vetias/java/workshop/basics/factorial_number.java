package com.vetias.java.workshop.basics;
import java.util.Scanner;

public class factorial_number {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial:");
        int number = input.nextInt();
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= number; ++i) {
                factorial *= i;
            }
            System.out.println("Factorial of " + number + " is " + factorial);
        }
    }
}
