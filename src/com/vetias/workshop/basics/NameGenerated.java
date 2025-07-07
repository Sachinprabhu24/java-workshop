

import java.util.Scanner;

public class NameGenerated{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String Name = scanner.nextLine();
        System.out.println("Enter your Gender: ");
        String gender= scanner.nextLine();
        System.out.println("Enter your Qualification: ");
        String qualification= scanner.nextLine();
        StringBuilder sb= new StringBuilder();

        if ("Male".equalsIgnoreCase(gender)){
            sb.append("Mr.");
            sb.append(Name);
            sb.append(",");
            sb.append(qualification);
            String result=sb.toString();
            System.out.println(result);
        }
        else {
            sb.append("Mrs.");
            sb.append(Name);
            sb.append(",");
            sb.append(qualification);
            String result=sb.toString();
            System.out.println(result);
        }
    }
}
