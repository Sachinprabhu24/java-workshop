package com.vetias.java.workshop.streams;

import java.util.ArrayList;
import java.util.List;

public class FloatMapExample {
    public static void main(String[]args){
        List<String> CSnames= new ArrayList<>();
        CSnames.add("Sachin");
        CSnames.add("Prabhu");
        CSnames.add("Logeshwaran");
        CSnames.add("Sanjay");
        CSnames.add("Mithun");
        System.out.println(CSnames);
        CSnames.stream()
        .filter(name -> name.startsWith("S")||name.startsWith("s"))
        .distinct().map(String::toUpperCase)
        .forEach(System.out::println);


        List<String> CSAnames= new ArrayList<>();
    }
}
