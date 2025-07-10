package com.vetias.java.workshop.basics.files;
import java.io.File;

public class FileHandling {
    public static void main(String[]args){
        File file=new File("src");
        if (file.exists()){
            System.out.println("File exists at:"+file.getAbsolutePath());
        }
        else{
            System.out.println("File does not exist.");
        }
        if(file.isDirectory()){
            System.out.println("It is a directory.");
            String[] files=file.list();
            if(files!=null){
                System.out.println("Files in the directory:");
                for(String f: files){
                    System.out.println(f);
                }
            }else{
                System.out.println("The directory is empty.");
            }
        }else{
            System.out.println("It is not a directory.");
        }
    }
    
}
