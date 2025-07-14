package com.vetias.java.workshop.basics;

public class Ascendingorder {
    public static void main(String[] args) {
        // Example usage of the Ascendingorder class
        String[] items = {"Item1", "Item2", "Item3"};
        double[] prices = {10.99, 20.49, 5.75};

        System.out.println("Ascending Order Pricelist:");
        for (int i = 0; i < items.length; i++) {
            System.out.printf("%s: $%.2f%n", items[i], prices[i]);
        }
    }
}