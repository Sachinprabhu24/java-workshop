package com.vetias.java.workshop.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FloatMapExample {
    public static void main(String[]args){
        List<String> CSnames= Arrays.asList("Sachin","Vasanthan","Logeshwaran","Sachin Prabhu","Mithun","Bharanitharan");
        List<String> CSAnames= Arrays.asList("Ranjith","Ibrahim","Navin","Gowtham","Gokul","Rahul");
        List<String> Allnames = Stream.concat(CSnames.stream(),CSAnames.stream()).sorted().toList();
        System.out.println(Allnames);
    }
}
