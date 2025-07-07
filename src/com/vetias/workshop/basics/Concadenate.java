public class Concadenate {
    public static void main(String[] args) {
        String firstName = "Sachin";
        String lastName = " Prabhu";

        String fullName = firstName.concat(lastName);
        System.out.println("Full Name using + operator: " + fullName);

        System.out.println(fullName.toUpperCase());
    }
}
