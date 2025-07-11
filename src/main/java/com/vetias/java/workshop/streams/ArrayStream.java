package com.vetias.java.workshop.streams;

import java.util.Arrays;

public class ArrayStream {
    public static void main(String[] args) {
        int[] marks = {90,56,78,46,32};
        long numberOfSubjectsPassed=Arrays.stream(marks).filter(mark -> mark > 40).count();
        System.out.println(numberOfSubjectsPassed);

    }
}