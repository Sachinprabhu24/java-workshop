package com.vetias.java.workshop.streams;

import java.util.ArrayList;
import java.util.List;

public class CapitalizedLetter {
    public static void main(String[]args){
        List<String> names= new ArrayList<>();
        names.add("Sachin");
        names.add("Prabhu");
        names.add("Logeshwaran");
        names.add("Sanjay");
        names.add("Mithun");
        System.out.println(names);
        names.stream()
        .filter(name -> name.startsWith("S")||name.startsWith("s"))
        .distinct().map(String::toUpperCase)
        .forEach(System.out::println);

        
    }
}
