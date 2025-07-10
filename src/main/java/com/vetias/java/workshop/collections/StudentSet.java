package com.vetias.java.workshop.collections;
import java.util.HashSet;
import java.util.Set;

public class StudentSet {
    public static void main(String[]args){
        Set<Integer> rollNo = new HashSet<>();
        rollNo.add(1001);
        rollNo.add(1202);
        rollNo.add(1012);
        rollNo.add(1102);
        rollNo.add(1201);
        System.out.println(rollNo);
    }
}
