package com.vetias.java.workshop.basics;

import java.time.LocalDateTime;

public class DateFormat {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        String formattedDate = currentDateTime.toString();
        System.out.println("Current Date and Time in ISO-8601 format: " + formattedDate);
    }
}