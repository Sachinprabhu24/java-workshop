

import java.util.Scanner;

public class NameGenerated{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String Name = scanner.nextLine();
        System.out.println("Enter your Gender: ");
        String gender= scanner.nextLine();
        System.out.println("Enter your Qualification: ");
        String qualification= scanner.nextLine();
        StringBuilder sb= new StringBuilder();
        String prefix = null;

        if ("Male".equalsIgnoreCase(gender)){
            prefix = "Mr.";
        } else if ("Female".equalsIgnoreCase(gender)) {
            prefix = "Mrs.";
        } else {
            throw new Exception("Invalid Gender");
        }
        sb.append(prefix).append(Name).append(", ").append(qualification);
        System.out.println(sb.toString());
    }
}
