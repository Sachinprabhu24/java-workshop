package com.vetias.java.workshop.basics;

public class fibonacci {
    public static void main(String[] args) {
        for(int i=0;i<50;i++){
            int result = fibonacci(i);
            System.out.println("Fibonacci number at position " + i + " is " + result);
        }
    }

    public static int fibonacci(int i) {
        if (i <= 1) {
            return i;
        }
        return fibonacci(i - 1) + fibonacci(i - 2);
    }
}
