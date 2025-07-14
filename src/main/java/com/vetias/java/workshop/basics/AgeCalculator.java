package com.vetias.java.workshop.basics;

import java.time.LocalDate;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[]args){
        Scanner inputscanner=new Scanner(System.in);
        System.out.println("Enter your Birth year(YYYY-MM-DD):");
        String birthdate=inputscanner.nextLine();
        LocalDate YearBirth= LocalDate.parse(birthdate);
        int YearOfBirth=YearBirth.getYear();
        int currentyear=LocalDate.now().getYear();
        System.out.println("Your age is: " + (currentyear-YearOfBirth));
    }
}
