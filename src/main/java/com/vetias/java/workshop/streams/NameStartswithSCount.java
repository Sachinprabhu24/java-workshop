package com.vetias.java.workshop.streams;
import java.util.ArrayList;
import java.util.List;
public class NameStartswithSCount {
    public static void main(String[]args){
        List<String> names= new ArrayList<>();
        names.add("Sachin");
        names.add("Prabhu");
        names.add("Logeshwaran");
        names.add("Sanjay");
        long nameCount = names.stream().filter(name -> name.startsWith("S")).count();
        System.out.println(nameCount);
    }
}
