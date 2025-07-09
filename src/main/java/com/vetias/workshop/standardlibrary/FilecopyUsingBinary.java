package main.com.vetias.workshop.standardlibrary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilecopyUsingBinary {
    public static void main(String[] args) {
        try(FileInputStream InputStream=new FileInputStream("nature.jpg");FileOutputStream OutputStream=new FileOutputStream("outputtt.jpg") ){
            byte[] chunk = new byte[1024];
            int byteRead;
            while((byteRead= InputStream.read(chunk))!=-1){
                
                OutputStream.write(chunk, 0, byteRead);
            }

        }catch(IOException e){
            System.err.println("Error reading or writing the file.");
        }
    }
}
