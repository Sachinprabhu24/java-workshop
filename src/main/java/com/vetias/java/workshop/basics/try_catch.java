package com.vetias.java.workshop.basics;
import java.util.Scanner;

public class try_catch {
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number: ");
            int n1 = sc.nextInt();
            System.out.println("Enter second number: ");
            int n2 = sc.nextInt();
            int result = n1 / n2;
            System.out.println("Result: " + result);  
        } catch (Exception e) {
            System.out.println("Cannot Divide by Zero");
        } 
    }
}
