package com.vetias.java.workshop.basics;

public class Calculator {
    public static int divide(int a,int b){
        try {
            if(b==0){
                throw new ArithmeticException("Division by zero is no valid.");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        return a/b;
        
    }
    public static void main(String[] args) {
        int a=5,b=0;
        System.out.println("Addition:"+(a+b));
        System.out.println("Subraction:"+(a-b));
        System.out.println("Multiplication:"+(a*b));
        System.out.println("Division:"+(a/b));
    }
}
