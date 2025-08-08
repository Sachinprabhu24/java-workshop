package com.vetias.java.workshop.basics;
import java.util.Scanner;

public class number_odd_or_even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check if it is odd or even:");
        int number = input.nextInt();
        if(number % 2 == 0 && number >= 0){
            System.out.println(number+" is a even number.");
        } else if( number % 2 != 0 && number >= 0){
            System.out.println(number+" is a odd number.");
        }else{
            System.out.println("Please enter a valid number.");
        }
    }
}
