package com.vetias.java.workshop.tempdata;

import java.time.LocalDate;

import com.vetias.java.workshop.tempdata.beans.Organization;

public class Tempdata {
    public static void main(String[] args) {
        Organization VET = new Organization("Vellalar Educational Trust",  "www.vet.ac.in" ,
         "vellalartrust85@gmail.com" , "+91 96857 42135",
         45446L,
         "A trust for educational development", LocalDate.of(1985,6,25));
        System.out.println(VET);
        System.out.println(VET.Name());
    }
}