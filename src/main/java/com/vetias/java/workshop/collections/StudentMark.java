package com.vetias.java.workshop.collections;
public class StudentMark {

    public static void main(String[]args){
        String markstring="33 45 78 90 98 89";
        String[] markArray = markstring.split(" ");
        int HighMark=0;
        for ( String marks : markArray){
            int mark =Integer.parseInt(marks);
            if (mark> HighMark){
                HighMark=mark;
            }
        }   
        System.out.println("Highest mark: "+HighMark);     
    }
}
