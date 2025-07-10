package com.vetias.java.workshop.collections;
import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Sachin");
        names.add("Prabhu");
        names.add("Logesh");
        names.add("Waran");
        
        System.out.println(names);
        names.set(1,"Teldulkar");
        for (int i=0;i<names.size();i++){
            System.out.println(names.get(i));
        }
    }
}
