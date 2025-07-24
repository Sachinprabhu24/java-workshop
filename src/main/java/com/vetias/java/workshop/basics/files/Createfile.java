package com.vetias.java.workshop.basics.files;

import java.io.File;
import java.io.IOException;

public class Createfile {
    public static void main(String[] args) {
        try {
            if(new File("output.txt").createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}

