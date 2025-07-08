import java.time.LocalDate;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[]args){
        Scanner inputscanner=new Scanner(System.in);
        System.out.println("Enter your Birth year:");
        int birthyear=inputscanner.nextInt();
        int currentyear=LocalDate.now().getYear();
        int age=currentyear-birthyear;
        System.out.println("Your age is: " + age);
    }
}
