package com.vetias.java.workshop.collections;
public class StudentMark {
    private static final String marks = null;

    public static void main(String[]args){
        String markstring="33 45 78 90 98 89";
        String[] markArray = markstring.split(" ");
        int HighMark=0;
        for ( String mark : markArray){
            int mark =Integer.parseInt(marks);
            if (mark> HighMark){
                HighMark=mark;
            }
        }   
        System.out.println("Highest mark: "+HighMark);     
    }
}
