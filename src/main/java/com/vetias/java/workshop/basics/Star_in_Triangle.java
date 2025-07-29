package com.vetias.java.workshop.basics;

public class Star_in_Triangle {
    public static void main(String[] args) {
        int n = 5; 
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
