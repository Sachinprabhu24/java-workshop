package com.vetias.java.workshop.basics;

public class Decendingorder {
    public static void main(String[] args) {
        String[] items = {"Item1", "Item2", "Item3"};
        double[] prices = {10.99, 20.49, 5.75};

        System.out.println("Descending Order Pricelist:");
        for (int i = items.length - 1; i >= 0; i--) {
            System.out.printf("%s: $%.2f%n", items[i], prices[i]);
        }
    }
}
