package com.vetias.java.workshop.collections;
import java.util.HashMap;
import java.util.Map;

public class StudentMap {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1001,"Logesh");
        students.put(1002,"sachin");
        students.put(1003,"Mithun");
        students.put(1004,"Abullaize");
        System.out.println(students);
        System.out.println(students.keySet());
        System.out.println(students.values());
    }
}
