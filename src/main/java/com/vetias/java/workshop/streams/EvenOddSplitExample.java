package com.vetias.java.workshop.streams;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddSplitExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,13,19,3,43,21,34);
        Map <Boolean, List<Integer>> separateMap = numbers.stream()
        .collect(Collectors.partitioningBy(n -> n%2 == 0));
        System.out.println("Even numbers: "+separateMap.get(true));
        System.out.println("Odd numbers: "+separateMap.get(false));
    }
}
